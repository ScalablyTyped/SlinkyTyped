package typingsSlinky.rcFieldForm.nameMapMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NameMap like a `Map` but accepts `string[]` as key.
  */
@js.native
trait NameMap[T] extends js.Object {
  var list: js.Any = js.native
  def delete(key: InternalNamePath): Unit = js.native
  def get(key: InternalNamePath): T = js.native
  def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U] = js.native
  def set(key: InternalNamePath, value: T): Unit = js.native
  def toJSON(): StringDictionary[T] = js.native
  def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit = js.native
}

object NameMap {
  @scala.inline
  def apply[T](
    delete: InternalNamePath => Unit,
    get: InternalNamePath => T,
    list: js.Any,
    map: js.Function1[/* kv */ KV[T], js.Any] => js.Array[js.Any],
    set: (InternalNamePath, T) => Unit,
    toJSON: () => StringDictionary[T],
    update: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit
  ): NameMap[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = list.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NameMap[T]]
  }
  @scala.inline
  implicit class NameMapOps[Self[t] <: NameMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDelete(value: InternalNamePath => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: InternalNamePath => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Function1[/* kv */ KV[T], js.Any] => js.Array[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (InternalNamePath, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => StringDictionary[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

