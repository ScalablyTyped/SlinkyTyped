package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteDeleteOneOperation[T] extends BulkWriteOperation[T] {
  var deleteOne: BulkWriteDeleteOperation[T] = js.native
}

object BulkWriteDeleteOneOperation {
  @scala.inline
  def apply[T](deleteOne: BulkWriteDeleteOperation[T]): BulkWriteDeleteOneOperation[T] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOneOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteDeleteOneOperationOps[Self[t] <: BulkWriteDeleteOneOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeleteOne(value: BulkWriteDeleteOperation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOne")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

