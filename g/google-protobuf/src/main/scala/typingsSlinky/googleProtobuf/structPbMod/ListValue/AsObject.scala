package typingsSlinky.googleProtobuf.structPbMod.ListValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var valuesList: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(valuesList: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(valuesList = valuesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValuesList(value: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

