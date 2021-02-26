package typingsSlinky.reactAnimateOnScroll.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAnimateOnScroll.mod.ScrollAnimationProps
import typingsSlinky.reactAnimateOnScroll.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAnimateOnScroll {
  
  @JSImport("react-animate-on-scroll", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animateIn(value: String): this.type = set("animateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateOnce(value: Boolean): this.type = set("animateOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateOut(value: String): this.type = set("animateOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initiallyVisible(value: Boolean): this.type = set("initiallyVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableParentSelector(value: String): this.type = set("scrollableParentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactAnimateOnScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
