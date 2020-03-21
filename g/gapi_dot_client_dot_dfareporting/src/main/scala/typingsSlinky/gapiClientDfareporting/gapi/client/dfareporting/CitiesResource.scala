package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: AnonCountryDartIds): Request_[CitiesListResponse]
}

object CitiesResource {
  @scala.inline
  def apply(list: AnonCountryDartIds => Request_[CitiesListResponse]): CitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CitiesResource]
  }
}

