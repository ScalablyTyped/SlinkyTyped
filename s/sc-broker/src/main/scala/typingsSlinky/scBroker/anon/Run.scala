package typingsSlinky.scBroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Run extends js.Object {
  var run: js.UndefOr[js.Function0[Unit]] = js.native
}

object Run {
  @scala.inline
  def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  @scala.inline
  implicit class RunOps[Self <: Run] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
  }
  
}

