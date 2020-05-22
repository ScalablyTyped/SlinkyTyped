package typingsSlinky.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacHashAlgorithm extends js.Object {
  var hmacHashAlgorithm: js.UndefOr[String] = js.undefined
  var iterationCount: js.UndefOr[Double] = js.undefined
  var keyEncryptionAlgorithm: js.UndefOr[org.scalajs.dom.crypto.Algorithm] = js.undefined
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.undefined
  var keyIdentifier: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}

object HmacHashAlgorithm {
  @scala.inline
  def apply(
    hmacHashAlgorithm: String = null,
    iterationCount: js.UndefOr[Double] = js.undefined,
    keyEncryptionAlgorithm: org.scalajs.dom.crypto.Algorithm = null,
    keyEncryptionAlgorithmParams: js.Any = null,
    keyIdentifier: js.typedarray.ArrayBuffer = null
  ): HmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (hmacHashAlgorithm != null) __obj.updateDynamic("hmacHashAlgorithm")(hmacHashAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationCount)) __obj.updateDynamic("iterationCount")(iterationCount.get.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithm != null) __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithmParams != null) __obj.updateDynamic("keyEncryptionAlgorithmParams")(keyEncryptionAlgorithmParams.asInstanceOf[js.Any])
    if (keyIdentifier != null) __obj.updateDynamic("keyIdentifier")(keyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacHashAlgorithm]
  }
}

