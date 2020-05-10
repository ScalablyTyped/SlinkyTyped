package typingsSlinky.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEffect extends js.Object {
  var effect: js.Any = js.native
  var effectId: Double = js.native
  var label: js.UndefOr[String] = js.native
  var parentEffectId: Double = js.native
}

object AnonEffect {
  @scala.inline
  def apply(effect: js.Any, effectId: Double, parentEffectId: Double): AnonEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], parentEffectId = parentEffectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffect]
  }
  @scala.inline
  implicit class AnonEffectOps[Self <: AnonEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentEffectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEffectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

