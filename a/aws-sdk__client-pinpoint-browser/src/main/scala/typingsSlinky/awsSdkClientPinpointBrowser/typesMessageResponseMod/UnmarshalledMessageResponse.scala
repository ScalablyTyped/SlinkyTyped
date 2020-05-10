package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResultMod.UnmarshalledMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMessageResponse extends MessageResponse {
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  @JSName("EndpointResult")
  var EndpointResult_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledEndpointMessageResult]] = js.native
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  @JSName("Result")
  var Result_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledMessageResult]] = js.native
}

object UnmarshalledMessageResponse {
  @scala.inline
  def apply(): UnmarshalledMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMessageResponse]
  }
  @scala.inline
  implicit class UnmarshalledMessageResponseOps[Self <: UnmarshalledMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointResult(value: StringDictionary[UnmarshalledEndpointMessageResult]): Self = {
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
    def withResult(value: StringDictionary[UnmarshalledMessageResult]): Self = {
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

