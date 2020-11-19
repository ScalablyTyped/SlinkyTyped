package typingsSlinky.rmcNukaCarousel.components

import typingsSlinky.rmcNukaCarousel.carouselMod.ICarouselProps
import typingsSlinky.rmcNukaCarousel.carouselMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("rmc-nuka-carousel/es/carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ICarouselProps): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Carousel.type): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, js.Dictionary.empty))()
}
