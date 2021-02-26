package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.TargetHTMLElement
import typingsSlinky.primereact.tooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("primereact/tooltip", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTooltipMod.Tooltip] {
    
    @scala.inline
    def appendTo(value: js.Object): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def at(value: String): this.type = set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoZIndex(value: Boolean): this.type = set("autoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def event(value: String): this.type = set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideEvent(value: String): this.type = set("hideEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseTrack(value: Boolean): this.type = set("mouseTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseTrackLeft(value: Double): this.type = set("mouseTrackLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseTrackTop(value: Double): this.type = set("mouseTrackTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def my(value: String): this.type = set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeHide(value: /* e */ TargetHTMLElement => Unit): this.type = set("onBeforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeShow(value: /* e */ TargetHTMLElement => Unit): this.type = set("onBeforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHide(value: /* e */ TargetHTMLElement => Unit): this.type = set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onShow(value: /* e */ TargetHTMLElement => Unit): this.type = set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showEvent(value: String): this.type = set("showEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: js.Any): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
