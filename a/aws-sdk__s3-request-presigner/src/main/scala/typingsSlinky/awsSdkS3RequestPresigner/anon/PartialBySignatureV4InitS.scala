package typingsSlinky.awsSdkS3RequestPresigner.anon

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @aws-sdk/s3-request-presigner.@aws-sdk/s3-request-presigner.PartialBy<@aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4Init & @aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4CryptoInit, 'service' | 'uriEscapePath'> */
trait PartialBySignatureV4InitS extends js.Object {
  var applyChecksum: js.UndefOr[Boolean] = js.undefined
  var credentials: Credentials | Provider[Credentials]
  var region: String | Provider[String]
  var service: js.UndefOr[String] = js.undefined
  var sha256: js.UndefOr[HashConstructor] = js.undefined
  var uriEscapePath: js.UndefOr[Boolean] = js.undefined
}

object PartialBySignatureV4InitS {
  @scala.inline
  def apply(
    credentials: Credentials | Provider[Credentials],
    region: String | Provider[String],
    applyChecksum: js.UndefOr[Boolean] = js.undefined,
    service: String = null,
    sha256: HashConstructor = null,
    uriEscapePath: js.UndefOr[Boolean] = js.undefined
  ): PartialBySignatureV4InitS = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (!js.isUndefined(applyChecksum)) __obj.updateDynamic("applyChecksum")(applyChecksum.get.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (!js.isUndefined(uriEscapePath)) __obj.updateDynamic("uriEscapePath")(uriEscapePath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBySignatureV4InitS]
  }
}

