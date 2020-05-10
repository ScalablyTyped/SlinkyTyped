package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisScrollbarSettings extends js.Object {
  /** Controls whether scrollbar has to be responsive in the chart.
    * @Default {false}
    */
  var canResize: js.UndefOr[Boolean] = js.native
  /** The maximum number of points to be displayed in the scrollbar.
    * @Default {null}
    */
  var pointsLength: js.UndefOr[Double] = js.native
  /** Options to customize the range for the scrollbar in the axis.
    */
  var range: js.UndefOr[PrimaryYAxisScrollbarSettingsRange] = js.native
  /** Specifies to enable or disable the scrollbar.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryYAxisScrollbarSettings {
  @scala.inline
  def apply(): PrimaryYAxisScrollbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisScrollbarSettings]
  }
  @scala.inline
  implicit class PrimaryYAxisScrollbarSettingsOps[Self <: PrimaryYAxisScrollbarSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: PrimaryYAxisScrollbarSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
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
  }
  
}

