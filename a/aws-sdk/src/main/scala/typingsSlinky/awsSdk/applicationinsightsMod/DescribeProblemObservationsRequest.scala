package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemObservationsRequest extends js.Object {
  /**
    * The ID of the problem.
    */
  var ProblemId: typingsSlinky.awsSdk.applicationinsightsMod.ProblemId = js.native
}

object DescribeProblemObservationsRequest {
  @scala.inline
  def apply(ProblemId: ProblemId): DescribeProblemObservationsRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemObservationsRequest]
  }
  @scala.inline
  implicit class DescribeProblemObservationsRequestOps[Self <: DescribeProblemObservationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProblemId(value: ProblemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

