package typingsSlinky.gapiClientOauth2.gapi.client.oauth2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeResource extends js.Object {
  def get(request: AnonAlt): Request_[Userinfoplus] = js.native
}

object MeResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[MeResource]
  }
  @scala.inline
  implicit class MeResourceOps[Self <: MeResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAlt => Request_[Userinfoplus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

