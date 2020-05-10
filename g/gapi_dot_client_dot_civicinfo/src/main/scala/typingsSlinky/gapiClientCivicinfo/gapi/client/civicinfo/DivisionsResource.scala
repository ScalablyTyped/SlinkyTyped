package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCivicinfo.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: AnonAlt): Request_[DivisionSearchResponse] = js.native
}

object DivisionsResource {
  @scala.inline
  def apply(search: AnonAlt => Request_[DivisionSearchResponse]): DivisionsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[DivisionsResource]
  }
  @scala.inline
  implicit class DivisionsResourceOps[Self <: DivisionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: AnonAlt => Request_[DivisionSearchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

