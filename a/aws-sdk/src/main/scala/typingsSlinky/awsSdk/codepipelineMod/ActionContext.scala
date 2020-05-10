package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContext extends js.Object {
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  /**
    * The name of the action in the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.native
}

object ActionContext {
  @scala.inline
  def apply(): ActionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionContext]
  }
  @scala.inline
  implicit class ActionContextOps[Self <: ActionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionExecutionId(value: ActionExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

