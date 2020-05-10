package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.chart.series.ICartesian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarChart extends ICartesian {
  /** [Config Option] (Boolean) */
  var column: js.UndefOr[Boolean] = js.native
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var groupGutter: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var gutter: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Object) */
  var xPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Object) */
  var yPadding: js.UndefOr[js.Any] = js.native
}

object IBarChart {
  @scala.inline
  def apply(): IBarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChart]
  }
  @scala.inline
  implicit class IBarChartOps[Self <: IBarChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
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
    def withGroupGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(js.undefined)
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
    def withXPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withYPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPadding")(js.undefined)
        ret
    }
  }
  
}

