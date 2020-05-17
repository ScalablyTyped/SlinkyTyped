package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldList extends js.Object {
  val FieldList: Double = js.native
}

object FieldList {
  @scala.inline
  def apply(FieldList: Double): FieldList = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldList]
  }
  @scala.inline
  implicit class FieldListOps[Self <: FieldList] (val x: Self) extends AnyVal {
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

