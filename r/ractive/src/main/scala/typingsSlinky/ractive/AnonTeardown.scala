package typingsSlinky.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTeardown extends js.Object {
  def teardown(): Unit = js.native
}

object AnonTeardown {
  @scala.inline
  def apply(teardown: () => Unit): AnonTeardown = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AnonTeardown]
  }
  @scala.inline
  implicit class AnonTeardownOps[Self <: AnonTeardown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeardown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

