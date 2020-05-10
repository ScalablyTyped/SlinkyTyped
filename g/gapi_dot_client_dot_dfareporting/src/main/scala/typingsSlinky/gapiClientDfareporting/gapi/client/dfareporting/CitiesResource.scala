package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: AnonCountryDartIds): Request_[CitiesListResponse] = js.native
}

object CitiesResource {
  @scala.inline
  def apply(list: AnonCountryDartIds => Request_[CitiesListResponse]): CitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CitiesResource]
  }
  @scala.inline
  implicit class CitiesResourceOps[Self <: CitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonCountryDartIds => Request_[CitiesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

