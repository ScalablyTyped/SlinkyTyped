package typingsSlinky.atAwsDashSdkBuildDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildCustomizationMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atAwsDashSdkBuildDashTypes.buildTreeModelMod.TreeModel

  type ConfigurationDefinition = StringDictionary[ConfigurationPropertyDefinition]
  type CustomizationProvider = js.Function2[/* model */ TreeModel, /* target */ RuntimeTarget, ServiceCustomizationDefinition]
}
