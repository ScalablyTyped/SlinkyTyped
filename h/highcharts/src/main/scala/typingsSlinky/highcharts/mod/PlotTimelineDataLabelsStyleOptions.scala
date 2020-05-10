package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTimelineDataLabelsStyleOptions extends js.Object {
  var fontSize: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var textOutline: js.UndefOr[String] = js.native
}

object PlotTimelineDataLabelsStyleOptions {
  @scala.inline
  def apply(): PlotTimelineDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTimelineDataLabelsStyleOptions]
  }
  @scala.inline
  implicit class PlotTimelineDataLabelsStyleOptionsOps[Self <: PlotTimelineDataLabelsStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOutline")(js.undefined)
        ret
    }
  }
  
}

