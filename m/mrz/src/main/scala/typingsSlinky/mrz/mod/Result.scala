package typingsSlinky.mrz.mod

import typingsSlinky.mrz.mrzStrings.FRENCH_NATIONAL_ID
import typingsSlinky.mrz.mrzStrings.SWISS_DRIVING_LICENSE
import typingsSlinky.mrz.mrzStrings.TD1
import typingsSlinky.mrz.mrzStrings.TD2
import typingsSlinky.mrz.mrzStrings.TD3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * Array of objects describing all parsed fields.
    */
  var details: js.Array[ResultDetails] = js.native
  /**
    * Object mapping field names to their respective value. The value is set to `null`
    * if it is invalid. The value may be different than the raw value. For example
    * `result.fields.sex` will be "male" when the raw value was "M".
    */
  var fields: ResultFields = js.native
  /**
    * String identifying the format of the parsed MRZ. Supported formats are:
    *
    * * TD1 (identity card with three MRZ lines)
    * * TD2 (identity card with two MRZ lines)
    * * TD3 (passport)
    * * SWISS_DRIVING_LICENSE
    * * FRENCH_NATIONAL_ID
    */
  var format: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID = js.native
  /** `true` if all fields are valid. `false` otherwise. */
  var valid: Boolean = js.native
}

object Result {
  @scala.inline
  def apply(
    details: js.Array[ResultDetails],
    fields: ResultFields,
    format: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID,
    valid: Boolean
  ): Result = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Array[ResultDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: ResultFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

