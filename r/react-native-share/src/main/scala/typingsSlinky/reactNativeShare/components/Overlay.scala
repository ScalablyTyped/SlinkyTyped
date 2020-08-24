package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeShare.overlayMod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  @JSImport("react-native-share", "Overlay")
  @js.native
  object component extends js.Object
  
  def withProps(p: OverlayProps): Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay] = new Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay] = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay](js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
}

