package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartArrayNoDuplicate[T] extends SmartArray[T] {
  var _duplicateId: js.Any = js.native
  /**
    * Concats the active data with a given array.
    * This ensures no dupplicate will be present in the result.
    * @param array defines the data to concatenate with.
    */
  def concatWithNoDuplicate(array: js.Any): Unit = js.native
  /**
    * Pushes a value at the end of the active data.
    * If the data is already present, it won t be added again
    * @param value defines the object to push in the array.
    * @returns true if added false if it was already present
    */
  def pushNoDuplicate(value: T): Boolean = js.native
}

object SmartArrayNoDuplicate {
  @scala.inline
  def apply[T](
    _duplicateId: js.Any,
    _id: Double,
    concat: js.Any => Unit,
    concatWithNoDuplicate: js.Any => Unit,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: () => Unit,
    forEach: js.Function1[T, Unit] => Unit,
    indexOf: T => Double,
    length: Double,
    push: T => Unit,
    pushNoDuplicate: T => Boolean,
    reset: () => Unit,
    sort: js.Function2[T, T, Double] => Unit
  ): SmartArrayNoDuplicate[T] = {
    val __obj = js.Dynamic.literal(_duplicateId = _duplicateId.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), concatWithNoDuplicate = js.Any.fromFunction1(concatWithNoDuplicate), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), forEach = js.Any.fromFunction1(forEach), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), pushNoDuplicate = js.Any.fromFunction1(pushNoDuplicate), reset = js.Any.fromFunction0(reset), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[SmartArrayNoDuplicate[T]]
  }
  @scala.inline
  implicit class SmartArrayNoDuplicateOps[Self[t] <: SmartArrayNoDuplicate[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_duplicateId(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_duplicateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcatWithNoDuplicate(value: js.Any => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatWithNoDuplicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPushNoDuplicate(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushNoDuplicate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

