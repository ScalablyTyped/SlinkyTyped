package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultWorkflowOperations extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
  def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): ISignatureSettings = js.native
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): ISignatureSettings = js.native
  def GetWorkflowAdmin(WorkflowID: Double): IWorkflowAdmin = js.native
  def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): IWorkflow = js.native
  def GetWorkflowIDByAlias(Alias: String): Double = js.native
  def GetWorkflowIDByGUID(WorkflowGUID: String): Double = js.native
  def GetWorkflowStateIDByAlias(Alias: String): Double = js.native
  def GetWorkflowStateIDByGUID(StateGUID: String): Double = js.native
  def GetWorkflowStateTransitionIDByAlias(Alias: String): Double = js.native
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Double = js.native
  def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): IStateTransitionsForClient = js.native
  def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): String = js.native
  def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient = js.native
  def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): IStates = js.native
  def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates = js.native
  def GetWorkflowsAdmin(): IWorkflowsAdmin = js.native
  def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): IValueListItems = js.native
  def GetWorkflowsForClient(UpdateFromServer: Boolean): IWorkflows = js.native
  def RemoveWorkflowAdmin(WorkflowID: Double): Unit = js.native
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
}

object IVaultWorkflowOperations {
  @scala.inline
  def apply(
    AddWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin,
    GetStateTransitionSignatureSettings: (Double, Double) => ISignatureSettings,
    GetStateTransitionSignatureSettingsByID: Double => ISignatureSettings,
    GetWorkflowAdmin: Double => IWorkflowAdmin,
    GetWorkflowForClient: (Double, Boolean) => IWorkflow,
    GetWorkflowIDByAlias: String => Double,
    GetWorkflowIDByGUID: String => Double,
    GetWorkflowStateIDByAlias: String => Double,
    GetWorkflowStateIDByGUID: String => Double,
    GetWorkflowStateTransitionIDByAlias: String => Double,
    GetWorkflowStateTransitionIDByGUID: String => Double,
    GetWorkflowStateTransitions: (Double, ITypedValue) => IStateTransitionsForClient,
    GetWorkflowStateTransitionsAsJSON: (Double, ITypedValue, IObjVer) => String,
    GetWorkflowStateTransitionsEx: (Double, ITypedValue, IObjVer) => IStateTransitionsForClient,
    GetWorkflowStates: (Double, ITypedValue) => IStates,
    GetWorkflowStatesEx: (Double, ITypedValue, IObjVer) => IStates,
    GetWorkflowsAdmin: () => IWorkflowsAdmin,
    GetWorkflowsAsValueListItems: Boolean => IValueListItems,
    GetWorkflowsForClient: Boolean => IWorkflows,
    RemoveWorkflowAdmin: Double => Unit,
    UpdateWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal(AddWorkflowAdmin = js.Any.fromFunction1(AddWorkflowAdmin), GetStateTransitionSignatureSettings = js.Any.fromFunction2(GetStateTransitionSignatureSettings), GetStateTransitionSignatureSettingsByID = js.Any.fromFunction1(GetStateTransitionSignatureSettingsByID), GetWorkflowAdmin = js.Any.fromFunction1(GetWorkflowAdmin), GetWorkflowForClient = js.Any.fromFunction2(GetWorkflowForClient), GetWorkflowIDByAlias = js.Any.fromFunction1(GetWorkflowIDByAlias), GetWorkflowIDByGUID = js.Any.fromFunction1(GetWorkflowIDByGUID), GetWorkflowStateIDByAlias = js.Any.fromFunction1(GetWorkflowStateIDByAlias), GetWorkflowStateIDByGUID = js.Any.fromFunction1(GetWorkflowStateIDByGUID), GetWorkflowStateTransitionIDByAlias = js.Any.fromFunction1(GetWorkflowStateTransitionIDByAlias), GetWorkflowStateTransitionIDByGUID = js.Any.fromFunction1(GetWorkflowStateTransitionIDByGUID), GetWorkflowStateTransitions = js.Any.fromFunction2(GetWorkflowStateTransitions), GetWorkflowStateTransitionsAsJSON = js.Any.fromFunction3(GetWorkflowStateTransitionsAsJSON), GetWorkflowStateTransitionsEx = js.Any.fromFunction3(GetWorkflowStateTransitionsEx), GetWorkflowStates = js.Any.fromFunction2(GetWorkflowStates), GetWorkflowStatesEx = js.Any.fromFunction3(GetWorkflowStatesEx), GetWorkflowsAdmin = js.Any.fromFunction0(GetWorkflowsAdmin), GetWorkflowsAsValueListItems = js.Any.fromFunction1(GetWorkflowsAsValueListItems), GetWorkflowsForClient = js.Any.fromFunction1(GetWorkflowsForClient), RemoveWorkflowAdmin = js.Any.fromFunction1(RemoveWorkflowAdmin), UpdateWorkflowAdmin = js.Any.fromFunction1(UpdateWorkflowAdmin))
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
  @scala.inline
  implicit class IVaultWorkflowOperationsOps[Self <: IVaultWorkflowOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddWorkflowAdmin(value: IWorkflowAdmin => IWorkflowAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddWorkflowAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStateTransitionSignatureSettings(value: (Double, Double) => ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStateTransitionSignatureSettings")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetStateTransitionSignatureSettingsByID(value: Double => ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStateTransitionSignatureSettingsByID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowAdmin(value: Double => IWorkflowAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowForClient(value: (Double, Boolean) => IWorkflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowForClient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetWorkflowIDByAlias(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowIDByAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowIDByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowIDByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateIDByAlias(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateIDByAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateIDByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateIDByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateTransitionIDByAlias(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateTransitionIDByAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateTransitionIDByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateTransitionIDByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateTransitions(value: (Double, ITypedValue) => IStateTransitionsForClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateTransitions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateTransitionsAsJSON(value: (Double, ITypedValue, IObjVer) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateTransitionsAsJSON")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStateTransitionsEx(value: (Double, ITypedValue, IObjVer) => IStateTransitionsForClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStateTransitionsEx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStates(value: (Double, ITypedValue) => IStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetWorkflowStatesEx(value: (Double, ITypedValue, IObjVer) => IStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowStatesEx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWorkflowsAdmin(value: () => IWorkflowsAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowsAdmin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorkflowsAsValueListItems(value: Boolean => IValueListItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowsAsValueListItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowsForClient(value: Boolean => IWorkflows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowsForClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveWorkflowAdmin(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveWorkflowAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateWorkflowAdmin(value: IWorkflowAdmin => IWorkflowAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateWorkflowAdmin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

