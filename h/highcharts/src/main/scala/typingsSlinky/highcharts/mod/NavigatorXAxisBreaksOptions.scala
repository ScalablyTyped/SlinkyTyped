package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorXAxisBreaksOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) A number indicating how much space should
    * be left between the start and the end of the break. The break size is
    * given in axis units, so for instance on a `datetime` axis, a break size
    * of 3600000 would indicate the equivalent of an hour.
    */
  var breakSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The point where the break starts.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Defines an interval after which the break
    * appears again. By default the breaks do not repeat.
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The point where the break ends.
    */
  var to: js.UndefOr[Double] = js.native
}

object NavigatorXAxisBreaksOptions {
  @scala.inline
  def apply(): NavigatorXAxisBreaksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisBreaksOptions]
  }
  @scala.inline
  implicit class NavigatorXAxisBreaksOptionsOps[Self <: NavigatorXAxisBreaksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

