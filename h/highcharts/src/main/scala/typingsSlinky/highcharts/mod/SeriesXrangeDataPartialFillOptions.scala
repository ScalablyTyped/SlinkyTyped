package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesXrangeDataPartialFillOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
    * filled. Values can be 0-1 and are converted to percentages in the default
    * data label formatter.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The fill color to be used for partial
    * fills. Defaults to a darker shade of the point color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
}

object SeriesXrangeDataPartialFillOptions {
  @scala.inline
  def apply(): SeriesXrangeDataPartialFillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesXrangeDataPartialFillOptions]
  }
  @scala.inline
  implicit class SeriesXrangeDataPartialFillOptionsOps[Self <: SeriesXrangeDataPartialFillOptions] (val x: Self) extends AnyVal {
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

