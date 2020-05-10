package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMBFileShareInfo extends js.Object {
  /**
    * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.native
  var Authentication: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Authentication] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var FileShareId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareId] = js.native
  var FileShareStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[FileShareUserList] = js.native
  /**
    * True to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.native
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  var LocationARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.LocationARN] = js.native
  var ObjectACL: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ObjectACL] = js.native
  /**
    * The file share path used by the SMB client to identify the mount point.
    */
  var Path: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Path] = js.native
  /**
    * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  var Role: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Role] = js.native
  /**
    * If this value is set to "true", indicates that ACL (access control list) is enabled on the SMB file share. If it is set to "false", it indicates that file and directory permissions are mapped to the POSIX permission. For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html in the Storage Gateway User Guide.
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.native
}

object SMBFileShareInfo {
  @scala.inline
  def apply(): SMBFileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMBFileShareInfo]
  }
  @scala.inline
  implicit class SMBFileShareInfoOps[Self <: SMBFileShareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminUserList(value: FileShareUserList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminUserList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminUserList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminUserList")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthentication(value: Authentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStorageClass(value: StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultStorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultStorageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFileShareARN(value: FileShareARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(js.undefined)
        ret
    }
    @scala.inline
    def withFileShareId(value: FileShareId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileShareStatus(value: FileShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGuessMIMETypeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuessMIMETypeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuessMIMETypeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuessMIMETypeEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidUserList(value: FileShareUserList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidUserList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidUserList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidUserList")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSEncrypted(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSKey(value: KMSKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationARN(value: LocationARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectACL(value: ObjectACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectACL")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPays")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withSMBACLEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBACLEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMBACLEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBACLEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUserList(value: FileShareUserList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUserList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUserList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUserList")(js.undefined)
        ret
    }
  }
  
}

