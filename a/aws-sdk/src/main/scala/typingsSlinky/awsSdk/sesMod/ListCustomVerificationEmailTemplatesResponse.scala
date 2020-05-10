package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
  /**
    * A list of the custom verification email templates that exist in your account.
    */
  var CustomVerificationEmailTemplates: js.UndefOr[typingsSlinky.awsSdk.sesMod.CustomVerificationEmailTemplates] = js.native
  /**
    * A token indicating that there are additional custom verification email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 custom verification email templates.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
}

object ListCustomVerificationEmailTemplatesResponse {
  @scala.inline
  def apply(): ListCustomVerificationEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
  }
  @scala.inline
  implicit class ListCustomVerificationEmailTemplatesResponseOps[Self <: ListCustomVerificationEmailTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomVerificationEmailTemplates(value: CustomVerificationEmailTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomVerificationEmailTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomVerificationEmailTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomVerificationEmailTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

