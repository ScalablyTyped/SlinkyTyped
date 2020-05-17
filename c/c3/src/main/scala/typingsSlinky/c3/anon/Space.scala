package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Space extends js.Object {
  /**
    * Set space between bars in bar charts
    */
  var space: js.UndefOr[Double] = js.native
  /**
    * Change the width of bars. If ratio is specified, change the width of bar chart by ratio.
    */
  var width: js.UndefOr[Double | Ratio] = js.native
  /**
    * Set if min or max value will be 0 on bar chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.native
}

object Space {
  @scala.inline
  def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  @scala.inline
  implicit class SpaceOps[Self <: Space] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZerobased(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerobased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZerobased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerobased")(js.undefined)
        ret
    }
  }
  
}

