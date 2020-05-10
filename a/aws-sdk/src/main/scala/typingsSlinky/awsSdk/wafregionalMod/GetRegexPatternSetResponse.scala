package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexPatternSetResponse extends js.Object {
  /**
    * Information about the RegexPatternSet that you specified in the GetRegexPatternSet request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for. 
    */
  var RegexPatternSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RegexPatternSet] = js.native
}

object GetRegexPatternSetResponse {
  @scala.inline
  def apply(): GetRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegexPatternSetResponse]
  }
  @scala.inline
  implicit class GetRegexPatternSetResponseOps[Self <: GetRegexPatternSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegexPatternSet(value: RegexPatternSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexPatternSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSet")(js.undefined)
        ret
    }
  }
  
}

