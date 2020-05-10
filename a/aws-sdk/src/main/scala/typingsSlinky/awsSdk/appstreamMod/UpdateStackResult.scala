package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackResult extends js.Object {
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Stack] = js.native
}

object UpdateStackResult {
  @scala.inline
  def apply(): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackResult]
  }
  @scala.inline
  implicit class UpdateStackResultOps[Self <: UpdateStackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStack(value: Stack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stack")(js.undefined)
        ret
    }
  }
  
}

