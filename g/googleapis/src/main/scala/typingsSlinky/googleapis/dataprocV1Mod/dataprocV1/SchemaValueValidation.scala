package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validation based on a list of allowed values.
  */
@js.native
trait SchemaValueValidation extends js.Object {
  /**
    * Required. List of allowed values for the parameter.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaValueValidation {
  @scala.inline
  def apply(): SchemaValueValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueValidation]
  }
  @scala.inline
  implicit class SchemaValueValidationOps[Self <: SchemaValueValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
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

