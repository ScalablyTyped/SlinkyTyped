package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDoubleclickbidmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: Fields): Request[ListReportsResponse] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(listreports: Fields => Request[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(listreports = js.Any.fromFunction1(listreports))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListreports(value: Fields => Request[ListReportsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listreports")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

