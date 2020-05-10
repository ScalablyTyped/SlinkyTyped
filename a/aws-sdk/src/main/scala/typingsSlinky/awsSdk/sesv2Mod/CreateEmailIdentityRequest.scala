package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailIdentityRequest extends js.Object {
  /**
    * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, as opposed to the default method, Easy DKIM. You can only specify this object if the email identity is a domain, as opposed to an address.
    */
  var DkimSigningAttributes: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DkimSigningAttributes] = js.native
  /**
    * The email address or domain that you want to verify.
    */
  var EmailIdentity: Identity = js.native
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
  @scala.inline
  implicit class CreateEmailIdentityRequestOps[Self <: CreateEmailIdentityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDkimSigningAttributes(value: DkimSigningAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimSigningAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkimSigningAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimSigningAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

