package typingsSlinky.reactWithStyles

import typingsSlinky.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStylesFn[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles = js.native
}

object AnonStylesFn {
  @scala.inline
  def apply[TStyles](stylesFn: /* repeated */ js.Any => TStyles): AnonStylesFn[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
    __obj.asInstanceOf[AnonStylesFn[TStyles]]
  }
  @scala.inline
  implicit class AnonStylesFnOps[Self[tstyles] <: AnonStylesFn[tstyles], TStyles] (val x: Self[TStyles]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStyles] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStyles]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TStyles] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TStyles] with Other]
    @scala.inline
    def withStylesFn(value: /* repeated */ js.Any => TStyles): Self[TStyles] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesFn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

