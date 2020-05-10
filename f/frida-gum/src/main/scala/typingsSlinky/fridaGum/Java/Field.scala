package typingsSlinky.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field[Value, Holder /* <: Members[Holder] */] extends js.Object {
  /**
    * Type of value.
    */
  var fieldReturnType: Type = js.native
  /**
    * What kind of field this is, i.e. static vs instance.
    */
  var fieldType: FieldType = js.native
  /**
    * Class that this field belongs to.
    */
  var holder: Wrapper[Holder] = js.native
  /**
    * Current value of this field. Assign to update the field's value.
    */
  var value: Value = js.native
}

object Field {
  @scala.inline
  def apply[Value, Holder](fieldReturnType: Type, fieldType: FieldType, holder: Wrapper[Holder], value: Value): Field[Value, Holder] = {
    val __obj = js.Dynamic.literal(fieldReturnType = fieldReturnType.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[Value, Holder]]
  }
  @scala.inline
  implicit class FieldOps[Self[value, holder] <: Field[value, holder], Value, Holder] (val x: Self[Value, Holder]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value, Holder] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value, Holder]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Value, Holder]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Value, Holder]) with Other]
    @scala.inline
    def withFieldReturnType(value: Type): Self[Value, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldReturnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldType(value: FieldType): Self[Value, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolder(value: Wrapper[Holder]): Self[Value, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Value): Self[Value, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

