package typingsSlinky.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ariamodal extends js.Object {
  var `aria-modal`: Boolean = js.native
  var role: String = js.native
  def ref(): Unit = js.native
}

object Ariamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): Ariamodal = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariamodal]
  }
  @scala.inline
  implicit class AriamodalOps[Self <: Ariamodal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-modal`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

