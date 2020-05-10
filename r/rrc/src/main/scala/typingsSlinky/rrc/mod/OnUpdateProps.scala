package typingsSlinky.rrc.mod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnUpdateProps extends js.Object {
  var call: OnUpdateCall = js.native
  var immediate: js.UndefOr[Boolean] = js.native
}

object OnUpdateProps {
  @scala.inline
  def apply(call: /* location */ Location[LocationState] => Unit): OnUpdateProps = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    __obj.asInstanceOf[OnUpdateProps]
  }
  @scala.inline
  implicit class OnUpdatePropsOps[Self <: OnUpdateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: /* location */ Location[LocationState] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
  }
  
}

