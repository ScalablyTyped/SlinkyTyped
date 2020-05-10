package typingsSlinky.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDeferred[T] extends js.Object {
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
}

object JQueryDeferred {
  @scala.inline
  def apply[T](): JQueryDeferred[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDeferred[T]]
  }
  @scala.inline
  implicit class JQueryDeferredOps[Self[t] <: JQueryDeferred[t], T] (val x: Self[T]) extends AnyVal {
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

