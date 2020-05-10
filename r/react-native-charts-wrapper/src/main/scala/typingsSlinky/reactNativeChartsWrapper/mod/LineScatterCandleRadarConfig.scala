package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineScatterCandleRadarConfig extends js.Object {
  var drawHighlightIndicators: js.UndefOr[Boolean] = js.native
  var drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.native
  var drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.native
  var highlightLineWidth: js.UndefOr[Double] = js.native
}

object LineScatterCandleRadarConfig {
  @scala.inline
  def apply(): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
  @scala.inline
  implicit class LineScatterCandleRadarConfigOps[Self <: LineScatterCandleRadarConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawHighlightIndicators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHighlightIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawHighlightIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHighlightIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawHorizontalHighlightIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontalHighlightIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawHorizontalHighlightIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontalHighlightIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawVerticalHighlightIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawVerticalHighlightIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawVerticalHighlightIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawVerticalHighlightIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLineWidth")(js.undefined)
        ret
    }
  }
  
}

