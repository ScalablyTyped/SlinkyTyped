package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.AnonCollation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteReplaceOneOperation[T] extends BulkWriteOperation[T] {
  var replaceOne: AnonCollation[T] = js.native
}

object BulkWriteReplaceOneOperation {
  @scala.inline
  def apply[T](replaceOne: AnonCollation[T]): BulkWriteReplaceOneOperation[T] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteReplaceOneOperationOps[Self[t] <: BulkWriteReplaceOneOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withReplaceOne(value: AnonCollation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceOne")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

