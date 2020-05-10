package typingsSlinky.flight.Flight_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdviceStatic extends js.Object {
  def withAdvice(): js.Function = js.native
}

object AdviceStatic {
  @scala.inline
  def apply(withAdvice: () => js.Function): AdviceStatic = {
    val __obj = js.Dynamic.literal(withAdvice = js.Any.fromFunction0(withAdvice))
    __obj.asInstanceOf[AdviceStatic]
  }
  @scala.inline
  implicit class AdviceStaticOps[Self <: AdviceStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithAdvice(value: () => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAdvice")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

