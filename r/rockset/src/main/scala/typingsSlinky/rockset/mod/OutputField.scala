package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.FAIL
import typingsSlinky.rockset.rocksetStrings.SKIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputField extends js.Object {
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  // Error in Mapping execution: 'skip' or 'fail'
  var on_error: js.UndefOr[SKIP | FAIL] = js.native
  // The name of a sql function
  var value: js.UndefOr[SqlExpression] = js.native
}

object OutputField {
  @scala.inline
  def apply(): OutputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputField]
  }
  @scala.inline
  implicit class OutputFieldOps[Self <: OutputField] (val x: Self) extends AnyVal {
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
    def withOn_error(value: SKIP | FAIL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_error")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SqlExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

