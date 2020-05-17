package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[Ref[_]] = js.native
}

object ForwardedRef {
  @scala.inline
  def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  @scala.inline
  implicit class ForwardedRefOps[Self <: ForwardedRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardedRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardedRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForwardedRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(null)
        ret
    }
  }
  
}

