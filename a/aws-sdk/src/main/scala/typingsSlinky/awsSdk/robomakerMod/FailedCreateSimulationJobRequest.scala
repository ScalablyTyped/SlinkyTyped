package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateSimulationJobRequest extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch failed.
    */
  var failedAt: js.UndefOr[js.Date] = js.native
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.native
  /**
    * The failure reason of the simulation job request.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The simulation job request.
    */
  var request: js.UndefOr[SimulationJobRequest] = js.native
}

object FailedCreateSimulationJobRequest {
  @scala.inline
  def apply(): FailedCreateSimulationJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateSimulationJobRequest]
  }
  @scala.inline
  implicit class FailedCreateSimulationJobRequestOps[Self <: FailedCreateSimulationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: SimulationJobErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: SimulationJobRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

