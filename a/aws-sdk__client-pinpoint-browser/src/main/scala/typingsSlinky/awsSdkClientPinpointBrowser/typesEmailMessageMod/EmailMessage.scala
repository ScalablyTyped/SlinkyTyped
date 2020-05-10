package typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail
import typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[String] = js.native
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.native
  /**
    * An email represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail] = js.native
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * An email composed of a subject, a text part and a html part.
    */
  var SimpleEmail: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.native
}

object EmailMessage {
  @scala.inline
  def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessage]
  }
  @scala.inline
  implicit class EmailMessageOps[Self <: EmailMessage] (val x: Self) extends AnyVal {
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
    def withFeedbackForwardingAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackForwardingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingAddress")(js.undefined)
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
    def withRawEmail(value: RawEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToAddressesIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyToAddresses(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleEmail(value: SimpleEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutionsIterable(value: js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubstitutions(
      value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

