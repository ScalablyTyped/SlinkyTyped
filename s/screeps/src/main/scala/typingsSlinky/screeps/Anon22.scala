package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`1.8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon22 extends js.Object {
  var upgradeController: `1.8` = js.native
}

object Anon22 {
  @scala.inline
  def apply(upgradeController: `1.8`): Anon22 = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon22]
  }
  @scala.inline
  implicit class Anon22Ops[Self <: Anon22] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpgradeController(value: `1.8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeController")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

