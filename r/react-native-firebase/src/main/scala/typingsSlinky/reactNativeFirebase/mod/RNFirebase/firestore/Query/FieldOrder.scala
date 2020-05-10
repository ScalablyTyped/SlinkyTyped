package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOrder extends js.Object {
  var direction: String = js.native
  var fieldPath: NativeFieldPath = js.native
}

object FieldOrder {
  @scala.inline
  def apply(direction: String, fieldPath: NativeFieldPath): FieldOrder = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
  @scala.inline
  implicit class FieldOrderOps[Self <: FieldOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldPath(value: NativeFieldPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

