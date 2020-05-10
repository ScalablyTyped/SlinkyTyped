package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesGanttDataCompletedOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The amount of the progress indicator,
    * ranging from 0 (not started) to 1 (finished).
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The fill of the progress indicator.
    * Defaults to a darkened variety of the main color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
}

object SeriesGanttDataCompletedOptions {
  @scala.inline
  def apply(): SeriesGanttDataCompletedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGanttDataCompletedOptions]
  }
  @scala.inline
  implicit class SeriesGanttDataCompletedOptionsOps[Self <: SeriesGanttDataCompletedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
  }
  
}

