package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILegend extends IBase {
  /** [Config Option] (String) */
  var boxFill: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var boxStroke: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var boxStrokeWidth: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var boxZIndex: js.UndefOr[Double] = js.native
  /** [Property] (Boolean) */
  var isVertical: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var itemSpacing: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var labelColor: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelFont: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var padding: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] toggle
  		* @param show Boolean Whether to show or hide the legend.
  		*/
  var toggle: js.UndefOr[js.Function1[/* show */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var update: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var visible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object ILegend {
  @scala.inline
  def apply(): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegend]
  }
  @scala.inline
  implicit class ILegendOps[Self <: ILegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFill")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxStrokeWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
    def withToggle(value: /* show */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

