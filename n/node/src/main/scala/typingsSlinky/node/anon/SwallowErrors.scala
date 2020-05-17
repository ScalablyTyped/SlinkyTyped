package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.native
}

object SwallowErrors {
  @scala.inline
  def apply(): SwallowErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwallowErrors]
  }
  @scala.inline
  implicit class SwallowErrorsOps[Self <: SwallowErrors] (val x: Self) extends AnyVal {
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

