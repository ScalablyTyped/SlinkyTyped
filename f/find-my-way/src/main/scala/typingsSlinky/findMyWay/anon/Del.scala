package typingsSlinky.findMyWay.anon

import typingsSlinky.findMyWay.mod.HTTPVersion
import typingsSlinky.findMyWay.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Del[V /* <: HTTPVersion */] extends js.Object {
  def del(version: String): Unit = js.native
  def empty(): Unit = js.native
  def get(version: String): Handler[V] | Null = js.native
  def set(version: String, store: Handler[V]): Unit = js.native
}

object Del {
  @scala.inline
  def apply[V](
    del: String => Unit,
    empty: () => Unit,
    get: String => Handler[V] | Null,
    set: (String, Handler[V]) => Unit
  ): Del[V] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Del[V]]
  }
  @scala.inline
  implicit class DelOps[Self[v] <: Del[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withDel(value: String => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => Handler[V] | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, Handler[V]) => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

