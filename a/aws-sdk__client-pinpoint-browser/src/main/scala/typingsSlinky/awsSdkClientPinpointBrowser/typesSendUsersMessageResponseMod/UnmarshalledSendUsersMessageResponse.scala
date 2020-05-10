package typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSendUsersMessageResponse extends SendUsersMessageResponse {
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  @JSName("Result")
  var Result_UnmarshalledSendUsersMessageResponse: js.UndefOr[StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]]] = js.native
}

object UnmarshalledSendUsersMessageResponse {
  @scala.inline
  def apply(): UnmarshalledSendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSendUsersMessageResponse]
  }
  @scala.inline
  implicit class UnmarshalledSendUsersMessageResponseOps[Self <: UnmarshalledSendUsersMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]]): Self = {
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

