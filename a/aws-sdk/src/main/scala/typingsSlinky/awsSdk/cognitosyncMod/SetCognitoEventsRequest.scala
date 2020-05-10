package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCognitoEventsRequest extends js.Object {
  /**
    * The events to configure
    */
  var Events: typingsSlinky.awsSdk.cognitosyncMod.Events = js.native
  /**
    * The Cognito Identity Pool to use when configuring Cognito Events
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object SetCognitoEventsRequest {
  @scala.inline
  def apply(Events: Events, IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCognitoEventsRequest]
  }
  @scala.inline
  implicit class SetCognitoEventsRequestOps[Self <: SetCognitoEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Events): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

