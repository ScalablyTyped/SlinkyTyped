package typingsSlinky.reactVisibilitySensor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVisibilitySensor.anon.IsVisible
import typingsSlinky.reactVisibilitySensor.mod.Props
import typingsSlinky.reactVisibilitySensor.mod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactVisibilitySensor {
  
  @JSImport("react-visibility-sensor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactElement | (js.Function1[/* args */ IsVisible, ReactElement])): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* args */ IsVisible => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containment(value: js.Any): this.type = set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayedCall(value: Boolean): this.type = set("delayedCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intervalCheck(value: Boolean): this.type = set("intervalCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intervalDelay(value: Double): this.type = set("intervalDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minTopValue(value: Double): this.type = set("minTopValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Shape): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* isVisible */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def partialVisibility(value: Boolean): this.type = set("partialVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeCheck(value: Boolean): this.type = set("resizeCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeDelay(value: Double): this.type = set("resizeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeThrottle(value: Double): this.type = set("resizeThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollCheck(value: Boolean): this.type = set("scrollCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollDelay(value: Double): this.type = set("scrollDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollThrottle(value: Double): this.type = set("scrollThrottle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactVisibilitySensor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
