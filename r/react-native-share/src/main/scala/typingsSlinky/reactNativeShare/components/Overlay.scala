package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeShare.overlayMod.OverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay] = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay](js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("react-native-share", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OverlayProps): Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay] = new Default[tag.type, typingsSlinky.reactNativeShare.mod.Overlay](js.Array(this.component, p.asInstanceOf[js.Any]))
}
