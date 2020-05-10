package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignEmailMessage extends js.Object {
  /**
    * The email text body.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.native
  /**
    * The email html body.
    */
  var HtmlBody: js.UndefOr[String] = js.native
  /**
    * The email title (Or subject).
    */
  var Title: js.UndefOr[String] = js.native
}

object CampaignEmailMessage {
  @scala.inline
  def apply(): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignEmailMessage]
  }
  @scala.inline
  implicit class CampaignEmailMessageOps[Self <: CampaignEmailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

