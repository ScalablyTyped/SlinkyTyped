package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server-stored device credential used for authentication.
  */
@js.native
trait SchemaDeviceCredential extends js.Object {
  /**
    * [Optional] The time at which this credential becomes invalid. This
    * credential will be ignored for new client authentication requests after
    * this timestamp; however, it will not be automatically deleted.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * A public key used to verify the signature of JSON Web Tokens (JWTs). When
    * adding a new device credential, either via device creation or via
    * modifications, this public key credential may be required to be signed by
    * one of the registry level certificates. More specifically, if the
    * registry contains at least one certificate, any new device credential
    * must be signed by one of the registry certificates. As a result, when the
    * registry contains certificates, only X.509 certificates are accepted as
    * device credentials. However, if the registry does not contain a
    * certificate, self-signed certificates and public keys will be accepted.
    * New device credentials must be different from every registry-level
    * certificate.
    */
  var publicKey: js.UndefOr[SchemaPublicKeyCredential] = js.native
}

object SchemaDeviceCredential {
  @scala.inline
  def apply(): SchemaDeviceCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCredential]
  }
  @scala.inline
  implicit class SchemaDeviceCredentialOps[Self <: SchemaDeviceCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: SchemaPublicKeyCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
  }
  
}

