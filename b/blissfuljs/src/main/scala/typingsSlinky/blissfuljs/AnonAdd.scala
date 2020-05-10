package typingsSlinky.blissfuljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  def add(name: String, callback: js.Function): Unit = js.native
  def run(name: String, env: js.Object): Unit = js.native
}

object AnonAdd {
  @scala.inline
  def apply(add: (String, js.Function) => Unit, run: (String, js.Object) => Unit): AnonAdd = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[AnonAdd]
  }
  @scala.inline
  implicit class AnonAddOps[Self <: AnonAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRun(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

