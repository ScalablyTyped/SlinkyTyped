package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldTransformSetToServerValueEnum extends js.Object {
  var REQUEST_TIME: FieldTransformSetToServerValue = js.native
  var SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue = js.native
  def values(): js.Array[FieldTransformSetToServerValue] = js.native
}

object IFieldTransformSetToServerValueEnum {
  @scala.inline
  def apply(
    REQUEST_TIME: FieldTransformSetToServerValue,
    SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue,
    values: () => js.Array[FieldTransformSetToServerValue]
  ): IFieldTransformSetToServerValueEnum = {
    val __obj = js.Dynamic.literal(REQUEST_TIME = REQUEST_TIME.asInstanceOf[js.Any], SERVER_VALUE_UNSPECIFIED = SERVER_VALUE_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IFieldTransformSetToServerValueEnum]
  }
  @scala.inline
  implicit class IFieldTransformSetToServerValueEnumOps[Self <: IFieldTransformSetToServerValueEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREQUEST_TIME(value: FieldTransformSetToServerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_TIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERVER_VALUE_UNSPECIFIED(value: FieldTransformSetToServerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVER_VALUE_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[FieldTransformSetToServerValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

