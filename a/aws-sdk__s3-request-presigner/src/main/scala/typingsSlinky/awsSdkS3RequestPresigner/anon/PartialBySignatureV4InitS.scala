package typingsSlinky.awsSdkS3RequestPresigner.anon

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @aws-sdk/s3-request-presigner.@aws-sdk/s3-request-presigner.PartialBy<@aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4Init & @aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4CryptoInit, 'service' | 'uriEscapePath'> */
@js.native
trait PartialBySignatureV4InitS extends js.Object {
  var applyChecksum: js.UndefOr[Boolean] = js.native
  var credentials: Credentials | Provider[Credentials] = js.native
  var region: String | Provider[String] = js.native
  var service: js.UndefOr[String] = js.native
  var sha256: js.UndefOr[HashConstructor] = js.native
  var uriEscapePath: js.UndefOr[Boolean] = js.native
}

object PartialBySignatureV4InitS {
  @scala.inline
  def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): PartialBySignatureV4InitS = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBySignatureV4InitS]
  }
  @scala.inline
  implicit class PartialBySignatureV4InitSOps[Self <: PartialBySignatureV4InitS] (val x: Self) extends AnyVal {
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
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
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

