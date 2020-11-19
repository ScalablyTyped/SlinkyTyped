package typingsSlinky.reactVerticalTimelineComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTimelineElement {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentArrowStyle(value: CSSProperties): this.type = set("contentArrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def date(value: String): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateClassName(value: String): this.type = set("dateClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconClassName(value: String): this.type = set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconOnClick(value: () => Unit): this.type = set("iconOnClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intersectionObserverProps(value: js.Any): this.type = set("intersectionObserverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTimelineElementClick(value: () => Unit): this.type = set("onTimelineElementClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VerticalTimelineElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: VerticalTimelineElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
