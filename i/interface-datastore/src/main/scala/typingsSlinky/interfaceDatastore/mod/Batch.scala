package typingsSlinky.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch[Value] extends js.Object {
  def commit(): js.Promise[Unit] = js.native
  def delete(key: Key): Unit = js.native
  def put(key: Key, value: Value): Unit = js.native
}

object Batch {
  @scala.inline
  def apply[Value](commit: () => js.Promise[Unit], delete: Key => Unit, put: (Key, Value) => Unit): Batch[Value] = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), delete = js.Any.fromFunction1(delete), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Batch[Value]]
  }
  @scala.inline
  implicit class BatchOps[Self[value] <: Batch[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withCommit(value: () => js.Promise[Unit]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: Key => Unit): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPut(value: (Key, Value) => Unit): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

