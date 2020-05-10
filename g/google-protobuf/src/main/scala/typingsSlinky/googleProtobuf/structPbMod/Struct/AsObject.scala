package typingsSlinky.googleProtobuf.structPbMod.Struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var fieldsMap: js.Array[js.Tuple2[String, typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]] = js.native
}

object AsObject {
  @scala.inline
  def apply(fieldsMap: js.Array[js.Tuple2[String, typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]]): AsObject = {
    val __obj = js.Dynamic.literal(fieldsMap = fieldsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldsMap(value: js.Array[js.Tuple2[String, typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

