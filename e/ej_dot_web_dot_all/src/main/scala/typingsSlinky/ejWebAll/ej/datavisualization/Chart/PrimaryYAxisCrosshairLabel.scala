package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisCrosshairLabel extends js.Object {
  /** Show/hides the crosshair label associated with this axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryYAxisCrosshairLabel {
  @scala.inline
  def apply(): PrimaryYAxisCrosshairLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisCrosshairLabel]
  }
  @scala.inline
  implicit class PrimaryYAxisCrosshairLabelOps[Self <: PrimaryYAxisCrosshairLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

