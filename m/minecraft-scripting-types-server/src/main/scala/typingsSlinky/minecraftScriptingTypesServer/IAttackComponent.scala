package typingsSlinky.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
  */
@js.native
trait IAttackComponent extends js.Object {
  /**
    * Range of the random amount of damage the melee attack deals. A negative value can heal the entity instead of hurting it
    */
  var damage: AnonRangemax = js.native
}

object IAttackComponent {
  @scala.inline
  def apply(damage: AnonRangemax): IAttackComponent = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttackComponent]
  }
  @scala.inline
  implicit class IAttackComponentOps[Self <: IAttackComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamage(value: AnonRangemax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

