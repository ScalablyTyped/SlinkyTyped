package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObservationResponse extends js.Object {
  /**
    * Information about the observation.
    */
  var Observation: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Observation] = js.native
}

object DescribeObservationResponse {
  @scala.inline
  def apply(): DescribeObservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeObservationResponse]
  }
  @scala.inline
  implicit class DescribeObservationResponseOps[Self <: DescribeObservationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObservation(value: Observation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Observation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Observation")(js.undefined)
        ret
    }
  }
  
}

