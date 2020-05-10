package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCaseResponse extends js.Object {
  /**
    * The status of the case after the ResolveCase request was processed.
    */
  var finalCaseStatus: js.UndefOr[CaseStatus] = js.native
  /**
    * The status of the case when the ResolveCase request was sent.
    */
  var initialCaseStatus: js.UndefOr[CaseStatus] = js.native
}

object ResolveCaseResponse {
  @scala.inline
  def apply(): ResolveCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCaseResponse]
  }
  @scala.inline
  implicit class ResolveCaseResponseOps[Self <: ResolveCaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalCaseStatus(value: CaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalCaseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalCaseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalCaseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCaseStatus(value: CaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCaseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCaseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCaseStatus")(js.undefined)
        ret
    }
  }
  
}

