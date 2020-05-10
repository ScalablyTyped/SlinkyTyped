package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValueNullValueEnum extends js.Object {
  var NULL_VALUE: ValueNullValue = js.native
  def values(): js.Array[ValueNullValue] = js.native
}

object IValueNullValueEnum {
  @scala.inline
  def apply(NULL_VALUE: ValueNullValue, values: () => js.Array[ValueNullValue]): IValueNullValueEnum = {
    val __obj = js.Dynamic.literal(NULL_VALUE = NULL_VALUE.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IValueNullValueEnum]
  }
  @scala.inline
  implicit class IValueNullValueEnumOps[Self <: IValueNullValueEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNULL_VALUE(value: ValueNullValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NULL_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[ValueNullValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

