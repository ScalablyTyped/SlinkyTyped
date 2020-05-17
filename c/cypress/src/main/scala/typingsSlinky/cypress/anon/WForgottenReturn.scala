package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WForgottenReturn extends js.Object {
  /** Enables all warnings except forgotten return statements. */
  var wForgottenReturn: Boolean = js.native
}

object WForgottenReturn {
  @scala.inline
  def apply(wForgottenReturn: Boolean): WForgottenReturn = {
    val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WForgottenReturn]
  }
  @scala.inline
  implicit class WForgottenReturnOps[Self <: WForgottenReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWForgottenReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wForgottenReturn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

