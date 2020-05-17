package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmaxfwd extends js.Object {
  def is_maxfwd_lt(limit: Double): Double = js.native
  def process_maxfwd(limit: Double): Double = js.native
}

object Typeofmaxfwd {
  @scala.inline
  def apply(is_maxfwd_lt: Double => Double, process_maxfwd: Double => Double): Typeofmaxfwd = {
    val __obj = js.Dynamic.literal(is_maxfwd_lt = js.Any.fromFunction1(is_maxfwd_lt), process_maxfwd = js.Any.fromFunction1(process_maxfwd))
    __obj.asInstanceOf[Typeofmaxfwd]
  }
  @scala.inline
  implicit class TypeofmaxfwdOps[Self <: Typeofmaxfwd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_maxfwd_lt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_maxfwd_lt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcess_maxfwd(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_maxfwd")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

