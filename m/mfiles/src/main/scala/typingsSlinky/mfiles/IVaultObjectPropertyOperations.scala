package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import typingsSlinky.mfiles.MFiles.MFMetadataSyncFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectPropertyOperations extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties = js.native
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties = js.native
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList = js.native
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues = js.native
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String = js.native
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay = js.native
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues = js.native
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects = js.native
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue = js.native
  def GetVersionComment(ObjVer: IObjVer): IVersionComment = js.native
  def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments = js.native
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState = js.native
  def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties = js.native
  def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties = js.native
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties = js.native
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties = js.native
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties = js.native
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties = js.native
  def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
}

object IVaultObjectPropertyOperations {
  @scala.inline
  def apply(
    ApproveOrRejectAssignment: (IObjVer, Boolean) => IObjectVersionAndProperties,
    ApproveOrRejectAssignmentByUser: (IObjVer, Boolean, Double) => IObjectVersionAndProperties,
    CreatePropertiesFromFileInformation: IFileInformation => IPropertyValues,
    GenerateAutomaticPermissionsFromPropertyValues: IPropertyValues => IAccessControlList,
    GetProperties: (IObjVer, Boolean) => IPropertyValues,
    GetPropertiesAsXML: (IObjVer, Boolean) => String,
    GetPropertiesForDisplay: (IObjVer, Boolean) => IPropertyValuesForDisplay,
    GetPropertiesForMetadataSync: (IObjVer, MFMetadataSyncFormat) => INamedValues,
    GetPropertiesOfMultipleObjects: IObjVers => IPropertyValuesOfMultipleObjects,
    GetPropertiesWithIconClues: (IObjVer, Boolean) => IPropertyValuesWithIconClues,
    GetPropertiesWithIconCluesOfMultipleObjects: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects,
    GetProperty: (IObjVer, Double) => IPropertyValue,
    GetVersionComment: IObjVer => IVersionComment,
    GetVersionCommentHistory: IObjVer => IVersionComments,
    GetWorkflowState: (IObjVer, Boolean) => IObjectVersionWorkflowState,
    MarkAssignmentComplete: IObjVer => IObjectVersionAndProperties,
    MarkAssignmentCompleteByUser: (IObjVer, Double) => IObjectVersionAndProperties,
    RemoveProperty: (IObjVer, Double) => IObjectVersionAndProperties,
    SetAllProperties: (IObjVer, Boolean, IPropertyValues) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissions: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissionsEx: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetCreationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetLastModificationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetProperties: (IObjVer, IPropertyValues) => IObjectVersionAndProperties,
    SetPropertiesOfMultipleObjects: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects,
    SetPropertiesWithPermissions: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetPropertiesWithPermissionsEx: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetProperty: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetVersionComment: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetWorkflowState: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties,
    SetWorkflowStateEx: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties,
    SetWorkflowStateTransition: (IObjVer, Double, Double, String) => IObjectVersionAndProperties,
    SetWorkflowStateTransitionEx: (IObjVer, Double, Double, String, js.Any) => IObjectVersionAndProperties
  ): IVaultObjectPropertyOperations = {
    val __obj = js.Dynamic.literal(ApproveOrRejectAssignment = js.Any.fromFunction2(ApproveOrRejectAssignment), ApproveOrRejectAssignmentByUser = js.Any.fromFunction3(ApproveOrRejectAssignmentByUser), CreatePropertiesFromFileInformation = js.Any.fromFunction1(CreatePropertiesFromFileInformation), GenerateAutomaticPermissionsFromPropertyValues = js.Any.fromFunction1(GenerateAutomaticPermissionsFromPropertyValues), GetProperties = js.Any.fromFunction2(GetProperties), GetPropertiesAsXML = js.Any.fromFunction2(GetPropertiesAsXML), GetPropertiesForDisplay = js.Any.fromFunction2(GetPropertiesForDisplay), GetPropertiesForMetadataSync = js.Any.fromFunction2(GetPropertiesForMetadataSync), GetPropertiesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesOfMultipleObjects), GetPropertiesWithIconClues = js.Any.fromFunction2(GetPropertiesWithIconClues), GetPropertiesWithIconCluesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesWithIconCluesOfMultipleObjects), GetProperty = js.Any.fromFunction2(GetProperty), GetVersionComment = js.Any.fromFunction1(GetVersionComment), GetVersionCommentHistory = js.Any.fromFunction1(GetVersionCommentHistory), GetWorkflowState = js.Any.fromFunction2(GetWorkflowState), MarkAssignmentComplete = js.Any.fromFunction1(MarkAssignmentComplete), MarkAssignmentCompleteByUser = js.Any.fromFunction2(MarkAssignmentCompleteByUser), RemoveProperty = js.Any.fromFunction2(RemoveProperty), SetAllProperties = js.Any.fromFunction3(SetAllProperties), SetAllPropertiesWithPermissions = js.Any.fromFunction5(SetAllPropertiesWithPermissions), SetAllPropertiesWithPermissionsEx = js.Any.fromFunction6(SetAllPropertiesWithPermissionsEx), SetCreationInfoAdmin = js.Any.fromFunction5(SetCreationInfoAdmin), SetLastModificationInfoAdmin = js.Any.fromFunction5(SetLastModificationInfoAdmin), SetProperties = js.Any.fromFunction2(SetProperties), SetPropertiesOfMultipleObjects = js.Any.fromFunction1(SetPropertiesOfMultipleObjects), SetPropertiesWithPermissions = js.Any.fromFunction4(SetPropertiesWithPermissions), SetPropertiesWithPermissionsEx = js.Any.fromFunction5(SetPropertiesWithPermissionsEx), SetProperty = js.Any.fromFunction2(SetProperty), SetVersionComment = js.Any.fromFunction2(SetVersionComment), SetWorkflowState = js.Any.fromFunction2(SetWorkflowState), SetWorkflowStateEx = js.Any.fromFunction3(SetWorkflowStateEx), SetWorkflowStateTransition = js.Any.fromFunction4(SetWorkflowStateTransition), SetWorkflowStateTransitionEx = js.Any.fromFunction5(SetWorkflowStateTransitionEx))
    __obj.asInstanceOf[IVaultObjectPropertyOperations]
  }
  @scala.inline
  implicit class IVaultObjectPropertyOperationsOps[Self <: IVaultObjectPropertyOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveOrRejectAssignment(value: (IObjVer, Boolean) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveOrRejectAssignment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApproveOrRejectAssignmentByUser(value: (IObjVer, Boolean, Double) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveOrRejectAssignmentByUser")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreatePropertiesFromFileInformation(value: IFileInformation => IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatePropertiesFromFileInformation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateAutomaticPermissionsFromPropertyValues(value: IPropertyValues => IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateAutomaticPermissionsFromPropertyValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProperties(value: (IObjVer, Boolean) => IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetProperties")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertiesAsXML(value: (IObjVer, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesAsXML")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertiesForDisplay(value: (IObjVer, Boolean) => IPropertyValuesForDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesForDisplay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertiesForMetadataSync(value: (IObjVer, MFMetadataSyncFormat) => INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesForMetadataSync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertiesOfMultipleObjects(value: IObjVers => IPropertyValuesOfMultipleObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesOfMultipleObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPropertiesWithIconClues(value: (IObjVer, Boolean) => IPropertyValuesWithIconClues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesWithIconClues")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertiesWithIconCluesOfMultipleObjects(value: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPropertiesWithIconCluesOfMultipleObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProperty(value: (IObjVer, Double) => IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetVersionComment(value: IObjVer => IVersionComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVersionComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVersionCommentHistory(value: IObjVer => IVersionComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVersionCommentHistory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkflowState(value: (IObjVer, Boolean) => IObjectVersionWorkflowState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkflowState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMarkAssignmentComplete(value: IObjVer => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkAssignmentComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAssignmentCompleteByUser(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkAssignmentCompleteByUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveProperty(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAllProperties(value: (IObjVer, Boolean, IPropertyValues) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllProperties")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAllPropertiesWithPermissions(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllPropertiesWithPermissions")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetAllPropertiesWithPermissionsEx(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllPropertiesWithPermissionsEx")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withSetCreationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCreationInfoAdmin")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetLastModificationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLastModificationInfoAdmin")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetProperties(value: (IObjVer, IPropertyValues) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetProperties")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPropertiesOfMultipleObjects(value: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPropertiesOfMultipleObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPropertiesWithPermissions(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPropertiesWithPermissions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetPropertiesWithPermissionsEx(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPropertiesWithPermissionsEx")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetProperty(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVersionComment(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVersionComment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWorkflowState(value: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkflowState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWorkflowStateEx(value: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkflowStateEx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetWorkflowStateTransition(value: (IObjVer, Double, Double, String) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkflowStateTransition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetWorkflowStateTransitionEx(value: (IObjVer, Double, Double, String, js.Any) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkflowStateTransitionEx")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

