package typingsSlinky.hashset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): Unit = js.native
  def addAll(arr: js.Array[TValue]): Unit = js.native
  def clear(): Unit = js.native
  def complement(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def contains(value: TValue): Boolean = js.native
  def intersection(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def isEmpty(): Boolean = js.native
  def isSubsetOf(set: IHashSet[TValue]): Boolean = js.native
  def remove(value: TValue): Unit = js.native
  def size(): Double = js.native
  def union(set: IHashSet[TValue]): IHashSet[TValue] = js.native
  def values(): js.Array[TValue] = js.native
}

object IHashSet {
  @scala.inline
  def apply[TValue](
    add: TValue => Unit,
    addAll: js.Array[TValue] => Unit,
    clear: () => Unit,
    complement: IHashSet[TValue] => IHashSet[TValue],
    contains: TValue => Boolean,
    intersection: IHashSet[TValue] => IHashSet[TValue],
    isEmpty: () => Boolean,
    isSubsetOf: IHashSet[TValue] => Boolean,
    remove: TValue => Unit,
    size: () => Double,
    union: IHashSet[TValue] => IHashSet[TValue],
    values: () => js.Array[TValue]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), clear = js.Any.fromFunction0(clear), complement = js.Any.fromFunction1(complement), contains = js.Any.fromFunction1(contains), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), union = js.Any.fromFunction1(union), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IHashSet[TValue]]
  }
  @scala.inline
  implicit class IHashSetOps[Self[tvalue] <: IHashSet[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withAdd(value: TValue => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddAll(value: js.Array[TValue] => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComplement(value: IHashSet[TValue] => IHashSet[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: TValue => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersection(value: IHashSet[TValue] => IHashSet[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSubsetOf(value: IHashSet[TValue] => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubsetOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: TValue => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnion(value: IHashSet[TValue] => IHashSet[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

