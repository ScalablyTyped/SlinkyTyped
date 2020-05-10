package typingsSlinky.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupMethod extends js.Object {
  def setup(app: Application[_], path: String): Unit = js.native
}

object SetupMethod {
  @scala.inline
  def apply(setup: (Application[_], String) => Unit): SetupMethod = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction2(setup))
    __obj.asInstanceOf[SetupMethod]
  }
  @scala.inline
  implicit class SetupMethodOps[Self <: SetupMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetup(value: (Application[_], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

