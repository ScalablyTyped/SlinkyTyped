package typingsSlinky.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryPromise[T] extends js.Object {
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
}

object JQueryPromise {
  @scala.inline
  def apply[T](): JQueryPromise[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPromise[T]]
  }
  @scala.inline
  implicit class JQueryPromiseOps[Self[t] <: JQueryPromise[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCancel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
  }
  
}

