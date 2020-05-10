package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.native
}

object AnonSwallowErrors {
  @scala.inline
  def apply(): AnonSwallowErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSwallowErrors]
  }
  @scala.inline
  implicit class AnonSwallowErrorsOps[Self <: AnonSwallowErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwallowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallowErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwallowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallowErrors")(js.undefined)
        ret
    }
  }
  
}

