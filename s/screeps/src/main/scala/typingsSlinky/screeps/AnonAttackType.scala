package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttackType extends js.Object {
  var attackType: EventAttackType = js.native
  var damage: Double = js.native
  var targetId: String = js.native
}

object AnonAttackType {
  @scala.inline
  def apply(attackType: EventAttackType, damage: Double, targetId: String): AnonAttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttackType]
  }
  @scala.inline
  implicit class AnonAttackTypeOps[Self <: AnonAttackType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackType(value: EventAttackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDamage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

