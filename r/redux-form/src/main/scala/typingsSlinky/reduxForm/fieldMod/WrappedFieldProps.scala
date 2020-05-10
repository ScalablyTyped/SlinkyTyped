package typingsSlinky.reduxForm.fieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldProps extends js.Object {
  var input: WrappedFieldInputProps = js.native
  var meta: WrappedFieldMetaProps = js.native
}

object WrappedFieldProps {
  @scala.inline
  def apply(input: WrappedFieldInputProps, meta: WrappedFieldMetaProps): WrappedFieldProps = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldProps]
  }
  @scala.inline
  implicit class WrappedFieldPropsOps[Self <: WrappedFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: WrappedFieldInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: WrappedFieldMetaProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

