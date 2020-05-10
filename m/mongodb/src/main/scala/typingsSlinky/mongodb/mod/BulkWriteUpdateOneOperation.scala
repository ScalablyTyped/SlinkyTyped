package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteUpdateOneOperation[T] extends BulkWriteOperation[T] {
  var updateOne: BulkWriteUpdateOperation[T] = js.native
}

object BulkWriteUpdateOneOperation {
  @scala.inline
  def apply[T](updateOne: BulkWriteUpdateOperation[T]): BulkWriteUpdateOneOperation[T] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteUpdateOneOperationOps[Self[t] <: BulkWriteUpdateOneOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUpdateOne(value: BulkWriteUpdateOperation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOne")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

