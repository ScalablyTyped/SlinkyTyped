package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteDeleteManyOperation[T] extends BulkWriteOperation[T] {
  var deleteMany: BulkWriteDeleteOperation[T] = js.native
}

object BulkWriteDeleteManyOperation {
  @scala.inline
  def apply[T](deleteMany: BulkWriteDeleteOperation[T]): BulkWriteDeleteManyOperation[T] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteManyOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteDeleteManyOperationOps[Self[t] <: BulkWriteDeleteManyOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeleteMany(value: BulkWriteDeleteOperation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMany")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

