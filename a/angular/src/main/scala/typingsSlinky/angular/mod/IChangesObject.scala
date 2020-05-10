package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangesObject[T] extends js.Object {
  var currentValue: T = js.native
  var previousValue: T = js.native
  def isFirstChange(): Boolean = js.native
}

object IChangesObject {
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: () => Boolean, previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = js.Any.fromFunction0(isFirstChange), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
  @scala.inline
  implicit class IChangesObjectOps[Self[t] <: IChangesObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrentValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFirstChange(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

