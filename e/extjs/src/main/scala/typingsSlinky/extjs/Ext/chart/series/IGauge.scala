package typingsSlinky.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGauge extends ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var needle: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the Gauge chart to the current specified value
  		* @param value Object
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
}

object IGauge {
  @scala.inline
  def apply(): IGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGauge]
  }
  @scala.inline
  implicit class IGaugeOps[Self <: IGauge] (val x: Self) extends AnyVal {
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
    def withNeedle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
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
  }
  
}

