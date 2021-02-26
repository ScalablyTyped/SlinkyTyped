package typingsSlinky.reactLazyLoadImageComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazyLoadImageComponent.mod.DelayMethod
import typingsSlinky.reactLazyLoadImageComponent.mod.LazyLoadComponentProps
import typingsSlinky.reactLazyLoadImageComponent.mod.ScrollPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyLoadComponent {
  
  @JSImport("react-lazy-load-image-component", "LazyLoadComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def afterLoad(value: () => _): this.type = set("afterLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def beforeLoad(value: () => _): this.type = set("beforeLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def delayMethod(value: DelayMethod): this.type = set("delayMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayTime(value: Double): this.type = set("delayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderNull: this.type = set("placeholder", null)
    
    @scala.inline
    def scrollPosition(value: ScrollPosition): this.type = set("scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useIntersectionObserver(value: Boolean): this.type = set("useIntersectionObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleByDefault(value: Boolean): this.type = set("visibleByDefault", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LazyLoadComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LazyLoadComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
