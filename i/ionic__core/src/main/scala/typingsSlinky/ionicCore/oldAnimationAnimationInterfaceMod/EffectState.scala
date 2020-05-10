package typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectState extends js.Object {
  var effectUnit: String = js.native
  var num: Double = js.native
  var `val`: js.Any = js.native
}

object EffectState {
  @scala.inline
  def apply(effectUnit: String, num: Double, `val`: js.Any): EffectState = {
    val __obj = js.Dynamic.literal(effectUnit = effectUnit.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectState]
  }
  @scala.inline
  implicit class EffectStateOps[Self <: EffectState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

