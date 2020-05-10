package typingsSlinky.pkijs

import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHmacHashAlgorithm extends js.Object {
  var hmacHashAlgorithm: js.UndefOr[String] = js.native
  var iterationCount: js.UndefOr[Double] = js.native
  var keyEncryptionAlgorithm: js.UndefOr[Algorithm] = js.native
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.native
  var keyIdentifier: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object AnonHmacHashAlgorithm {
  @scala.inline
  def apply(): AnonHmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHmacHashAlgorithm]
  }
  @scala.inline
  implicit class AnonHmacHashAlgorithmOps[Self <: AnonHmacHashAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHmacHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmacHashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmacHashAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmacHashAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncryptionAlgorithm(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncryptionAlgorithmParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorithmParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncryptionAlgorithmParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorithmParams")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyIdentifier(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIdentifier")(js.undefined)
        ret
    }
  }
  
}

