package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesIndicatorsTextLocation extends js.Object {
  /** Specifies the textLocation position in bar indicators
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.native
  /** Specifies the Y position in bar indicators
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}

object ScalesIndicatorsTextLocation {
  @scala.inline
  def apply(): ScalesIndicatorsTextLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesIndicatorsTextLocation]
  }
  @scala.inline
  implicit class ScalesIndicatorsTextLocationOps[Self <: ScalesIndicatorsTextLocation] (val x: Self) extends AnyVal {
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

