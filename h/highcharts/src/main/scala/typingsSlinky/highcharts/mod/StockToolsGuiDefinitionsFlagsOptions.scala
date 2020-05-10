package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsFlagsOptions extends js.Object {
  var flagCirclepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagCirclepinOptions] = js.native
  var flagDiamondpin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions] = js.native
  var flagSimplepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSimplepinOptions] = js.native
  var flagSquarepin: js.UndefOr[StockToolsGuiDefinitionsFlagsFlagSquarepinOptions] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
}

object StockToolsGuiDefinitionsFlagsOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsFlagsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsFlagsOptionsOps[Self <: StockToolsGuiDefinitionsFlagsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlagCirclepin(value: StockToolsGuiDefinitionsFlagsFlagCirclepinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagCirclepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagCirclepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagCirclepin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagDiamondpin(value: StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagDiamondpin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagDiamondpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagDiamondpin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagSimplepin(value: StockToolsGuiDefinitionsFlagsFlagSimplepinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSimplepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagSimplepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSimplepin")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagSquarepin(value: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSquarepin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagSquarepin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagSquarepin")(js.undefined)
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

