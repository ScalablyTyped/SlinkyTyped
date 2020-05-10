package typingsSlinky.inquirer

import typingsSlinky.inquirer.promptMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUi extends js.Object {
  var ui: ^ = js.native
}

object AnonUi {
  @scala.inline
  def apply(ui: ^): AnonUi = {
    val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUi]
  }
  @scala.inline
  implicit class AnonUiOps[Self <: AnonUi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUi(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

