package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Legend class.
  */
@js.native
trait ASPxClientLegend extends ASPxClientWebChartElement {
  /**
    * Returns a collection of custom legend items of the legend.
    */
  var customItems: js.Array[ASPxClientCustomLegendItem] = js.native
  /**
    * Returns the name of the legend.
    */
  var name: String = js.native
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  var useCheckBoxes: Boolean = js.native
}

object ASPxClientLegend {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    customItems: js.Array[ASPxClientCustomLegendItem],
    name: String,
    useCheckBoxes: Boolean
  ): ASPxClientLegend = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], customItems = customItems.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], useCheckBoxes = useCheckBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLegend]
  }
  @scala.inline
  implicit class ASPxClientLegendOps[Self <: ASPxClientLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomItems(value: js.Array[ASPxClientCustomLegendItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCheckBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCheckBoxes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

