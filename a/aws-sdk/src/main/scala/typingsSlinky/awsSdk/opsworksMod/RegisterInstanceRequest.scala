package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceRequest extends js.Object {
  /**
    * The instance's hostname.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * An InstanceIdentity object that contains the instance's identity.
    */
  var InstanceIdentity: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.InstanceIdentity] = js.native
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  /**
    * The instance's public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
    */
  var RsaPublicKey: js.UndefOr[String] = js.native
  /**
    * The instances public RSA key fingerprint.
    */
  var RsaPublicKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The ID of the stack that the instance is to be registered with.
    */
  var StackId: String = js.native
}

object RegisterInstanceRequest {
  @scala.inline
  def apply(StackId: String): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
  @scala.inline
  implicit class RegisterInstanceRequestOps[Self <: RegisterInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIdentity(value: InstanceIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIp")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withRsaPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RsaPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRsaPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RsaPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRsaPublicKeyFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RsaPublicKeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRsaPublicKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RsaPublicKeyFingerprint")(js.undefined)
        ret
    }
  }
  
}

