package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltip extends js.Object {
  var ignoreBounds: js.UndefOr[Boolean] = js.native
  var isHtml: js.UndefOr[Boolean] = js.native
  var showColorCode: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  var trigger: js.UndefOr[String] = js.native
}

object ChartTooltip {
  @scala.inline
  def apply(): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltip]
  }
  @scala.inline
  implicit class ChartTooltipOps[Self <: ChartTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColorCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

