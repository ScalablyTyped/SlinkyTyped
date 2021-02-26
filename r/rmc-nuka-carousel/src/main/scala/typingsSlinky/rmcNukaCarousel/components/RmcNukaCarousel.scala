package typingsSlinky.rmcNukaCarousel.components

import typingsSlinky.rmcNukaCarousel.carouselMod.ICarouselProps
import typingsSlinky.rmcNukaCarousel.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcNukaCarousel {
  
  @JSImport("rmc-nuka-carousel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RmcNukaCarousel.type): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICarouselProps): SharedBuilder_ICarouselProps_1051988952[default] = new SharedBuilder_ICarouselProps_1051988952[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
