package typingsSlinky.aliApp

import typingsSlinky.aliApp.my.ContactsDic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContactsDicArray extends js.Object {
  var contactsDicArray: js.Array[ContactsDic] = js.native
}

object AnonContactsDicArray {
  @scala.inline
  def apply(contactsDicArray: js.Array[ContactsDic]): AnonContactsDicArray = {
    val __obj = js.Dynamic.literal(contactsDicArray = contactsDicArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContactsDicArray]
  }
  @scala.inline
  implicit class AnonContactsDicArrayOps[Self <: AnonContactsDicArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactsDicArray(value: js.Array[ContactsDic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactsDicArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

