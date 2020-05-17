package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Carousel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.CarouselOptions> */
@js.native
trait PartialCarouselOptionsDist extends js.Object {
  var dist: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var indicators: js.UndefOr[Boolean] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var numVisible: js.UndefOr[Double] = js.native
  var onCycleTo: js.UndefOr[
    js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var shift: js.UndefOr[Double] = js.native
}

object PartialCarouselOptionsDist {
  @scala.inline
  def apply(): PartialCarouselOptionsDist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCarouselOptionsDist]
  }
  @scala.inline
  implicit class PartialCarouselOptionsDistOps[Self <: PartialCarouselOptionsDist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withNumVisible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCycleTo(value: js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCycleTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCycleTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCycleTo")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
  }
  
}

