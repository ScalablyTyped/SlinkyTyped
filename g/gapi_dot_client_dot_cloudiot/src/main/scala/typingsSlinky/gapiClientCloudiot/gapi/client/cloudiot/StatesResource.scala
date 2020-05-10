package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudiot.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: AnonAlt): Request_[ListDeviceStatesResponse] = js.native
}

object StatesResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListDeviceStatesResponse]): StatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[StatesResource]
  }
  @scala.inline
  implicit class StatesResourceOps[Self <: StatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[ListDeviceStatesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

