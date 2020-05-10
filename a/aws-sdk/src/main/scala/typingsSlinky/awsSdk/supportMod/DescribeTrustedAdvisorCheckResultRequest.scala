package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[String] = js.native
}

object DescribeTrustedAdvisorCheckResultRequest {
  @scala.inline
  def apply(checkId: String): DescribeTrustedAdvisorCheckResultRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
  }
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckResultRequestOps[Self <: DescribeTrustedAdvisorCheckResultRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

