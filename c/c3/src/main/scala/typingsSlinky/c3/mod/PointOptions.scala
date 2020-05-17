package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.ExpandEnabled
import typingsSlinky.c3.anon.R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptions extends js.Object {
  var focus: js.UndefOr[ExpandEnabled] = js.native
  /**
    * The radius size of each point.
    * Defaults to `2.5`. If it's a function, will call for each point.
    */
  var r: js.UndefOr[Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])] = js.native
  var select: js.UndefOr[R] = js.native
  /**
    * How sensitive is each point to mouse cursor hover.
    * Defaults to `10`.
    */
  var sensitivity: js.UndefOr[Double] = js.native
  /**
    * Whether to show each point in line.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object PointOptions {
  @scala.inline
  def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  @scala.inline
  implicit class PointOptionsOps[Self <: PointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: ExpandEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withR(value: Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: R): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

