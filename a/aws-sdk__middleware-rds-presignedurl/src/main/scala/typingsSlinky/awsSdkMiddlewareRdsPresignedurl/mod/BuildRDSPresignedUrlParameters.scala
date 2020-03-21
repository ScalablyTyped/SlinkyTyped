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

trait BuildRDSPresignedUrlParameters extends js.Object {
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials]
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[HttpEndpoint]
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String]
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor
  /**
    * A special input parameter that can either be a name or ARN.
    * The middleware will determine whether to generate presigned URL
    * according to this parameter.
    */
  var sourceIdentifierKey: String
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder
}

object BuildRDSPresignedUrlParameters {
  @scala.inline
  def apply(
    base64Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => String,
    credentials: () => js.Promise[Credentials],
    endpoint: () => js.Promise[HttpEndpoint],
    region: () => js.Promise[String],
    sha256: HashConstructor,
    sourceIdentifierKey: String,
    utf8Decoder: /* input */ String => scala.scalajs.js.typedarray.Uint8Array
  ): BuildRDSPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], sourceIdentifierKey = sourceIdentifierKey.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
  
    __obj.asInstanceOf[BuildRDSPresignedUrlParameters]
  }
}

