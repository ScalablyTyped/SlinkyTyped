package typingsSlinky.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnReinit extends js.Object {
  @JSName("on$Reinit")
  def on$Reinit(): Unit = js.native
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit = js.native
}

object AnonOnReinit {
  @scala.inline
  def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): AnonOnReinit = {
    val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
    __obj.asInstanceOf[AnonOnReinit]
  }
  @scala.inline
  implicit class AnonOnReinitOps[Self <: AnonOnReinit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn$Reinit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on$Reinit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn$ValidationPass(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on$ValidationPass")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

