package typingsSlinky.samlp.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdPOptions extends js.Object {
  var RelayState: js.UndefOr[String] = js.native
  var audience: js.UndefOr[String] = js.native
  var authnContextClassRef: js.UndefOr[String] = js.native
  var cert: String | Buffer = js.native
  var destination: js.UndefOr[String] = js.native
  var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.native
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  var encryptionCert: js.UndefOr[String | Buffer] = js.native
  var encryptionPublicKey: js.UndefOr[String | Buffer] = js.native
  var getUserFromRequest: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], _]] = js.native
  var inResponseTo: js.UndefOr[String] = js.native
  var issuer: String = js.native
  var key: String | Buffer = js.native
  var keyEncryptionAlgorighm: js.UndefOr[String] = js.native
  var lifetimeInSeconds: js.UndefOr[Double] = js.native
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
  var recipient: js.UndefOr[String] = js.native
  var signResponse: js.UndefOr[Boolean] = js.native
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.native
  def getPostURL(
    audience: String,
    authnRequestDom: js.Any,
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Any, /* url */ String, Unit]
  ): Unit = js.native
}

object IdPOptions {
  @scala.inline
  def apply(
    cert: String | Buffer,
    getPostURL: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit,
    issuer: String,
    key: String | Buffer
  ): IdPOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], getPostURL = js.Any.fromFunction4(getPostURL), issuer = issuer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPOptions]
  }
  @scala.inline
  implicit class IdPOptionsOps[Self <: IdPOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPostURL(
      value: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPostURL")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelayState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelayState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelayState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelayState")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthnContextClassRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContextClassRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnContextClassRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContextClassRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDigestAlgorithm(value: DigestAlgorithmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionCert")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionPublicKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUserFromRequest(value: /* req */ Request_[ParamsDictionary, _, _, Query] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserFromRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetUserFromRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserFromRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withInResponseTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inResponseTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInResponseTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inResponseTo")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncryptionAlgorighm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorighm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncryptionAlgorighm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorighm")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetimeInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileMapper(value: ProfileMapperConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withSignResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: SignatureAlgorithmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
  }
  
}

