package typingsSlinky.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeOptions extends InitOptions {
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[Double] = js.native
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[js.Date] = js.native
  /**
  			 * Name of the items to represent in the calendar.
  			 * First index is singular form, and the second index, the plural form.
  			 */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[String] = js.native
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[Double] = js.native
}

object RuntimeOptions {
  @scala.inline
  def apply(
    domainMargin: js.Array[Double],
    highlight: js.Array[js.Date],
    itemName: js.Array[String],
    legendMargin: js.Array[Double]
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal(domainMargin = domainMargin.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], legendMargin = legendMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeOptions]
  }
  @scala.inline
  implicit class RuntimeOptionsOps[Self <: RuntimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainMargin(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendMargin(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMargin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

