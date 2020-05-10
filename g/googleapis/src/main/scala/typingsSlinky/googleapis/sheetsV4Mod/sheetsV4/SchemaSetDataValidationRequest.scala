package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets a data validation rule to every cell in the range. To clear validation
  * in a range, call this with no rule specified.
  */
@js.native
trait SchemaSetDataValidationRequest extends js.Object {
  /**
    * The range the data validation rule should apply to.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The data validation rule to set on each cell in the range, or empty to
    * clear the data validation in the range.
    */
  var rule: js.UndefOr[SchemaDataValidationRule] = js.native
}

object SchemaSetDataValidationRequest {
  @scala.inline
  def apply(): SchemaSetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetDataValidationRequest]
  }
  @scala.inline
  implicit class SchemaSetDataValidationRequestOps[Self <: SchemaSetDataValidationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: SchemaDataValidationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

