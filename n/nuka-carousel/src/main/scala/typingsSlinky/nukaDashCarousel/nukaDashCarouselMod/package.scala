package typingsSlinky.nukaDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nukaDashCarouselMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import typingsSlinky.nukaDashCarousel.nukaDashCarouselStrings.auto

  type Carousel = ReactComponentClass[CarouselProps]
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, TagMod[Any]]
  type CarouselSlideWidthProp = String | Double
  type CarouselSlidesToScrollProp = Double | auto
  type NextButtonProps = CarouselSlideRenderControlProps
  type PagingDotsProps = CarouselSlideRenderControlProps
  type PreviousButtonProps = CarouselSlideRenderControlProps
}
