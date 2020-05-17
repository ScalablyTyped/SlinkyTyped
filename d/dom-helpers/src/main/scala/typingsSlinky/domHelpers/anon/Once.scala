package typingsSlinky.domHelpers.anon

import typingsSlinky.domHelpers.addEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Once[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */] extends js.Object {
  var __once: js.UndefOr[EventHandler[K]] = js.native
}

object Once {
  @scala.inline
  def apply[K](): Once[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Once[K]]
  }
  @scala.inline
  implicit class OnceOps[Self[k] <: Once[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def with__once(value: EventHandler[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__once: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__once")(js.undefined)
        ret
    }
  }
  
}

