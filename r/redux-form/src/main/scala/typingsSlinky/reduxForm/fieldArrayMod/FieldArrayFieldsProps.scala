package typingsSlinky.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: Double = js.native
  var name: String = js.native
  def forEach(callback: FieldIterate[FieldValue, Unit]): Unit = js.native
  def get(index: Double): FieldValue = js.native
  def getAll(): js.Array[FieldValue] = js.native
  def insert(index: Double, value: FieldValue): Unit = js.native
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R] = js.native
  def move(from: Double, to: Double): Unit = js.native
  def pop(): FieldValue = js.native
  def push(value: FieldValue): Unit = js.native
  def remove(index: Double): Unit = js.native
  def removeAll(): Unit = js.native
  def shift(): FieldValue = js.native
  def swap(indexA: Double, indexB: Double): Unit = js.native
  def unshift(value: FieldValue): Unit = js.native
}

object FieldArrayFieldsProps {
  @scala.inline
  def apply[FieldValue](
    forEach: FieldIterate[FieldValue, Unit] => Unit,
    get: Double => FieldValue,
    getAll: () => js.Array[FieldValue],
    insert: (Double, FieldValue) => Unit,
    length: Double,
    map: FieldIterate[FieldValue, js.Any] => js.Array[js.Any],
    move: (Double, Double) => Unit,
    name: String,
    pop: () => FieldValue,
    push: FieldValue => Unit,
    remove: Double => Unit,
    removeAll: () => Unit,
    shift: () => FieldValue,
    swap: (Double, Double) => Unit,
    unshift: FieldValue => Unit
  ): FieldArrayFieldsProps[FieldValue] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), insert = js.Any.fromFunction2(insert), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), move = js.Any.fromFunction2(move), name = name.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), shift = js.Any.fromFunction0(shift), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[FieldArrayFieldsProps[FieldValue]]
  }
  @scala.inline
  implicit class FieldArrayFieldsPropsOps[Self[fieldvalue] <: FieldArrayFieldsProps[fieldvalue], FieldValue] (val x: Self[FieldValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FieldValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FieldValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FieldValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FieldValue] with Other]
    @scala.inline
    def withForEach(value: FieldIterate[FieldValue, Unit] => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => FieldValue): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAll(value: () => js.Array[FieldValue]): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, FieldValue) => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: FieldIterate[FieldValue, js.Any] => js.Array[js.Any]): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: (Double, Double) => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPop(value: () => FieldValue): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: FieldValue => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAll(value: () => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShift(value: () => FieldValue): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSwap(value: (Double, Double) => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnshift(value: FieldValue => Unit): Self[FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

