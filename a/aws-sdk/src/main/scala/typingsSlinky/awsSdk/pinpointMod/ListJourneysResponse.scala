package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJourneysResponse extends js.Object {
  var JourneysResponse: typingsSlinky.awsSdk.pinpointMod.JourneysResponse = js.native
}

object ListJourneysResponse {
  @scala.inline
  def apply(JourneysResponse: JourneysResponse): ListJourneysResponse = {
    val __obj = js.Dynamic.literal(JourneysResponse = JourneysResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJourneysResponse]
  }
  @scala.inline
  implicit class ListJourneysResponseOps[Self <: ListJourneysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJourneysResponse(value: JourneysResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneysResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

