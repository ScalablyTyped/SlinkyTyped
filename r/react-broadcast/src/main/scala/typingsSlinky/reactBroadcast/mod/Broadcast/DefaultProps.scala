package typingsSlinky.reactBroadcast.mod.Broadcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultProps[T] extends js.Object {
  def compareValues(prevValue: T, nextValue: T): Boolean = js.native
}

object DefaultProps {
  @scala.inline
  def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
    val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
    __obj.asInstanceOf[DefaultProps[T]]
  }
  @scala.inline
  implicit class DefaultPropsOps[Self[t] <: DefaultProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCompareValues(value: (T, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareValues")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

