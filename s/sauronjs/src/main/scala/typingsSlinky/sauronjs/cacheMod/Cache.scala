package typingsSlinky.sauronjs.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def clear(): Unit = js.native
  def exists(key: String): Boolean = js.native
  def forEach(fn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def keys(): js.Array[String] = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def size(): Double = js.native
}

object Cache {
  @scala.inline
  def apply(
    clear: () => Unit,
    exists: String => Boolean,
    forEach: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit,
    get: String => js.Any,
    keys: () => js.Array[String],
    set: (String, js.Any) => Unit,
    size: () => Double
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), exists = js.Any.fromFunction1(exists), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

