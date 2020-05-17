package typingsSlinky.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reject extends js.Object {
  var reject: js.Function = js.native
  var resolve: js.Function = js.native
}

object Reject {
  @scala.inline
  def apply(reject: js.Function, resolve: js.Function): Reject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
  @scala.inline
  implicit class RejectOps[Self <: Reject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReject(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

