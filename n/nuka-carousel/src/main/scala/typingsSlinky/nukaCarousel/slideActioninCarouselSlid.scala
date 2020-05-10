package typingsSlinky.nukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>} */
@js.native
trait slideActioninCarouselSlid extends js.Object {
  var firstSlide: js.UndefOr[js.Array[Double]] = js.native
  var lastSlide: js.UndefOr[js.Array[Double]] = js.native
  var nextSlide: js.UndefOr[js.Array[Double]] = js.native
  var pause: js.UndefOr[js.Array[Double]] = js.native
  var previousSlide: js.UndefOr[js.Array[Double]] = js.native
}

object slideActioninCarouselSlid {
  @scala.inline
  def apply(): slideActioninCarouselSlid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[slideActioninCarouselSlid]
  }
  @scala.inline
  implicit class slideActioninCarouselSlidOps[Self <: slideActioninCarouselSlid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstSlide(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSlide(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSlide(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSlide(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSlide")(js.undefined)
        ret
    }
  }
  
}

