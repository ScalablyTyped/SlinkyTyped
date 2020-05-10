package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * A RegexMatchSet that contains no RegexMatchTuple objects.
    */
  var RegexMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RegexMatchSet] = js.native
}

object CreateRegexMatchSetResponse {
  @scala.inline
  def apply(): CreateRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexMatchSetResponse]
  }
  @scala.inline
  implicit class CreateRegexMatchSetResponseOps[Self <: CreateRegexMatchSetResponse] (val x: Self) extends AnyVal {
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
    def withRegexMatchSet(value: RegexMatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchSet")(js.undefined)
        ret
    }
  }
  
}

