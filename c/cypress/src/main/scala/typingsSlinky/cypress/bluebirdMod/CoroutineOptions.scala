package typingsSlinky.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoroutineOptions extends js.Object {
  def yieldHandler(value: js.Any): js.Any = js.native
}

object CoroutineOptions {
  @scala.inline
  def apply(yieldHandler: js.Any => js.Any): CoroutineOptions = {
    val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
    __obj.asInstanceOf[CoroutineOptions]
  }
  @scala.inline
  implicit class CoroutineOptionsOps[Self <: CoroutineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withYieldHandler(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yieldHandler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

