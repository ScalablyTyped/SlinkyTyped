package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for parameter validation.
  */
@js.native
trait SchemaParameterValidation extends js.Object {
  /**
    * Validation based on regular expressions.
    */
  var regex: js.UndefOr[SchemaRegexValidation] = js.native
  /**
    * Validation based on a list of allowed values.
    */
  var values: js.UndefOr[SchemaValueValidation] = js.native
}

object SchemaParameterValidation {
  @scala.inline
  def apply(): SchemaParameterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterValidation]
  }
  @scala.inline
  implicit class SchemaParameterValidationOps[Self <: SchemaParameterValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegex(value: SchemaRegexValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: SchemaValueValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

