package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.ContainerProps
import typingsSlinky.reactNativeDialog.mod.reactNativeModalContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Container {
  @JSImport("react-native-dialog", "default.Container")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContainerProps with ViewProps with reactNativeModalContainerProps): `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.default.Container] = new `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.default.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Container.type): `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.default.Container] = new `SharedBuilder_<intersection>890884832`[typingsSlinky.reactNativeDialog.mod.default.Container](js.Array(this.component, js.Dictionary.empty))()
}

