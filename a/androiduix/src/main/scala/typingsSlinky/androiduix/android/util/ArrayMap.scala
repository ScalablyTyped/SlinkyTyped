package typingsSlinky.androiduix.android.util

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayMap[K, V] extends js.Object {
  var map: js.Any = js.native
  def append(key: K, value: V): Unit = js.native
  def clear(): Unit = js.native
  def containsKey(key: K): Boolean = js.native
  def containsValue(value: V): Boolean = js.native
  def ensureCapacity(minimumCapacity: Double): Unit = js.native
  def erase(): Unit = js.native
  def get(key: K): V = js.native
  def indexOfValue(value: V): Double = js.native
  def isEmpty(): Boolean = js.native
  def keyAt(index: Double): K = js.native
  def keySet(): Set[K] = js.native
  def put(key: K, value: V): V = js.native
  def remove(key: K): V = js.native
  def removeAt(index: Double): V = js.native
  def setValueAt(index: Double, value: V): V = js.native
  def size(): Double = js.native
  def valueAt(index: Double): V = js.native
}

object ArrayMap {
  @scala.inline
  def apply[K, V](
    append: (K, V) => Unit,
    clear: () => Unit,
    containsKey: K => Boolean,
    containsValue: V => Boolean,
    ensureCapacity: Double => Unit,
    erase: () => Unit,
    get: K => V,
    indexOfValue: V => Double,
    isEmpty: () => Boolean,
    keyAt: Double => K,
    keySet: () => Set[K],
    map: js.Any,
    put: (K, V) => V,
    remove: K => V,
    removeAt: Double => V,
    setValueAt: (Double, V) => V,
    size: () => Double,
    valueAt: Double => V
  ): ArrayMap[K, V] = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), ensureCapacity = js.Any.fromFunction1(ensureCapacity), erase = js.Any.fromFunction0(erase), get = js.Any.fromFunction1(get), indexOfValue = js.Any.fromFunction1(indexOfValue), isEmpty = js.Any.fromFunction0(isEmpty), keyAt = js.Any.fromFunction1(keyAt), keySet = js.Any.fromFunction0(keySet), map = map.asInstanceOf[js.Any], put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt), setValueAt = js.Any.fromFunction2(setValueAt), size = js.Any.fromFunction0(size), valueAt = js.Any.fromFunction1(valueAt))
    __obj.asInstanceOf[ArrayMap[K, V]]
  }
  @scala.inline
  implicit class ArrayMapOps[Self[k, v] <: ArrayMap[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withAppend(value: (K, V) => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainsKey(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsValue(value: V => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnsureCapacity(value: Double => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureCapacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErase(value: () => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexOfValue(value: V => Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeyAt(value: Double => K): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeySet(value: () => Set[K]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPut(value: (K, V) => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAt(value: Double => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueAt(value: (Double, V) => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAt(value: Double => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

