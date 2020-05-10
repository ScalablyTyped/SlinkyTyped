package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofkex extends js.Object {
  def resetdebug(): Double = js.native
  def setdebug(lval: Double): Double = js.native
}

object Typeofkex {
  @scala.inline
  def apply(resetdebug: () => Double, setdebug: Double => Double): Typeofkex = {
    val __obj = js.Dynamic.literal(resetdebug = js.Any.fromFunction0(resetdebug), setdebug = js.Any.fromFunction1(setdebug))
    __obj.asInstanceOf[Typeofkex]
  }
  @scala.inline
  implicit class TypeofkexOps[Self <: Typeofkex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResetdebug(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetdebug")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetdebug(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setdebug")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

