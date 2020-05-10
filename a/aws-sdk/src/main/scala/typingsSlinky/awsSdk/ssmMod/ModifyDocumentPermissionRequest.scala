package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDocumentPermissionRequest extends js.Object {
  /**
    * The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or All.
    */
  var AccountIdsToAdd: js.UndefOr[AccountIdList] = js.native
  /**
    * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a group of account IDs or All. This action has a higher priority than AccountIdsToAdd. If you specify an account ID to add and the same ID to remove, the system removes access to the document.
    */
  var AccountIdsToRemove: js.UndefOr[AccountIdList] = js.native
  /**
    * The name of the document that you want to share.
    */
  var Name: DocumentName = js.native
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType = js.native
  /**
    * (Optional) The version of the document to share. If it's not specified, the system choose the Default version to share.
    */
  var SharedDocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SharedDocumentVersion] = js.native
}

object ModifyDocumentPermissionRequest {
  @scala.inline
  def apply(Name: DocumentName, PermissionType: DocumentPermissionType): ModifyDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDocumentPermissionRequest]
  }
  @scala.inline
  implicit class ModifyDocumentPermissionRequestOps[Self <: ModifyDocumentPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionType(value: DocumentPermissionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountIdsToAdd(value: AccountIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIdsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIdsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIdsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountIdsToRemove(value: AccountIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIdsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIdsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIdsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedDocumentVersion(value: SharedDocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDocumentVersion")(js.undefined)
        ret
    }
  }
  
}

