package typingsSlinky.oakdexPokedex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jump extends js.Object {
  var jump: js.UndefOr[js.Array[Double]] = js.native
  var power: js.UndefOr[js.Array[Double]] = js.native
  var skill: js.UndefOr[js.Array[Double]] = js.native
  var speed: js.UndefOr[js.Array[Double]] = js.native
  var stamina: js.UndefOr[js.Array[Double]] = js.native
}

object Jump {
  @scala.inline
  def apply(): Jump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jump]
  }
  @scala.inline
  implicit class JumpOps[Self <: Jump] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJump(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump")(js.undefined)
        ret
    }
    @scala.inline
    def withPower(value: js.Array[Double]): Self = {
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
    def withSkill(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skill")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStamina(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStamina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamina")(js.undefined)
        ret
    }
  }
  
}

