package typingsSlinky.postcssCustomProperties.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sources where Custom Properties can be imported from or export to,
  * which might be CSS, JS, and JSON files, functions, and directly passed objects
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function0[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject]
  - typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject
  - js.Promise[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject]
*/
trait ImportSources extends js.Object

object ImportSources {
  @scala.inline
  implicit def apply(value: CustomPropertiesObject): ImportSources = value.asInstanceOf[ImportSources]
  @scala.inline
  implicit def apply(value: js.Function0[CustomPropertiesObject]): ImportSources = value.asInstanceOf[ImportSources]
  @scala.inline
  implicit def apply(value: js.Promise[CustomPropertiesObject]): ImportSources = value.asInstanceOf[ImportSources]
  @scala.inline
  implicit def apply(value: String): ImportSources = value.asInstanceOf[ImportSources]
}

