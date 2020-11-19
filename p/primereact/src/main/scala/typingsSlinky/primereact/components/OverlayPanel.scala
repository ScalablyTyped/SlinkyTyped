package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.overlayPanelMod.OverlayPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverlayPanel {
  
  @JSImport("primereact/overlaypanel", "OverlayPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactOverlaypanelMod.OverlayPanel] {
    
    @scala.inline
    def appendTo(value: js.Any): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaCloseLabel(value: String): this.type = set("ariaCloseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissable(value: Boolean): this.type = set("dismissable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHide(value: () => Unit): this.type = set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def showCloseIcon(value: Boolean): this.type = set("showCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: OverlayPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
