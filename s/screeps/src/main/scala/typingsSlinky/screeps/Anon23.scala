package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon23 extends js.Object {
  var upgradeController: `2` = js.native
}

object Anon23 {
  @scala.inline
  def apply(upgradeController: `2`): Anon23 = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon23]
  }
  @scala.inline
  implicit class Anon23Ops[Self <: Anon23] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpgradeController(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeController")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

