package typingsSlinky.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.native
  var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.native
  def dispatch(payload: js.Any*): Unit = js.native
}

object ActionsClass {
  @scala.inline
  def apply(dispatch: /* repeated */ js.Any => Unit): ActionsClass = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    __obj.asInstanceOf[ActionsClass]
  }
  @scala.inline
  implicit class ActionsClassOps[Self <: ActionsClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withActions(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateActions(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenerateActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateActions")(js.undefined)
        ret
    }
  }
  
}

