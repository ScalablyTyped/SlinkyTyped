package typingsSlinky.nukaCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nukaCarousel.mod.CarouselCellAlignProp
import typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
import typingsSlinky.nukaCarousel.mod.CarouselSlidesToScrollProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PagingDots {
  @JSImport("nuka-carousel", "PagingDots")
  @js.native
  object component extends js.Object
  
  def withProps(p: CarouselSlideRenderControlProps): Default[tag.type, typingsSlinky.nukaCarousel.mod.PagingDots] = new Default[tag.type, typingsSlinky.nukaCarousel.mod.PagingDots](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    cellSpacing: Double,
    currentSlide: Double,
    frameWidth: Double,
    goToSlide: Double => Unit,
    nextSlide: () => Unit,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    wrapAround: Boolean
  ): Default[tag.type, typingsSlinky.nukaCarousel.mod.PagingDots] = {
    val __props = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.nukaCarousel.mod.PagingDots](js.Array(this.component, __props.asInstanceOf[CarouselSlideRenderControlProps]))
  }
}

