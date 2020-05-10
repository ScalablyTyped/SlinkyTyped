package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFieldList extends js.Object {
  val FieldList: Double = js.native
}

object AnonFieldList {
  @scala.inline
  def apply(FieldList: Double): AnonFieldList = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldList]
  }
  @scala.inline
  implicit class AnonFieldListOps[Self <: AnonFieldList] (val x: Self) extends AnyVal {
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
  }
  
}

