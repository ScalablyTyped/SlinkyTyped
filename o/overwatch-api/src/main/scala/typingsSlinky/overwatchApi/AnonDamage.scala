package typingsSlinky.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDamage extends js.Object {
  var damage: AnonRank = js.native
  var support: AnonRank = js.native
  var tank: AnonRank = js.native
}

object AnonDamage {
  @scala.inline
  def apply(damage: AnonRank, support: AnonRank, tank: AnonRank): AnonDamage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDamage]
  }
  @scala.inline
  implicit class AnonDamageOps[Self <: AnonDamage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamage(value: AnonRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport(value: AnonRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTank(value: AnonRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

