package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofimc extends js.Object {
  def imc_manager(): Double = js.native
}

object Typeofimc {
  @scala.inline
  def apply(imc_manager: () => Double): Typeofimc = {
    val __obj = js.Dynamic.literal(imc_manager = js.Any.fromFunction0(imc_manager))
    __obj.asInstanceOf[Typeofimc]
  }
  @scala.inline
  implicit class TypeofimcOps[Self <: Typeofimc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImc_manager(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imc_manager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

