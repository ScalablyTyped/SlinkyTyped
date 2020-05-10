package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevertVariableResponse extends js.Object {
  /**
    * Variable as it appears in the latest container version since the last workspace synchronization operation. If no variable is present, that means the
    * variable was deleted in the latest container version.
    */
  var variable: js.UndefOr[Variable] = js.native
}

object RevertVariableResponse {
  @scala.inline
  def apply(): RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertVariableResponse]
  }
  @scala.inline
  implicit class RevertVariableResponseOps[Self <: RevertVariableResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariable(value: Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

