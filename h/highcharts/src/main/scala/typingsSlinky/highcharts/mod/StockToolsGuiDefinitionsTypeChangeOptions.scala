package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsTypeChangeOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var typeCandlestick: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions] = js.native
  var typeLine: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeLineOptions] = js.native
  var typeOHLC: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions] = js.native
}

object StockToolsGuiDefinitionsTypeChangeOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsTypeChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsTypeChangeOptionsOps[Self <: StockToolsGuiDefinitionsTypeChangeOptions] (val x: Self) extends AnyVal {
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
    def withTypeCandlestick(value: StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCandlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCandlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeLine(value: StockToolsGuiDefinitionsTypeChangeTypeLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeOHLC(value: StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOHLC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeOHLC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOHLC")(js.undefined)
        ret
    }
  }
  
}

