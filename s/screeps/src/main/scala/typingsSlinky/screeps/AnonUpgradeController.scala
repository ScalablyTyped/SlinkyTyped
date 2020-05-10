package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`1.5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUpgradeController extends js.Object {
  var upgradeController: `1.5` = js.native
}

object AnonUpgradeController {
  @scala.inline
  def apply(upgradeController: `1.5`): AnonUpgradeController = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpgradeController]
  }
  @scala.inline
  implicit class AnonUpgradeControllerOps[Self <: AnonUpgradeController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpgradeController(value: `1.5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeController")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

