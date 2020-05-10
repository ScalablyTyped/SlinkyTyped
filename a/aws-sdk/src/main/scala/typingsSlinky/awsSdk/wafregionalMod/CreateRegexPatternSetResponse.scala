package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * A RegexPatternSet that contains no objects.
    */
  var RegexPatternSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RegexPatternSet] = js.native
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
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(js.undefined)
        ret
    }
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

