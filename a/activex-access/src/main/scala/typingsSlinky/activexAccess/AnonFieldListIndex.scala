package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFieldListIndex extends js.Object {
  val FieldListIndex: Double = js.native
}

object AnonFieldListIndex {
  @scala.inline
  def apply(FieldListIndex: Double): AnonFieldListIndex = {
    val __obj = js.Dynamic.literal(FieldListIndex = FieldListIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldListIndex]
  }
  @scala.inline
  implicit class AnonFieldListIndexOps[Self <: AnonFieldListIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldListIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldListIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

