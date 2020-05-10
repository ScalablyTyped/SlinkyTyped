package typingsSlinky.actionsOnGoogle.frameworkFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framework[THandler] extends js.Object {
  /** @public */
  def check(args: js.Any*): Boolean = js.native
  /** @public */
  def handle(base: StandardHandler): THandler = js.native
}

object Framework {
  @scala.inline
  def apply[THandler](check: /* repeated */ js.Any => Boolean, handle: StandardHandler => THandler): Framework[THandler] = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[Framework[THandler]]
  }
  @scala.inline
  implicit class FrameworkOps[Self[thandler] <: Framework[thandler], THandler] (val x: Self[THandler]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THandler] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THandler]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[THandler] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[THandler] with Other]
    @scala.inline
    def withCheck(value: /* repeated */ js.Any => Boolean): Self[THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandle(value: StandardHandler => THandler): Self[THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

