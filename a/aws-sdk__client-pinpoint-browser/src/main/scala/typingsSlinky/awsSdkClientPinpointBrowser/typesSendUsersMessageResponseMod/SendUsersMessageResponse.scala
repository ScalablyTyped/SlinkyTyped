package typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessageResponse extends js.Object {
  /**
    * The unique ID of the Amazon Pinpoint project used to send the message.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The unique ID assigned to the users-messages request.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[
    (StringDictionary[
      StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
    ]) | (js.Iterable[
      js.Tuple2[
        String, 
        StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
      ]
    ])
  ] = js.native
}

object SendUsersMessageResponse {
  @scala.inline
  def apply(): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
  @scala.inline
  implicit class SendUsersMessageResponseOps[Self <: SendUsersMessageResponse] (val x: Self) extends AnyVal {
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
    def withResultIterable(
      value: js.Iterable[
          js.Tuple2[
            String, 
            StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(
      value: (StringDictionary[
          StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
        ]) | (js.Iterable[
          js.Tuple2[
            String, 
            StringDictionary[EndpointMessageResult] | (js.Iterable[js.Tuple2[String, EndpointMessageResult]])
          ]
        ])
    ): Self = {
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

