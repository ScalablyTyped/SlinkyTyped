package typingsSlinky.reactDashNativeDashDialog.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewProps
import typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogMod.ContainerProps
import typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogMod.reactNativeModalContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object DialogContainer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogMod.Dialog.Container
    ] {
  @JSImport("react-native-dialog", "Dialog.Container")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ContainerProps with ViewProps with reactNativeModalContainerProps
}

