package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesLabelsDistanceFromScale extends js.Object {
  /** Specifies the xDistanceFromScale of labels.
    * @Default {-10}
    */
  var x: js.UndefOr[Double] = js.native
  /** Specifies the yDistanceFromScale of labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}

object ScalesLabelsDistanceFromScale {
  @scala.inline
  def apply(): ScalesLabelsDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesLabelsDistanceFromScale]
  }
  @scala.inline
  implicit class ScalesLabelsDistanceFromScaleOps[Self <: ScalesLabelsDistanceFromScale] (val x: Self) extends AnyVal {
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

