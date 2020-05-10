package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkflowAdmin extends js.Object {
  var Description: String = js.native
  var Permissions: IAccessControlList = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var StateTransitions: IStateTransitions = js.native
  var States: IStatesAdmin = js.native
  var Workflow: IWorkflow = js.native
  def Clone(): IWorkflowAdmin = js.native
}

object IWorkflowAdmin {
  @scala.inline
  def apply(
    Clone: () => IWorkflowAdmin,
    Description: String,
    Permissions: IAccessControlList,
    SemanticAliases: ISemanticAliases,
    StateTransitions: IStateTransitions,
    States: IStatesAdmin,
    Workflow: IWorkflow
  ): IWorkflowAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], StateTransitions = StateTransitions.asInstanceOf[js.Any], States = States.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAdmin]
  }
  @scala.inline
  implicit class IWorkflowAdminOps[Self <: IWorkflowAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IWorkflowAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateTransitions(value: IStateTransitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: IStatesAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("States")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow(value: IWorkflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

