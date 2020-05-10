package typingsSlinky.mem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage[KeyType, ValueType] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  def delete(key: KeyType): Unit = js.native
  def get(key: KeyType): js.UndefOr[ValueType] = js.native
  def has(key: KeyType): Boolean = js.native
  def set(key: KeyType, value: ValueType): Unit = js.native
}

object CacheStorage {
  @scala.inline
  def apply[KeyType, ValueType](
    delete: KeyType => Unit,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => Boolean,
    set: (KeyType, ValueType) => Unit
  ): CacheStorage[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
  }
  @scala.inline
  implicit class CacheStorageOps[Self[keytype, valuetype] <: CacheStorage[keytype, valuetype], KeyType, ValueType] (val x: Self[KeyType, ValueType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[KeyType, ValueType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[KeyType, ValueType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[KeyType, ValueType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[KeyType, ValueType]) with Other]
    @scala.inline
    def withDelete(value: KeyType => Unit): Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: KeyType => js.UndefOr[ValueType]): Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: KeyType => Boolean): Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (KeyType, ValueType) => Unit): Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self[KeyType, ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
  }
  
}

