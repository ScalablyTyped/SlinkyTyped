package typingsSlinky.gapiClientWebfonts.gapi.client.webfonts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientWebfonts.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: AnonAlt): Request_[WebfontList] = js.native
}

object WebfontsResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[WebfontList]): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[WebfontsResource]
  }
  @scala.inline
  implicit class WebfontsResourceOps[Self <: WebfontsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[WebfontList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

