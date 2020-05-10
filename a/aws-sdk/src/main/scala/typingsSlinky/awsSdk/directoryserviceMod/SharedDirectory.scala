package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDirectory extends js.Object {
  /**
    * The date and time that the shared directory was created.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that the shared directory was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
    */
  var OwnerAccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ShareMethod] = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ShareStatus] = js.native
  /**
    * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
    */
  var SharedAccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}

object SharedDirectory {
  @scala.inline
  def apply(): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDirectory]
  }
  @scala.inline
  implicit class SharedDirectoryOps[Self <: SharedDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccountId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withShareMethod(value: ShareMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withShareNotes(value: Notes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withShareStatus(value: ShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedAccountId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryId")(js.undefined)
        ret
    }
  }
  
}

