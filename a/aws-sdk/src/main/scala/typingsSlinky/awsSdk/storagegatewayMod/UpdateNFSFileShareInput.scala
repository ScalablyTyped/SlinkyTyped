package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNFSFileShareInput extends js.Object {
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks.
    */
  var ClientList: js.UndefOr[FileShareClientList] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  /**
    * The Amazon Resource Name (ARN) of the file share to be updated. 
    */
  var FileShareARN: typingsSlinky.awsSdk.storagegatewayMod.FileShareARN = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional. 
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The default values for the file share. Optional.
    */
  var NFSFileShareDefaults: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.native
  /**
    * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
    */
  var ObjectACL: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ObjectACL] = js.native
  /**
    * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * The user mapped to anonymous user. Valid options are the following:    RootSquash - Only root is mapped to anonymous user.    NoSquash - No one is mapped to anonymous user    AllSquash - Everyone is mapped to anonymous user.  
    */
  var Squash: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Squash] = js.native
}

object UpdateNFSFileShareInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN): UpdateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareInput]
  }
  @scala.inline
  implicit class UpdateNFSFileShareInputOps[Self <: UpdateNFSFileShareInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileShareARN(value: FileShareARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withKMSEncrypted(value: Boolean): Self = {
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
  }
  
}

