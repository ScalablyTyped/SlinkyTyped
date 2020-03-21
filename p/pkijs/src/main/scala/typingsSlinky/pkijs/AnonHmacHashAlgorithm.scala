package typingsSlinky.pkijs

import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHmacHashAlgorithm extends js.Object {
  var hmacHashAlgorithm: js.UndefOr[String] = js.undefined
  var iterationCount: js.UndefOr[Double] = js.undefined
  var keyEncryptionAlgorithm: js.UndefOr[Algorithm] = js.undefined
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.undefined
  var keyIdentifier: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object AnonHmacHashAlgorithm {
  @scala.inline
  def apply(
    hmacHashAlgorithm: String = null,
    iterationCount: Int | Double = null,
    keyEncryptionAlgorithm: Algorithm = null,
    keyEncryptionAlgorithmParams: js.Any = null,
    keyIdentifier: scala.scalajs.js.typedarray.ArrayBuffer = null
  ): AnonHmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (hmacHashAlgorithm != null) __obj.updateDynamic("hmacHashAlgorithm")(hmacHashAlgorithm.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithm != null) __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithmParams != null) __obj.updateDynamic("keyEncryptionAlgorithmParams")(keyEncryptionAlgorithmParams.asInstanceOf[js.Any])
    if (keyIdentifier != null) __obj.updateDynamic("keyIdentifier")(keyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHmacHashAlgorithm]
  }
}

