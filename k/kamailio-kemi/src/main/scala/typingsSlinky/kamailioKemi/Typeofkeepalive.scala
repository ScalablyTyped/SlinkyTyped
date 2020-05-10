package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofkeepalive extends js.Object {
  def is_alive(dest: String): Double = js.native
}

object Typeofkeepalive {
  @scala.inline
  def apply(is_alive: String => Double): Typeofkeepalive = {
    val __obj = js.Dynamic.literal(is_alive = js.Any.fromFunction1(is_alive))
    __obj.asInstanceOf[Typeofkeepalive]
  }
  @scala.inline
  implicit class TypeofkeepaliveOps[Self <: Typeofkeepalive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_alive(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_alive")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

