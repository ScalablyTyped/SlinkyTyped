package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.anon.CellColor
import typingsSlinky.googleVisualization.anon.Colors
import typingsSlinky.googleVisualization.anon.IsHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarOptions extends js.Object {
  var calendar: CellColor = js.native
  var colorAxis: js.UndefOr[Colors] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var noDataPattern: js.UndefOr[js.Object] = js.native
  var tooltip: IsHtml = js.native
  var width: js.UndefOr[Double] = js.native
}

object CalendarOptions {
  @scala.inline
  def apply(calendar: CellColor, tooltip: IsHtml): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
  @scala.inline
  implicit class CalendarOptionsOps[Self <: CalendarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: CellColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: IsHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAxis(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(js.undefined)
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
    def withNoDataPattern(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

