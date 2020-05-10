package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NFSFileShareInfo extends js.Object {
  var ClientList: js.UndefOr[FileShareClientList] = js.native
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
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.native
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  var LocationARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.LocationARN] = js.native
  var NFSFileShareDefaults: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.native
  var ObjectACL: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ObjectACL] = js.native
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
  var Squash: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Squash] = js.native
  /**
    * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
}

object NFSFileShareInfo {
  @scala.inline
  def apply(): NFSFileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareInfo]
  }
  @scala.inline
  implicit class NFSFileShareInfoOps[Self <: NFSFileShareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientList(value: FileShareClientList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientList")(js.undefined)
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
    def withNFSFileShareDefaults(value: NFSFileShareDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NFSFileShareDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNFSFileShareDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NFSFileShareDefaults")(js.undefined)
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
    def withSquash(value: Squash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Squash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Squash")(js.undefined)
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
  }
  
}

