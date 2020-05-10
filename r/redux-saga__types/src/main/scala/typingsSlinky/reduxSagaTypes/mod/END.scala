package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.reduxSagaTypes.reduxSagaTypesStrings.`@@redux-sagaSlashCHANNEL_END`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait END extends js.Object {
  var `type`: `@@redux-sagaSlashCHANNEL_END` = js.native
}

object END {
  @scala.inline
  def apply(`type`: `@@redux-sagaSlashCHANNEL_END`): END = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[END]
  }
  @scala.inline
  implicit class ENDOps[Self <: END] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `@@redux-sagaSlashCHANNEL_END`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

