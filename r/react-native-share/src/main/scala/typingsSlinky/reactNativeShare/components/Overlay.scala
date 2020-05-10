package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeShare.overlayMod.OverlayProps
import typingsSlinky.reactNativeShare.overlayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  @JSImport("react-native-share/Overlay", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: OverlayProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
}

