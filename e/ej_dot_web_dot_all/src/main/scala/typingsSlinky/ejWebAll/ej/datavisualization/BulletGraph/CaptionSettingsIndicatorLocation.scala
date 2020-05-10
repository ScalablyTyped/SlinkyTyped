package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsIndicatorLocation extends js.Object {
  /** Specifies the horizontal position of the indicator.
    * @Default {10}
    */
  var x: js.UndefOr[Double] = js.native
  /** Specifies the vertical position of the indicator.
    * @Default {60}
    */
  var y: js.UndefOr[Double] = js.native
}

object CaptionSettingsIndicatorLocation {
  @scala.inline
  def apply(): CaptionSettingsIndicatorLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicatorLocation]
  }
  @scala.inline
  implicit class CaptionSettingsIndicatorLocationOps[Self <: CaptionSettingsIndicatorLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

