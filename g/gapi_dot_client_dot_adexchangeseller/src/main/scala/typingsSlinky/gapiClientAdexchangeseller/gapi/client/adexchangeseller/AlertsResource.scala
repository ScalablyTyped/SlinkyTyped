package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangeseller.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertsResource extends js.Object {
  /** List the alerts for this Ad Exchange account. */
  def list(request: AnonAlt): Request_[Alerts]
}

object AlertsResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[Alerts]): AlertsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AlertsResource]
  }
}

