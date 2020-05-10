package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSurveysStartRequest extends js.Object {
  /**
    * *Deprecated* Threshold to start a survey automatically if the quoted
    * prices is less than or equal to this value. See Survey.Cost for more
    * details. This will no longer be available after June 2018.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
}

object SchemaSurveysStartRequest {
  @scala.inline
  def apply(): SchemaSurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysStartRequest]
  }
  @scala.inline
  implicit class SchemaSurveysStartRequestOps[Self <: SchemaSurveysStartRequest] (val x: Self) extends AnyVal {
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

