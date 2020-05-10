package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies adaptive layout options. */
@js.native
trait BaseChartAdaptiveLayout extends js.Object {
  /** Specifies the minimum container height at which the layout begins to adapt. */
  var height: js.UndefOr[Double] = js.native
  /** Specifies whether point labels should be kept when the widget adapts the layout. */
  var keepLabels: js.UndefOr[Boolean] = js.native
  /** Specifies the minimum container width at which the layout begins to adapt. */
  var width: js.UndefOr[Double] = js.native
}

object BaseChartAdaptiveLayout {
  @scala.inline
  def apply(): BaseChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartAdaptiveLayout]
  }
  @scala.inline
  implicit class BaseChartAdaptiveLayoutOps[Self <: BaseChartAdaptiveLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLabels")(js.undefined)
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

