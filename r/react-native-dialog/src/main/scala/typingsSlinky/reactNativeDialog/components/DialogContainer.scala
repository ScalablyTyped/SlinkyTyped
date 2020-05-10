package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.ContainerProps
import typingsSlinky.reactNativeDialog.mod.reactNativeModalContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContainer {
  @JSImport("react-native-dialog", "Dialog.Container")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContainerProps with ViewProps with reactNativeModalContainerProps): `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.Dialog.Container] = new `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.Dialog.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogContainer.type): `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.Dialog.Container] = new `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.Dialog.Container](js.Array(this.component, js.Dictionary.empty))()
}

