package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttack extends js.Object {
  var attack: `2` = js.native
}

object AnonAttack {
  @scala.inline
  def apply(attack: `2`): AnonAttack = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttack]
  }
  @scala.inline
  implicit class AnonAttackOps[Self <: AnonAttack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

