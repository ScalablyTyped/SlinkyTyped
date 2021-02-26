package typingsSlinky.reactLazyload.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLazyload.mod.LazyLoadProps
import typingsSlinky.reactLazyload.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLazyload {
  
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debounce(value: Double | Boolean): this.type = set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double | js.Array[Double]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetVarargs(value: Double*): this.type = set("offset", js.Array(value :_*))
    
    @scala.inline
    def once(value: Boolean): this.type = set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventLoading(value: Boolean): this.type = set("preventLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resize(value: Boolean): this.type = set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollContainer(value: String | Element): this.type = set("scrollContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollContainerElement(value: Element): this.type = set("scrollContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def throttle(value: Double | Boolean): this.type = set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unmountIfInvisible(value: Boolean): this.type = set("unmountIfInvisible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactLazyload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LazyLoadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
