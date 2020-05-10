package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.chart.axis.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxis extends IAbstract {
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[Double] = js.native
  /** [Method] Renders the axis into the screen and updates its position
  		* @param init Object
  		*/
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] Updates the title of this axis
  		* @param title String
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
}

object IAxis {
  @scala.inline
  def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDashSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawAxis(value: /* init */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGrid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDrawGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLabel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDrawLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

