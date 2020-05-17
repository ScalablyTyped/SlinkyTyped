package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.HeightNumber
import typingsSlinky.c3.anon.XShowBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubchartOptions extends js.Object {
  var axis: js.UndefOr[XShowBoolean] = js.native
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  /**
    * Show sub chart on the bottom of the chart.
    * Defaults to `false`.
    */
  var show: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[HeightNumber] = js.native
}

object SubchartOptions {
  @scala.inline
  def apply(): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubchartOptions]
  }
  @scala.inline
  implicit class SubchartOptionsOps[Self <: SubchartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: XShowBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbrush(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbrush")(js.undefined)
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
    @scala.inline
    def withSize(value: HeightNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

