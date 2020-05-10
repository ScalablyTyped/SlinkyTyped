package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemObservationsResponse extends js.Object {
  /**
    * Observations related to the problem.
    */
  var RelatedObservations: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.RelatedObservations] = js.native
}

object DescribeProblemObservationsResponse {
  @scala.inline
  def apply(): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
  @scala.inline
  implicit class DescribeProblemObservationsResponseOps[Self <: DescribeProblemObservationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedObservations(value: RelatedObservations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedObservations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedObservations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedObservations")(js.undefined)
        ret
    }
  }
  
}

