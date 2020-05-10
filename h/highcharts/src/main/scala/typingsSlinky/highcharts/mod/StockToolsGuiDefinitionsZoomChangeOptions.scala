package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsZoomChangeOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var zoomX: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXOptions] = js.native
  var zoomXY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXYOptions] = js.native
  var zoomY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomYOptions] = js.native
}

object StockToolsGuiDefinitionsZoomChangeOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsZoomChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsZoomChangeOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsZoomChangeOptionsOps[Self <: StockToolsGuiDefinitionsZoomChangeOptions] (val x: Self) extends AnyVal {
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
    def withZoomX(value: StockToolsGuiDefinitionsZoomChangeZoomXOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomX")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomXY(value: StockToolsGuiDefinitionsZoomChangeZoomXYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomXY")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomY(value: StockToolsGuiDefinitionsZoomChangeZoomYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomY")(js.undefined)
        ret
    }
  }
  
}

