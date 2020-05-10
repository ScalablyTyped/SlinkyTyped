package typingsSlinky.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldArrayProps[FieldValue] extends js.Object {
  var fields: FieldArrayFieldsProps[FieldValue] = js.native
  var meta: FieldArrayMetaProps = js.native
}

object WrappedFieldArrayProps {
  @scala.inline
  def apply[FieldValue](fields: FieldArrayFieldsProps[FieldValue], meta: FieldArrayMetaProps): WrappedFieldArrayProps[FieldValue] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
  }
  @scala.inline
  implicit class WrappedFieldArrayPropsOps[Self[fieldvalue] <: WrappedFieldArrayProps[fieldvalue], FieldValue] (val x: Self[FieldValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FieldValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FieldValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FieldValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FieldValue] with Other]
    @scala.inline
    def withFields(value: FieldArrayFieldsProps[FieldValue]): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: FieldArrayMetaProps): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

