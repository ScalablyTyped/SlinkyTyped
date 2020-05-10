package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`0.7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDamage extends js.Object {
  var damage: `0.7` = js.native
}

object AnonDamage {
  @scala.inline
  def apply(damage: `0.7`): AnonDamage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDamage]
  }
  @scala.inline
  implicit class AnonDamageOps[Self <: AnonDamage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamage(value: `0.7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

