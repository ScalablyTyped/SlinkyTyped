package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScriptInput extends js.Object {
  /**
    * A unique identifier for a Realtime script to delete. You can use either the script ID or ARN value.
    */
  var ScriptId: typingsSlinky.awsSdk.gameliftMod.ScriptId = js.native
}

object DeleteScriptInput {
  @scala.inline
  def apply(ScriptId: ScriptId): DeleteScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScriptInput]
  }
  @scala.inline
  implicit class DeleteScriptInputOps[Self <: DeleteScriptInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

