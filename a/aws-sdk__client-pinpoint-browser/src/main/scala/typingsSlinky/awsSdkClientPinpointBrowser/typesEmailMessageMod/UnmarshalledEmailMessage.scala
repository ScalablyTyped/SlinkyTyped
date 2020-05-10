package typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesRawEmailMod.UnmarshalledRawEmail
import typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailMod.UnmarshalledSimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEmailMessage extends EmailMessage {
  /**
    * An email represented as a raw MIME message.
    */
  @JSName("RawEmail")
  var RawEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledRawEmail] = js.native
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  @JSName("ReplyToAddresses")
  var ReplyToAddresses_UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.native
  /**
    * An email composed of a subject, a text part and a html part.
    */
  @JSName("SimpleEmail")
  var SimpleEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledSimpleEmail] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledEmailMessage {
  @scala.inline
  def apply(): UnmarshalledEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEmailMessage]
  }
  @scala.inline
  implicit class UnmarshalledEmailMessageOps[Self <: UnmarshalledEmailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawEmail(value: UnmarshalledRawEmail): Self = {
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
    def withReplyToAddresses(value: js.Array[String]): Self = {
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
    def withSimpleEmail(value: UnmarshalledSimpleEmail): Self = {
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
    def withSubstitutions(value: StringDictionary[js.Array[String]]): Self = {
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

