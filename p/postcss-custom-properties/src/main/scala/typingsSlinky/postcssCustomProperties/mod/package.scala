package typingsSlinky.postcssCustomProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomPropertiesPlugin = typingsSlinky.postcss.mod.Plugin_[typingsSlinky.postcssCustomProperties.mod.Options] with typingsSlinky.postcssCustomProperties.AnonProcess
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ExportSources = java.lang.String | typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject | (js.Function1[
    /* customProperties */ typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject, 
    js.Any
  ]) | js.Promise[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject]
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ImportSources = java.lang.String | js.Function0[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject] | typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject | js.Promise[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject]
}
