package typingsSlinky.reactDashNativeDashDialog.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.TextProps
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewProps
import typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogMod.TitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Title
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogMod.default.Title
    ] {
  @JSImport("react-native-dialog", "default.Title")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TitleProps with ViewProps with TextProps
}

