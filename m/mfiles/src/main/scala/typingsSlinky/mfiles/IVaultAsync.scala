package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultAsync extends js.Object {
  val ClassGroupOperations: IVaultClassGroupOperationsAsync = js.native
  val ClassOperations: IVaultClassOperationsAsync = js.native
  val ClientOperations: IVaultClientOperationsAsync = js.native
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperationsAsync = js.native
  val DataSetOperations: IVaultDataSetOperationsAsync = js.native
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperationsAsync = js.native
  val EventLogOperations: IVaultEventLogOperationsAsync = js.native
  val ExtensionMethodOperations: IVaultExtensionMethodOperationsAsync = js.native
  val ExternalObjectOperations: IVaultExternalObjectOperationsAsync = js.native
  val LoginAccountOperations: IVaultLoginAccountOperationsAsync = js.native
  val ManagementOperations: IVaultManagementOperationsAsync = js.native
  val NamedACLOperations: IVaultNamedACLOperationsAsync = js.native
  val NamedValueStorageOperations: IVaultNamedValueStorageOperationsAsync = js.native
  val NotificationOperations: IVaultNotificationOperationsAsync = js.native
  val ObjectFileOperations: IVaultObjectFileOperationsAsync = js.native
  val ObjectOperations: IVaultObjectOperationsAsync = js.native
  val ObjectPropertyOperations: IVaultObjectPropertyOperationsAsync = js.native
  val ObjectSearchOperations: IVaultObjectSearchOperationsAsync = js.native
  val ObjectTypeOperations: IVaultObjectTypeOperationsAsync = js.native
  val PropertyDefOperations: IVaultPropertyDefOperationsAsync = js.native
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperationsAsync = js.native
  val ServerDataPushOperations: IVaultServerDataPushOperationsAsync = js.native
  val SharedLinkOperations: IVaultSharedLinkOperationsAsync = js.native
  val TraditionalFolderOperations: IVaultTraditionalFolderOperationsAsync = js.native
  val UserGroupOperations: IVaultUserGroupOperationsAsync = js.native
  val UserOperations: IVaultUserOperationsAsync = js.native
  val UserSettingOperations: IVaultUserSettingOperationsAsync = js.native
  val ValueListItemOperations: IVaultValueListItemOperationsAsync = js.native
  val ValueListOperations: IVaultValueListOperationsAsync = js.native
  val ViewOperations: IVaultViewOperationsAsync = js.native
  val WorkflowOperations: IVaultWorkflowOperationsAsync = js.native
}

object IVaultAsync {
  @scala.inline
  def apply(
    ClassGroupOperations: IVaultClassGroupOperationsAsync,
    ClassOperations: IVaultClassOperationsAsync,
    ClientOperations: IVaultClientOperationsAsync,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperationsAsync,
    DataSetOperations: IVaultDataSetOperationsAsync,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperationsAsync,
    EventLogOperations: IVaultEventLogOperationsAsync,
    ExtensionMethodOperations: IVaultExtensionMethodOperationsAsync,
    ExternalObjectOperations: IVaultExternalObjectOperationsAsync,
    LoginAccountOperations: IVaultLoginAccountOperationsAsync,
    ManagementOperations: IVaultManagementOperationsAsync,
    NamedACLOperations: IVaultNamedACLOperationsAsync,
    NamedValueStorageOperations: IVaultNamedValueStorageOperationsAsync,
    NotificationOperations: IVaultNotificationOperationsAsync,
    ObjectFileOperations: IVaultObjectFileOperationsAsync,
    ObjectOperations: IVaultObjectOperationsAsync,
    ObjectPropertyOperations: IVaultObjectPropertyOperationsAsync,
    ObjectSearchOperations: IVaultObjectSearchOperationsAsync,
    ObjectTypeOperations: IVaultObjectTypeOperationsAsync,
    PropertyDefOperations: IVaultPropertyDefOperationsAsync,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperationsAsync,
    ServerDataPushOperations: IVaultServerDataPushOperationsAsync,
    SharedLinkOperations: IVaultSharedLinkOperationsAsync,
    TraditionalFolderOperations: IVaultTraditionalFolderOperationsAsync,
    UserGroupOperations: IVaultUserGroupOperationsAsync,
    UserOperations: IVaultUserOperationsAsync,
    UserSettingOperations: IVaultUserSettingOperationsAsync,
    ValueListItemOperations: IVaultValueListItemOperationsAsync,
    ValueListOperations: IVaultValueListOperationsAsync,
    ViewOperations: IVaultViewOperationsAsync,
    WorkflowOperations: IVaultWorkflowOperationsAsync
  ): IVaultAsync = {
    val __obj = js.Dynamic.literal(ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultAsync]
  }
  @scala.inline
  implicit class IVaultAsyncOps[Self <: IVaultAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassGroupOperations(value: IVaultClassGroupOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassGroupOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassOperations(value: IVaultClassOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientOperations(value: IVaultClientOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomApplicationManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetOperations(value: IVaultDataSetOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectronicSignatureOperations(value: IVaultElectronicSignatureOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElectronicSignatureOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventLogOperations(value: IVaultEventLogOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventLogOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionMethodOperations(value: IVaultExtensionMethodOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionMethodOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalObjectOperations(value: IVaultExternalObjectOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalObjectOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginAccountOperations(value: IVaultLoginAccountOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginAccountOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagementOperations(value: IVaultManagementOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedACLOperations(value: IVaultNamedACLOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACLOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedValueStorageOperations(value: IVaultNamedValueStorageOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedValueStorageOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationOperations(value: IVaultNotificationOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectFileOperations(value: IVaultObjectFileOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFileOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectOperations(value: IVaultObjectOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectPropertyOperations(value: IVaultObjectPropertyOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPropertyOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectSearchOperations(value: IVaultObjectSearchOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectSearchOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeOperations(value: IVaultObjectTypeOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDefOperations(value: IVaultPropertyDefOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDefOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledJobManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerDataPushOperations(value: IVaultServerDataPushOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerDataPushOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedLinkOperations(value: IVaultSharedLinkOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedLinkOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraditionalFolderOperations(value: IVaultTraditionalFolderOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraditionalFolderOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserGroupOperations(value: IVaultUserGroupOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserGroupOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserOperations(value: IVaultUserOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettingOperations(value: IVaultUserSettingOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettingOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListItemOperations(value: IVaultValueListItemOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListItemOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListOperations(value: IVaultValueListOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewOperations(value: IVaultViewOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowOperations(value: IVaultWorkflowOperationsAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowOperations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

