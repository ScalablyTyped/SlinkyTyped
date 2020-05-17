package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AboutResource extends js.Object {
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(request: Alt): Request[About] = js.native
}

object AboutResource {
  @scala.inline
  def apply(get: Alt => Request[About]): AboutResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AboutResource]
  }
  @scala.inline
  implicit class AboutResourceOps[Self <: AboutResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[About]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

