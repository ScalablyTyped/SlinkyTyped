package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysStartRequest extends js.Object {
  /** Threshold to start a survey automically if the quoted prices is less than or equal to this value. See Survey.Cost for more details. */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
}

object SurveysStartRequest {
  @scala.inline
  def apply(): SurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveysStartRequest]
  }
  @scala.inline
  implicit class SurveysStartRequestOps[Self <: SurveysStartRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCostPerResponseNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCostPerResponseNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(js.undefined)
        ret
    }
  }
  
}

