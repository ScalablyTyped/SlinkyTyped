package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpike extends js.Object {
  def pike_check_req(): Double = js.native
}

object Typeofpike {
  @scala.inline
  def apply(pike_check_req: () => Double): Typeofpike = {
    val __obj = js.Dynamic.literal(pike_check_req = js.Any.fromFunction0(pike_check_req))
    __obj.asInstanceOf[Typeofpike]
  }
  @scala.inline
  implicit class TypeofpikeOps[Self <: Typeofpike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPike_check_req(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pike_check_req")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

