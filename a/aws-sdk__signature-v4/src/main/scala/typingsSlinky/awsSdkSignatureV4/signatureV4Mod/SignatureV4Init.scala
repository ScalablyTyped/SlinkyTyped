package typingsSlinky.awsSdkSignatureV4.signatureV4Mod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureV4Init extends js.Object {
  /**
    * Whether to calculate a checksum of the request body and include it as
    * either a request header (when signing) or as a query string parameter
    * (when presigning). This is required for AWS Glacier and Amazon S3 and optional for
    * every other AWS service as of late 2017.
    *
    * @default [true]
    */
  var applyChecksum: js.UndefOr[Boolean] = js.native
  /**
    * The credentials with which the request should be signed or a function
    * that returns a promise that will be resolved with credentials.
    */
  var credentials: Credentials | Provider[Credentials] = js.native
  /**
    * The region name or a function that returns a promise that will be
    * resolved with the region name.
    */
  var region: String | Provider[String] = js.native
  /**
    * The service signing name.
    */
  var service: String = js.native
  /**
    * A constructor function for a hash object that will calculate SHA-256 HMAC
    * checksums.
    */
  var sha256: js.UndefOr[HashConstructor] = js.native
  /**
    * Whether to uri-escape the request URI path as part of computing the
    * canonical request string. This is required for every AWS service, except
    * Amazon S3, as of late 2017.
    *
    * @default [true]
    */
  var uriEscapePath: js.UndefOr[Boolean] = js.native
}

object SignatureV4Init {
  @scala.inline
  def apply(
    credentials: Credentials | Provider[Credentials],
    region: String | Provider[String],
    service: String
  ): SignatureV4Init = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureV4Init]
  }
  @scala.inline
  implicit class SignatureV4InitOps[Self <: SignatureV4Init] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialsFunction0(value: () => js.Promise[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials | Provider[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionFunction0(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegion(value: String | Provider[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyChecksum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChecksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChecksum")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256(value: HashConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
    @scala.inline
    def withUriEscapePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriEscapePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriEscapePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriEscapePath")(js.undefined)
        ret
    }
  }
  
}

