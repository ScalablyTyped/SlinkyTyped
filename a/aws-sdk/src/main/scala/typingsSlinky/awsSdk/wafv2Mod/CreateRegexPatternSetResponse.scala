package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetResponse extends js.Object {
  /**
    * High-level information about a RegexPatternSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a RegexPatternSet, and the ARN, that you provide to the RegexPatternSetReferenceStatement to use the pattern set in a Rule.
    */
  var Summary: js.UndefOr[RegexPatternSetSummary] = js.native
}

object CreateRegexPatternSetResponse {
  @scala.inline
  def apply(): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
  @scala.inline
  implicit class CreateRegexPatternSetResponseOps[Self <: CreateRegexPatternSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary(value: RegexPatternSetSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(js.undefined)
        ret
    }
  }
  
}

