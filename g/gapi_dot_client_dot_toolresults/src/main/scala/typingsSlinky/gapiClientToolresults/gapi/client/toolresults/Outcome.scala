package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outcome extends js.Object {
  /**
    * More information about a FAILURE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE.
    *
    * Optional
    */
  var failureDetail: js.UndefOr[FailureDetail] = js.native
  /**
    * More information about an INCONCLUSIVE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE.
    *
    * Optional
    */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.native
  /**
    * More information about a SKIPPED outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED.
    *
    * Optional
    */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.native
  /**
    * More information about a SUCCESS outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS.
    *
    * Optional
    */
  var successDetail: js.UndefOr[SuccessDetail] = js.native
  /**
    * The simplest way to interpret a result.
    *
    * Required
    */
  var summary: js.UndefOr[String] = js.native
}

object Outcome {
  @scala.inline
  def apply(): Outcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outcome]
  }
  @scala.inline
  implicit class OutcomeOps[Self <: Outcome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureDetail(value: FailureDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withInconclusiveDetail(value: InconclusiveDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inconclusiveDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInconclusiveDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inconclusiveDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedDetail(value: SkippedDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessDetail(value: SuccessDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

