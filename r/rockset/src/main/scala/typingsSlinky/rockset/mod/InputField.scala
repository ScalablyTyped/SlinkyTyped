package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.PASS
import typingsSlinky.rockset.rocksetStrings.SKIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputField extends js.Object {
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  // Define the behaviour if fieldName is missing or is null
  var if_missing: js.UndefOr[SKIP | PASS] = js.native
  // If true, then drop fieldName from the document
  var is_drop: js.UndefOr[Boolean] = js.native
  // Sql parameter name
  var param: js.UndefOr[String] = js.native
}

object InputField {
  @scala.inline
  def apply(): InputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputField]
  }
  @scala.inline
  implicit class InputFieldOps[Self <: InputField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_name")(js.undefined)
        ret
    }
    @scala.inline
    def withIf_missing(value: SKIP | PASS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIf_missing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_missing")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_drop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_drop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_drop")(js.undefined)
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
  }
  
}

