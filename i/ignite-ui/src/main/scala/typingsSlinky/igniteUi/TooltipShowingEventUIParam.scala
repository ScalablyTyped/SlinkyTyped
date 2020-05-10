package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipShowingEventUIParam extends js.Object {
  /**
  	 * Used to get item brush.
  	 */
  var actualItemBrush: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get series brush.
  	 */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to tooltip DOM element.
  	 */
  var element: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to current series item object.
  	 */
  var item: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.native
}

object TooltipShowingEventUIParam {
  @scala.inline
  def apply(): TooltipShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipShowingEventUIParam]
  }
  @scala.inline
  implicit class TooltipShowingEventUIParamOps[Self <: TooltipShowingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualItemBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualItemBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualItemBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualItemBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withActualSeriesBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualSeriesBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualSeriesBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualSeriesBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
  }
  
}

