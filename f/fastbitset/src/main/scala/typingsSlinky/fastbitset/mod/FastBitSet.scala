package typingsSlinky.fastbitset.mod

import typingsSlinky.fastbitset.fastbitsetNumbers.`0`
import typingsSlinky.fastbitset.fastbitsetNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastBitSet extends js.Object {
  /** Add the value (Set the bit at `index` to `true`) */
  def add(index: Double): Unit = js.native
  /** Return an array with the set bit locations (values) */
  def array(): js.Array[Double] = js.native
  /**
    * Tries to add the value (Set the bit at `index` to `true`), returns `1` if the
    * value was added, returns `0` if the value was already present
    */
  def checkedAdd(index: Double): `1` | `0` = js.native
  /** Remove all values, reset memory usage */
  def clear(): Unit = js.native
  /**
    * Computes the difference between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def difference(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size of the difference between this bitset and another one */
  def difference_size(otherbitmap: FastBitSet): Double = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified
    */
  def equals(otherbitmap: FastBitSet): Boolean = js.native
  /** If the value was not in the set, add it, otherwise remove it (flip bit at `index`) */
  def flip(index: Double): Unit = js.native
  /** Return an array with the set bit locations (values) */
  def forEach(fnc: js.Function1[/* index */ Double, Unit]): Unit = js.native
  /** fast function to compute the Hamming weight of a 32-bit unsigned integer */
  def hammingWeight(v: Double): Double = js.native
  /** fast function to compute the Hamming weight of four 32-bit unsigned integers */
  def hammingWeight4(v1: Double, v2: Double, v3: Double, v4: Double): Double = js.native
  /** Is the value contained in the set? Is the bit at `index` `true` or `false`? */
  def has(index: Double): Boolean = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified  (and returned by the function)
    */
  def intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size of the intersection between this bitset and another one */
  def intersection_size(otherbitmap: FastBitSet): Double = js.native
  /**
    * Check if this bitset intersects with another one,
    * no bitmap is modified
    */
  def intersects(otherbitmap: FastBitSet): Boolean = js.native
  /** Return `true` if no bit is set */
  def isEmpty(index: Double): Boolean = js.native
  /**
    * Computes the difference between this bitset and another one,
    * a new bitmap is generated
    */
  def new_difference(otherbitmap: FastBitSet): FastBitSet = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * a new bitmap is generated
    */
  def new_intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  def new_union(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Set the bit at `index` to `false` */
  def remove(index: Double): Unit = js.native
  /** Resize the bitset so that we can write a value at `index` */
  def resize(index: Double): Unit = js.native
  /** How many values stored in the set? How many set bits? */
  def size(): Double = js.native
  /** Reduce the memory usage to a minimum */
  def trim(): Unit = js.native
  /**
    * Computes the union between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def union(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size union between this bitset and another one */
  def union_size(otherbitmap: FastBitSet): Double = js.native
}

object FastBitSet {
  @scala.inline
  def apply(
    add: Double => Unit,
    array: () => js.Array[Double],
    checkedAdd: Double => `1` | `0`,
    clear: () => Unit,
    difference: FastBitSet => FastBitSet,
    difference_size: FastBitSet => Double,
    equals: FastBitSet => Boolean,
    flip: Double => Unit,
    forEach: js.Function1[/* index */ Double, Unit] => Unit,
    hammingWeight: Double => Double,
    hammingWeight4: (Double, Double, Double, Double) => Double,
    has: Double => Boolean,
    intersection: FastBitSet => FastBitSet,
    intersection_size: FastBitSet => Double,
    intersects: FastBitSet => Boolean,
    isEmpty: Double => Boolean,
    new_difference: FastBitSet => FastBitSet,
    new_intersection: FastBitSet => FastBitSet,
    new_union: FastBitSet => FastBitSet,
    remove: Double => Unit,
    resize: Double => Unit,
    size: () => Double,
    trim: () => Unit,
    union: FastBitSet => FastBitSet,
    union_size: FastBitSet => Double
  ): FastBitSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = js.Any.fromFunction0(array), checkedAdd = js.Any.fromFunction1(checkedAdd), clear = js.Any.fromFunction0(clear), difference = js.Any.fromFunction1(difference), difference_size = js.Any.fromFunction1(difference_size), equals = js.Any.fromFunction1(equals), flip = js.Any.fromFunction1(flip), forEach = js.Any.fromFunction1(forEach), hammingWeight = js.Any.fromFunction1(hammingWeight), hammingWeight4 = js.Any.fromFunction4(hammingWeight4), has = js.Any.fromFunction1(has), intersection = js.Any.fromFunction1(intersection), intersection_size = js.Any.fromFunction1(intersection_size), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction1(isEmpty), new_difference = js.Any.fromFunction1(new_difference), new_intersection = js.Any.fromFunction1(new_intersection), new_union = js.Any.fromFunction1(new_union), remove = js.Any.fromFunction1(remove), resize = js.Any.fromFunction1(resize), size = js.Any.fromFunction0(size), trim = js.Any.fromFunction0(trim), union = js.Any.fromFunction1(union), union_size = js.Any.fromFunction1(union_size))
    __obj.asInstanceOf[FastBitSet]
  }
  @scala.inline
  implicit class FastBitSetOps[Self <: FastBitSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArray(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckedAdd(value: Double => `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDifference(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("difference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDifference_size(value: FastBitSet => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("difference_size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: FastBitSet => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlip(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[/* index */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHammingWeight(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hammingWeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHammingWeight4(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hammingWeight4")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHas(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersection(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersection_size(value: FastBitSet => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection_size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersects(value: FastBitSet => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNew_difference(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_difference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNew_intersection(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_intersection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNew_union(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_union")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrim(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnion(value: FastBitSet => FastBitSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnion_size(value: FastBitSet => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union_size")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

