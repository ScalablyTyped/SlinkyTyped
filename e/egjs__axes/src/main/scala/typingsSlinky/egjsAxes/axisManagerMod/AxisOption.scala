package typingsSlinky.egjsAxes.axisManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisOption extends js.Object {
  var bounce: js.UndefOr[Double | js.Array[Double]] = js.native
  var circular: js.UndefOr[Boolean | js.Array[Boolean]] = js.native
  var range: js.UndefOr[js.Array[Double]] = js.native
}

object AxisOption {
  @scala.inline
  def apply(): AxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisOption]
  }
  @scala.inline
  implicit class AxisOptionOps[Self <: AxisOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: Boolean | js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Array[Double]): Self = {
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
  }
  
}

