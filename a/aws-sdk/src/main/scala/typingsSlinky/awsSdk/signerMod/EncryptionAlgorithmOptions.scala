package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAlgorithmOptions extends js.Object {
  /**
    * The set of accepted encryption algorithms that are allowed in a code signing job.
    */
  var allowedValues: EncryptionAlgorithms = js.native
  /**
    * The default encryption algorithm that is used by a code signing job.
    */
  var defaultValue: EncryptionAlgorithm = js.native
}

object EncryptionAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
  @scala.inline
  implicit class EncryptionAlgorithmOptionsOps[Self <: EncryptionAlgorithmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: EncryptionAlgorithms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: EncryptionAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

