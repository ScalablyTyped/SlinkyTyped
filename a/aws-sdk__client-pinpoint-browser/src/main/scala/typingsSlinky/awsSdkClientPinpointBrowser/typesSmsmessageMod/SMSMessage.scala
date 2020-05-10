package typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[String] = js.native
  /**
    * Is this a transaction priority message or lower priority.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.native
  /**
    * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
    */
  var OriginationNumber: js.UndefOr[String] = js.native
  /**
    * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[String] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.native
}

object SMSMessage {
  @scala.inline
  def apply(): SMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMessage]
  }
  @scala.inline
  implicit class SMSMessageOps[Self <: SMSMessage] (val x: Self) extends AnyVal {
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
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginationNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginationNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(js.undefined)
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

