package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsCrookedLinesOptions extends js.Object {
  var crooked3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked3Options] = js.native
  var crooked5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked5Options] = js.native
  var elliott3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott3Options] = js.native
  var elliott5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott5Options] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
}

object StockToolsGuiDefinitionsCrookedLinesOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsCrookedLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsCrookedLinesOptionsOps[Self <: StockToolsGuiDefinitionsCrookedLinesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrooked3(value: StockToolsGuiDefinitionsCrookedLinesCrooked3Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(js.undefined)
        ret
    }
    @scala.inline
    def withCrooked5(value: StockToolsGuiDefinitionsCrookedLinesCrooked5Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott3(value: StockToolsGuiDefinitionsCrookedLinesElliott3Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott5(value: StockToolsGuiDefinitionsCrookedLinesElliott5Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(js.undefined)
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
  }
  
}

