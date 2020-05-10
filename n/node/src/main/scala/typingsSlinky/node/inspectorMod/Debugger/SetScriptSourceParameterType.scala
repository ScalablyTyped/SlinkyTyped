package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetScriptSourceParameterType extends js.Object {
  /**
    *  If true the change will not actually be applied. Dry run may be used to get result description without actually modifying the code.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Id of the script to edit.
    */
  var scriptId: ScriptId = js.native
  /**
    * New content of the script.
    */
  var scriptSource: String = js.native
}

object SetScriptSourceParameterType {
  @scala.inline
  def apply(scriptId: ScriptId, scriptSource: String): SetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceParameterType]
  }
  @scala.inline
  implicit class SetScriptSourceParameterTypeOps[Self <: SetScriptSourceParameterType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withScriptSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
  }
  
}

