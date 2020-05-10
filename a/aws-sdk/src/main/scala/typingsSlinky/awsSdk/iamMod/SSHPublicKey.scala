package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHPublicKey extends js.Object {
  /**
    * The MD5 message digest of the SSH public key.
    */
  var Fingerprint: publicKeyFingerprintType = js.native
  /**
    * The SSH public key.
    */
  var SSHPublicKeyBody: publicKeyMaterialType = js.native
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType = js.native
}

object SSHPublicKey {
  @scala.inline
  def apply(
    Fingerprint: publicKeyFingerprintType,
    SSHPublicKeyBody: publicKeyMaterialType,
    SSHPublicKeyId: publicKeyIdType,
    Status: statusType,
    UserName: userNameType
  ): SSHPublicKey = {
    val __obj = js.Dynamic.literal(Fingerprint = Fingerprint.asInstanceOf[js.Any], SSHPublicKeyBody = SSHPublicKeyBody.asInstanceOf[js.Any], SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKey]
  }
  @scala.inline
  implicit class SSHPublicKeyOps[Self <: SSHPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: publicKeyFingerprintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSHPublicKeyBody(value: publicKeyMaterialType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSHPublicKeyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSHPublicKeyId(value: publicKeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSHPublicKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: statusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: userNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(js.undefined)
        ret
    }
  }
  
}

