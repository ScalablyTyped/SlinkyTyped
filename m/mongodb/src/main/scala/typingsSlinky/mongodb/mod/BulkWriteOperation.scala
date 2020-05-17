package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.BulkWriteInsertOneOperation[T]
  - typingsSlinky.mongodb.mod.BulkWriteUpdateOneOperation[T]
  - typingsSlinky.mongodb.mod.BulkWriteUpdateManyOperation[T]
  - typingsSlinky.mongodb.mod.BulkWriteReplaceOneOperation[T]
  - typingsSlinky.mongodb.mod.BulkWriteDeleteOneOperation[T]
  - typingsSlinky.mongodb.mod.BulkWriteDeleteManyOperation[T]
*/
trait BulkWriteOperation[T] extends js.Object

object BulkWriteOperation {
  @scala.inline
  implicit def apply[T](value: BulkWriteDeleteManyOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
  @scala.inline
  implicit def apply[T](value: BulkWriteDeleteOneOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
  @scala.inline
  implicit def apply[T](value: BulkWriteInsertOneOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
  @scala.inline
  implicit def apply[T](value: BulkWriteReplaceOneOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
  @scala.inline
  implicit def apply[T](value: BulkWriteUpdateManyOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
  @scala.inline
  implicit def apply[T](value: BulkWriteUpdateOneOperation[T]): BulkWriteOperation[T] = value.asInstanceOf[BulkWriteOperation[T]]
}

