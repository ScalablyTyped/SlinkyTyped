package typingsSlinky.chaiSpies.ChaiSpies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resetable extends js.Object {
  /**
    * #### proxy.reset (function)
    *
    * Resets __spy object parameters for instantiation and reuse
    * @returns proxy spy object
    */
  def reset(): this.type = js.native
}

object Resetable {
  @scala.inline
  def apply(reset: () => Resetable): Resetable = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Resetable]
  }
  @scala.inline
  implicit class ResetableOps[Self <: Resetable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: () => Resetable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

