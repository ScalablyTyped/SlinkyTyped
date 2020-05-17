package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteInsertOneOperation[T] extends BulkWriteOperation[T] {
  var insertOne: Document[T] = js.native
}

object BulkWriteInsertOneOperation {
  @scala.inline
  def apply[T](insertOne: Document[T]): BulkWriteInsertOneOperation[T] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[T]]
  }
  @scala.inline
  implicit class BulkWriteInsertOneOperationOps[Self[t] <: BulkWriteInsertOneOperation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInsertOne(value: Document[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOne")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

