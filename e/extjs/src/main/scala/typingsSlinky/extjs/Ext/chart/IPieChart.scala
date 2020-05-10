package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPieChart extends ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.native
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Method] Un highlights the specified item
  		* @param item Object {Object} Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("unHighlightItem")
  var unHighlightItem_IPieChart: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
}

object IPieChart {
  @scala.inline
  def apply(): IPieChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChart]
  }
  @scala.inline
  implicit class IPieChartOps[Self <: IPieChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSet(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSet")(js.undefined)
        ret
    }
    @scala.inline
    def withDonut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawSeries(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDrawSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthField")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withXField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(js.undefined)
        ret
    }
  }
  
}

