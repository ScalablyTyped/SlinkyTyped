package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsVerticalLabelsOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var verticalArrow: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] = js.native
  var verticalCounter: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions] = js.native
  var verticalLabel: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions] = js.native
}

object StockToolsGuiDefinitionsVerticalLabelsOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsVerticalLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsVerticalLabelsOptionsOps[Self <: StockToolsGuiDefinitionsVerticalLabelsOptions] (val x: Self) extends AnyVal {
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
    def withVerticalArrow(value: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalCounter(value: StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLabel(value: StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(js.undefined)
        ret
    }
  }
  
}

