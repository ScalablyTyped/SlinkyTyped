package typingsSlinky.pouchReduxMiddleware.anon

import typingsSlinky.pouchReduxMiddleware.mod.Document
import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInsert[T] extends js.Object {
  def batchInsert(docs: js.Array[Document[T]]): Action[_] = js.native
  def insert(doc: Document[T]): Action[_] = js.native
  def remove(doc: Document[T]): Action[_] = js.native
  def update(doc: Document[T]): Action[_] = js.native
}

object BatchInsert {
  @scala.inline
  def apply[T](
    batchInsert: js.Array[Document[T]] => Action[_],
    insert: Document[T] => Action[_],
    remove: Document[T] => Action[_],
    update: Document[T] => Action[_]
  ): BatchInsert[T] = {
    val __obj = js.Dynamic.literal(batchInsert = js.Any.fromFunction1(batchInsert), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BatchInsert[T]]
  }
  @scala.inline
  implicit class BatchInsertOps[Self[t] <: BatchInsert[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBatchInsert(value: js.Array[Document[T]] => Action[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Document[T] => Action[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Document[T] => Action[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Document[T] => Action[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

