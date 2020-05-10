package typingsSlinky.interfaceDatastore.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore[Value] extends js.Object {
  def batch(): Batch[Value] = js.native
  def close(): js.Promise[Unit] = js.native
  def delete(key: Key): js.Promise[Unit] = js.native
  def get(key: Key): js.Promise[Value] = js.native
  def has(key: Key): js.Promise[Boolean] = js.native
  def open(): js.Promise[Unit] = js.native
  def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
  def query(q: Query[Value]): AsyncIterable[Result[Value]] = js.native
}

object Datastore {
  @scala.inline
  def apply[Value](
    batch: () => Batch[Value],
    close: () => js.Promise[Unit],
    delete: Key => js.Promise[Unit],
    get: Key => js.Promise[Value],
    has: Key => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    put: (Key, Value) => js.Promise[Unit],
    query: Query[Value] => AsyncIterable[Result[Value]]
  ): Datastore[Value] = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction0(batch), close = js.Any.fromFunction0(close), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), open = js.Any.fromFunction0(open), put = js.Any.fromFunction2(put), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[Datastore[Value]]
  }
  @scala.inline
  implicit class DatastoreOps[Self[value] <: Datastore[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withBatch(value: () => Batch[Value]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => js.Promise[Unit]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: Key => js.Promise[Unit]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => js.Promise[Value]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: Key => js.Promise[Boolean]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => js.Promise[Unit]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPut(value: (Key, Value) => js.Promise[Unit]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQuery(value: Query[Value] => AsyncIterable[Result[Value]]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

