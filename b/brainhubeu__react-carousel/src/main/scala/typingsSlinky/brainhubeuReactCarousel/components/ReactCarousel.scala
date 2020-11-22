package typingsSlinky.brainhubeuReactCarousel.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.brainhubeuReactCarousel.anon.PickCarouselPropsExcludek
import typingsSlinky.brainhubeuReactCarousel.mod.CarouselPluginTypes
import typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps
import typingsSlinky.brainhubeuReactCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCarousel {
  
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animationSpeed(value: Double): this.type = set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakpoints(value: PickCarouselPropsExcludek): this.type = set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def pluginsVarargs(value: (String | CarouselPluginTypes)*): this.type = set("plugins", js.Array(value :_*))
    
    @scala.inline
    def plugins(value: js.Array[String | CarouselPluginTypes]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesVarargs(value: ReactElement*): this.type = set("slides", js.Array(value :_*))
    
    @scala.inline
    def slides(value: js.Array[ReactElement]): this.type = set("slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
