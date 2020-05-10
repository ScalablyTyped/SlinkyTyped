package typingsSlinky.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScatter extends ICartesian {
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var markerConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
}

object IScatter {
  @scala.inline
  def apply(): IScatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScatter]
  }
  @scala.inline
  implicit class IScatterOps[Self <: IScatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMarkerConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerConfig")(js.undefined)
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

