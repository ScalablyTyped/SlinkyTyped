package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeContextConsumer
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, Consumer] {
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

