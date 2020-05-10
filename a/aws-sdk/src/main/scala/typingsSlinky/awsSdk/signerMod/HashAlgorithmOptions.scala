package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlgorithmOptions extends js.Object {
  /**
    * The set of accepted hash algorithms allowed in a code signing job.
    */
  var allowedValues: HashAlgorithms = js.native
  /**
    * The default hash algorithm that is used in a code signing job.
    */
  var defaultValue: HashAlgorithm = js.native
}

object HashAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmOptions]
  }
  @scala.inline
  implicit class HashAlgorithmOptionsOps[Self <: HashAlgorithmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: HashAlgorithms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: HashAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

