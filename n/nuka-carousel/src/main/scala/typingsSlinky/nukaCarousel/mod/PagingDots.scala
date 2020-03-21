package typingsSlinky.nukaCarousel.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuka-carousel", "PagingDots")
@js.native
class PagingDots ()
  extends Component[PagingDotsProps, js.Object, js.Any] {
  def getButtonStyles(active: Boolean): typingsSlinky.react.mod.CSSProperties = js.native
  def getDotIndexes(
    slideCount: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    cellAlign: CarouselCellAlignProp
  ): js.Array[Double] = js.native
  def getListStyles(): typingsSlinky.react.mod.CSSProperties = js.native
}

