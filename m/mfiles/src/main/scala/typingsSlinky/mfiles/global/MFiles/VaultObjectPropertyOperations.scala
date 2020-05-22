package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAccessControlList
import typingsSlinky.mfiles.IFileInformation
import typingsSlinky.mfiles.INamedValues
import typingsSlinky.mfiles.IObjVer
import typingsSlinky.mfiles.IObjVers
import typingsSlinky.mfiles.IObjectVersionAndProperties
import typingsSlinky.mfiles.IObjectVersionAndPropertiesOfMultipleObjects
import typingsSlinky.mfiles.IObjectVersionWorkflowState
import typingsSlinky.mfiles.IPropertyValue
import typingsSlinky.mfiles.IPropertyValues
import typingsSlinky.mfiles.IPropertyValuesForDisplay
import typingsSlinky.mfiles.IPropertyValuesOfMultipleObjects
import typingsSlinky.mfiles.IPropertyValuesWithIconClues
import typingsSlinky.mfiles.IPropertyValuesWithIconCluesOfMultipleObjects
import typingsSlinky.mfiles.ISetPropertiesParamsOfMultipleObjects
import typingsSlinky.mfiles.ITypedValue
import typingsSlinky.mfiles.IVaultObjectPropertyOperations
import typingsSlinky.mfiles.IVersionComment
import typingsSlinky.mfiles.IVersionComments
import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import typingsSlinky.mfiles.MFiles.MFMetadataSyncFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultObjectPropertyOperations")
@js.native
class VaultObjectPropertyOperations () extends IVaultObjectPropertyOperations {
  /* CompleteClass */
  override def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues = js.native
  /* CompleteClass */
  override def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList = js.native
  /* CompleteClass */
  override def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues = js.native
  /* CompleteClass */
  override def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String = js.native
  /* CompleteClass */
  override def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay = js.native
  /* CompleteClass */
  override def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues = js.native
  /* CompleteClass */
  override def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects = js.native
  /* CompleteClass */
  override def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues = js.native
  /* CompleteClass */
  override def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  /* CompleteClass */
  override def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue = js.native
  /* CompleteClass */
  override def GetVersionComment(ObjVer: IObjVer): IVersionComment = js.native
  /* CompleteClass */
  override def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments = js.native
  /* CompleteClass */
  override def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState = js.native
  /* CompleteClass */
  override def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  /* CompleteClass */
  override def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
}

@JSGlobal("MFiles.VaultObjectPropertyOperations")
@js.native
object VaultObjectPropertyOperations extends Instantiable0[IVaultObjectPropertyOperations]

