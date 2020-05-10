package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableDiffer[V] extends js.Object {
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: NgIterable[V]): IterableChanges[V] | Null = js.native
}

object IterableDiffer {
  @scala.inline
  def apply[V](diff: NgIterable[V] => IterableChanges[V] | Null): IterableDiffer[V] = {
    val __obj = js.Dynamic.literal(diff = js.Any.fromFunction1(diff))
    __obj.asInstanceOf[IterableDiffer[V]]
  }
  @scala.inline
  implicit class IterableDifferOps[Self[v] <: IterableDiffer[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withDiff(value: NgIterable[V] => IterableChanges[V] | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

