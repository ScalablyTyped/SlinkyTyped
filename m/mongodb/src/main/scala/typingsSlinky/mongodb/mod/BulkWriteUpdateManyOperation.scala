package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteUpdateManyOperation[T] extends BulkWriteOperation[T] {
  var updateMany: BulkWriteUpdateOperation[T] = js.native
}

object BulkWriteUpdateManyOperation {
  @scala.inline
  def apply[T](updateMany: BulkWriteUpdateOperation[T]): BulkWriteUpdateManyOperation[T] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateManyOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteUpdateManyOperationOps[Self[t] <: BulkWriteUpdateManyOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUpdateMany(value: BulkWriteUpdateOperation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMany")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

