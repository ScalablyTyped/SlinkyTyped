package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunDetails extends js.Object {
  var failedExpectations: js.Array[ExpectationResult] = js.native
  var order: Order = js.native
}

object RunDetails {
  @scala.inline
  def apply(failedExpectations: js.Array[ExpectationResult], order: Order): RunDetails = {
    val __obj = js.Dynamic.literal(failedExpectations = failedExpectations.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
  @scala.inline
  implicit class RunDetailsOps[Self <: RunDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedExpectations(value: js.Array[ExpectationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

