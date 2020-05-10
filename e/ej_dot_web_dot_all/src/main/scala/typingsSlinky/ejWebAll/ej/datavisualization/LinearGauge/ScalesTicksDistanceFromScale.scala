package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesTicksDistanceFromScale extends js.Object {
  /** Specifies the xDistanceFromScale in the tick.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.native
  /** Specifies the yDistanceFromScale in the tick.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}

object ScalesTicksDistanceFromScale {
  @scala.inline
  def apply(): ScalesTicksDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesTicksDistanceFromScale]
  }
  @scala.inline
  implicit class ScalesTicksDistanceFromScaleOps[Self <: ScalesTicksDistanceFromScale] (val x: Self) extends AnyVal {
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

