package typingsSlinky.reactNativePopupDialog.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativePopupDialog.mod.OverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @scala.inline
  def apply(onPress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("react-native-popup-dialog", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativePopupDialog.mod.Overlay] {
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: String): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOverlay(value: Boolean): this.type = set("showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
