package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsLinesOptions extends js.Object {
  var arrowLine: js.UndefOr[StockToolsGuiDefinitionsLinesArrowLineOptions] = js.native
  var arrowRay: js.UndefOr[StockToolsGuiDefinitionsLinesArrowRayOptions] = js.native
  var arrowSegment: js.UndefOr[StockToolsGuiDefinitionsLinesArrowSegmentOptions] = js.native
  var horizontalLine: js.UndefOr[StockToolsGuiDefinitionsLinesHorizontalLineOptions] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var line: js.UndefOr[StockToolsGuiDefinitionsLinesLineOptions] = js.native
  var ray: js.UndefOr[StockToolsGuiDefinitionsLinesRayOptions] = js.native
  var segment: js.UndefOr[StockToolsGuiDefinitionsLinesSegmentOptions] = js.native
  var verticalLine: js.UndefOr[StockToolsGuiDefinitionsLinesVerticalLineOptions] = js.native
}

object StockToolsGuiDefinitionsLinesOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsLinesOptionsOps[Self <: StockToolsGuiDefinitionsLinesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowLine(value: StockToolsGuiDefinitionsLinesArrowLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLine")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRay(value: StockToolsGuiDefinitionsLinesArrowRayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowSegment(value: StockToolsGuiDefinitionsLinesArrowSegmentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLine(value: StockToolsGuiDefinitionsLinesHorizontalLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: StockToolsGuiDefinitionsLinesLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withRay(value: StockToolsGuiDefinitionsLinesRayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: StockToolsGuiDefinitionsLinesSegmentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: StockToolsGuiDefinitionsLinesVerticalLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
        ret
    }
  }
  
}

