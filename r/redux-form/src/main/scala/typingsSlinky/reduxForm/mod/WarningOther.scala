package typingsSlinky.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WarningOther[T] extends js.Object {
  var _warning: js.UndefOr[T] = js.native
}

object WarningOther {
  @scala.inline
  def apply[T](): WarningOther[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningOther[T]]
  }
  @scala.inline
  implicit class WarningOtherOps[Self[t] <: WarningOther[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_warning(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_warning: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_warning")(js.undefined)
        ret
    }
  }
  
}

