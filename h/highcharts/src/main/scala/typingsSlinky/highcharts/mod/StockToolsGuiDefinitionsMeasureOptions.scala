package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsMeasureOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var measureX: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXOptions] = js.native
  var measureXY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXYOptions] = js.native
  var measureY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureYOptions] = js.native
}

object StockToolsGuiDefinitionsMeasureOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsMeasureOptionsOps[Self <: StockToolsGuiDefinitionsMeasureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMeasureX(value: StockToolsGuiDefinitionsMeasureMeasureXOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureXY(value: StockToolsGuiDefinitionsMeasureMeasureXYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureY(value: StockToolsGuiDefinitionsMeasureMeasureYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(js.undefined)
        ret
    }
  }
  
}

