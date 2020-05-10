package typingsSlinky.awsSdkMiddlewareRdsPresignedurl.mod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRDSPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder = js.native
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials] = js.native
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[HttpEndpoint] = js.native
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String] = js.native
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor = js.native
  /**
    * A special input parameter that can either be a name or ARN.
    * The middleware will determine whether to generate presigned URL
    * according to this parameter.
    */
  var sourceIdentifierKey: String = js.native
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder = js.native
}

object BuildRDSPresignedUrlParameters {
  @scala.inline
  def apply(
    base64Encoder: /* input */ js.typedarray.Uint8Array => String,
    credentials: () => js.Promise[Credentials],
    endpoint: () => js.Promise[HttpEndpoint],
    region: () => js.Promise[String],
    sha256: HashConstructor,
    sourceIdentifierKey: String,
    utf8Decoder: /* input */ String => js.typedarray.Uint8Array
  ): BuildRDSPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], sourceIdentifierKey = sourceIdentifierKey.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
    __obj.asInstanceOf[BuildRDSPresignedUrlParameters]
  }
  @scala.inline
  implicit class BuildRDSPresignedUrlParametersOps[Self <: BuildRDSPresignedUrlParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Encoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCredentials(value: () => js.Promise[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: () => js.Promise[HttpEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegion(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSha256(value: HashConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIdentifierKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIdentifierKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8Decoder")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

