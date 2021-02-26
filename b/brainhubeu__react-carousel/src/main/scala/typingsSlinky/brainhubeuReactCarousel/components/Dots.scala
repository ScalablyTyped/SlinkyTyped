package typingsSlinky.brainhubeuReactCarousel.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.brainhubeuReactCarousel.mod.DotsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dots {
  
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.brainhubeuReactCarousel.mod.Dots] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def number(value: Double): this.type = set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnails(value: js.Array[ReactElement]): this.type = set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnailsVarargs(value: ReactElement*): this.type = set("thumbnails", js.Array(value :_*))
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dots.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DotsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
