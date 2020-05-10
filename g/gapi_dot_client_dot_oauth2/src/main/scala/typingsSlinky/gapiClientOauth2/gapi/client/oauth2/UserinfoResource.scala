package typingsSlinky.gapiClientOauth2.gapi.client.oauth2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserinfoResource extends js.Object {
  var v2: V2Resource = js.native
  def get(request: AnonAlt): Request_[Userinfoplus] = js.native
}

object UserinfoResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Userinfoplus], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResource]
  }
  @scala.inline
  implicit class UserinfoResourceOps[Self <: UserinfoResource] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withV2(value: V2Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

