package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCognitoEventsResponse extends js.Object {
  /**
    * The Cognito Events returned from the GetCognitoEvents request
    */
  var Events: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.Events] = js.native
}

object GetCognitoEventsResponse {
  @scala.inline
  def apply(): GetCognitoEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCognitoEventsResponse]
  }
  @scala.inline
  implicit class GetCognitoEventsResponseOps[Self <: GetCognitoEventsResponse] (val x: Self) extends AnyVal {
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
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
  }
  
}

