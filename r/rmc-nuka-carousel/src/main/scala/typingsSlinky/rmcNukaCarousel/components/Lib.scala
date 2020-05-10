package typingsSlinky.rmcNukaCarousel.components

import typingsSlinky.rmcNukaCarousel.carouselMod.ICarouselProps
import typingsSlinky.rmcNukaCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rmc-nuka-carousel/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ICarouselProps): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Lib.type): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, js.Dictionary.empty))()
}

