package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResultMod.MessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageResponse extends js.Object {
  /**
    * Application id of the message.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  var EndpointResult: js.UndefOr[
    StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
  ] = js.native
  /**
    * Original request Id for which this message was delivered.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  var Result: js.UndefOr[
    StringDictionary[MessageResult] | (js.Iterable[js.Tuple2[String, MessageResult]])
  ] = js.native
}

object MessageResponse {
  @scala.inline
  def apply(): MessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageResponse]
  }
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointResultIterable(value: js.Iterable[js.Tuple2[String, EndpointMessageResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointResult(
      value: StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointResult")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withResultIterable(value: js.Iterable[js.Tuple2[String, MessageResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: StringDictionary[MessageResult] | (js.Iterable[js.Tuple2[String, MessageResult]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(js.undefined)
        ret
    }
  }
  
}

