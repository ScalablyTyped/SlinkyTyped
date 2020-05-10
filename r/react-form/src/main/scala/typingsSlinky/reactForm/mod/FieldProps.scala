package typingsSlinky.reactForm.mod

import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps extends js.Object {
  var errorBefore: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.native
  var isForm: js.UndefOr[Boolean] = js.native
  var showErrors: js.UndefOr[Boolean] = js.native
}

object FieldProps {
  @scala.inline
  def apply(): FieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProps]
  }
  @scala.inline
  implicit class FieldPropsOps[Self <: FieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withIsForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForm")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
  }
  
}

