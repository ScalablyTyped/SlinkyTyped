package typingsSlinky.popmotion.decayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecayProps extends js.Object {
  var from: js.UndefOr[Double] = js.native
  var modifyTarget: js.UndefOr[ModifyTarget] = js.native
  var power: js.UndefOr[Double] = js.native
  var restDelta: js.UndefOr[Double] = js.native
  var timeConstant: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object DecayProps {
  @scala.inline
  def apply(): DecayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecayProps]
  }
  @scala.inline
  implicit class DecayPropsOps[Self <: DecayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyTarget(value: /* v */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(js.undefined)
        ret
    }
    @scala.inline
    def withRestDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeConstant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeConstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeConstant")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(js.undefined)
        ret
    }
  }
  
}

