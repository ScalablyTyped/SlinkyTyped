package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultWorkflowOperations extends StObject {
  
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
  implicit class IVaultWorkflowOperationsMutableBuilder[Self <: IVaultWorkflowOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWorkflowAdmin(value: IWorkflowAdmin => IWorkflowAdmin): Self = StObject.set(x, "AddWorkflowAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStateTransitionSignatureSettings(value: (Double, Double) => ISignatureSettings): Self = StObject.set(x, "GetStateTransitionSignatureSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetStateTransitionSignatureSettingsByID(value: Double => ISignatureSettings): Self = StObject.set(x, "GetStateTransitionSignatureSettingsByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowAdmin(value: Double => IWorkflowAdmin): Self = StObject.set(x, "GetWorkflowAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowForClient(value: (Double, Boolean) => IWorkflow): Self = StObject.set(x, "GetWorkflowForClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWorkflowIDByAlias(value: String => Double): Self = StObject.set(x, "GetWorkflowIDByAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowIDByGUID(value: String => Double): Self = StObject.set(x, "GetWorkflowIDByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowStateIDByAlias(value: String => Double): Self = StObject.set(x, "GetWorkflowStateIDByAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowStateIDByGUID(value: String => Double): Self = StObject.set(x, "GetWorkflowStateIDByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowStateTransitionIDByAlias(value: String => Double): Self = StObject.set(x, "GetWorkflowStateTransitionIDByAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowStateTransitionIDByGUID(value: String => Double): Self = StObject.set(x, "GetWorkflowStateTransitionIDByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowStateTransitions(value: (Double, ITypedValue) => IStateTransitionsForClient): Self = StObject.set(x, "GetWorkflowStateTransitions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWorkflowStateTransitionsAsJSON(value: (Double, ITypedValue, IObjVer) => String): Self = StObject.set(x, "GetWorkflowStateTransitionsAsJSON", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWorkflowStateTransitionsEx(value: (Double, ITypedValue, IObjVer) => IStateTransitionsForClient): Self = StObject.set(x, "GetWorkflowStateTransitionsEx", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWorkflowStates(value: (Double, ITypedValue) => IStates): Self = StObject.set(x, "GetWorkflowStates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWorkflowStatesEx(value: (Double, ITypedValue, IObjVer) => IStates): Self = StObject.set(x, "GetWorkflowStatesEx", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWorkflowsAdmin(value: () => IWorkflowsAdmin): Self = StObject.set(x, "GetWorkflowsAdmin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorkflowsAsValueListItems(value: Boolean => IValueListItems): Self = StObject.set(x, "GetWorkflowsAsValueListItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkflowsForClient(value: Boolean => IWorkflows): Self = StObject.set(x, "GetWorkflowsForClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveWorkflowAdmin(value: Double => Unit): Self = StObject.set(x, "RemoveWorkflowAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateWorkflowAdmin(value: IWorkflowAdmin => IWorkflowAdmin): Self = StObject.set(x, "UpdateWorkflowAdmin", js.Any.fromFunction1(value))
  }
}
