package typingsSlinky.momentStrftime2.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def strftime(pattern: String): String = js.native
}

object Moment {
  @scala.inline
  def apply(strftime: String => String): Moment = {
    val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
    __obj.asInstanceOf[Moment]
  }
  @scala.inline
  implicit class MomentOps[Self <: Moment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrftime(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strftime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

