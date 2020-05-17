package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRadius extends js.Object {
  var baseRadius: js.UndefOr[Double] = js.native
  var capSegments: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var heightSegments: js.UndefOr[Double] = js.native
  var peakRadius: js.UndefOr[Double] = js.native
}

object BaseRadius {
  @scala.inline
  def apply(): BaseRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRadius]
  }
  @scala.inline
  implicit class BaseRadiusOps[Self <: BaseRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCapSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakRadius")(js.undefined)
        ret
    }
  }
  
}

