package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanGateway extends js.Object {
  def all(): js.Promise[js.Array[Plan]] = js.native
}

object PlanGateway {
  @scala.inline
  def apply(all: () => js.Promise[js.Array[Plan]]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[PlanGateway]
  }
  @scala.inline
  implicit class PlanGatewayOps[Self <: PlanGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: () => js.Promise[js.Array[Plan]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

