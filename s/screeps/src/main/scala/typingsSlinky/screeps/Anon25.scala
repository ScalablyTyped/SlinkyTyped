package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon25 extends js.Object {
  var attack: `4` = js.native
}

object Anon25 {
  @scala.inline
  def apply(attack: `4`): Anon25 = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon25]
  }
  @scala.inline
  implicit class Anon25Ops[Self <: Anon25] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

