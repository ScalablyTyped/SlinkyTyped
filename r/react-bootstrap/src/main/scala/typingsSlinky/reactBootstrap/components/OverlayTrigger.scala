package typingsSlinky.reactBootstrap.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.overlayTriggerMod.OverlayTriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverlayTrigger {
  
  @JSImport("react-bootstrap", "OverlayTrigger")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.OverlayTrigger] {
    
    @scala.inline
    def animation(value: js.Any): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: js.Any): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerPadding(value: Double): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOverlayShown(value: Boolean): this.type = set("defaultOverlayShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayHide(value: Double): this.type = set("delayHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayShow(value: Double): this.type = set("delayShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: js.Function): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntered(value: js.Function): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntering(value: js.Function): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExit(value: js.Function): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExited(value: js.Function): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExiting(value: js.Function): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerVarargs(value: String*): this.type = set("trigger", js.Array(value :_*))
    
    @scala.inline
    def trigger(value: String | js.Array[String]): this.type = set("trigger", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayTriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(overlay: js.Any): Builder = {
    val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayTriggerProps]))
  }
}
