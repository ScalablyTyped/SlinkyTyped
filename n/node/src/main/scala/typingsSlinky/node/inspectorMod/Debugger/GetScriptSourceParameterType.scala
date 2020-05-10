package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptSourceParameterType extends js.Object {
  /**
    * Id of the script to get source for.
    */
  var scriptId: ScriptId = js.native
}

object GetScriptSourceParameterType {
  @scala.inline
  def apply(scriptId: ScriptId): GetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceParameterType]
  }
  @scala.inline
  implicit class GetScriptSourceParameterTypeOps[Self <: GetScriptSourceParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

