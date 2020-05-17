package typingsSlinky.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Damage extends js.Object {
  var damage: Rank = js.native
  var support: Rank = js.native
  var tank: Rank = js.native
}

object Damage {
  @scala.inline
  def apply(damage: Rank, support: Rank, tank: Rank): Damage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damage]
  }
  @scala.inline
  implicit class DamageOps[Self <: Damage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamage(value: Rank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport(value: Rank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTank(value: Rank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

