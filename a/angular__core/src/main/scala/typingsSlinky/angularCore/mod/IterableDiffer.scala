package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableDiffer[V] extends js.Object {
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: NgIterable[V]): IterableChanges[V] | Null
}

object IterableDiffer {
  @scala.inline
  def apply[V](diff: NgIterable[V] => IterableChanges[V] | Null): IterableDiffer[V] = {
    val __obj = js.Dynamic.literal(diff = js.Any.fromFunction1(diff))
    __obj.asInstanceOf[IterableDiffer[V]]
  }
  @scala.inline
  implicit class IterableDifferOps[Self <: IterableDiffer[_], V] (val x: Self with IterableDiffer[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiff(value: NgIterable[V] => IterableChanges[V] | Null): Self = this.set("diff", js.Any.fromFunction1(value))
  }
  
}

