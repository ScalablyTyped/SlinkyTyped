package typingsSlinky.reactAliceCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventObject extends js.Object {
  // indicator to control the visibility of navigation dots
  var isNextSlideDisabled: Boolean = js.native
  var isPrevSlideDisabled: Boolean = js.native
  var item: Double = js.native
  var itemsInSlide: Double = js.native
  var slide: Double = js.native
}

object EventObject {
  @scala.inline
  def apply(
    isNextSlideDisabled: Boolean,
    isPrevSlideDisabled: Boolean,
    item: Double,
    itemsInSlide: Double,
    slide: Double
  ): EventObject = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNextSlideDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNextSlideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrevSlideDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrevSlideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsInSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsInSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

