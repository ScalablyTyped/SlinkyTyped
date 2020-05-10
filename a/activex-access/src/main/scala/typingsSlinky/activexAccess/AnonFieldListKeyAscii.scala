package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFieldListKeyAscii extends js.Object {
  val FieldList: Double = js.native
  var KeyAscii: Double = js.native
}

object AnonFieldListKeyAscii {
  @scala.inline
  def apply(FieldList: Double, KeyAscii: Double): AnonFieldListKeyAscii = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldListKeyAscii]
  }
  @scala.inline
  implicit class AnonFieldListKeyAsciiOps[Self <: AnonFieldListKeyAscii] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAscii(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyAscii")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

