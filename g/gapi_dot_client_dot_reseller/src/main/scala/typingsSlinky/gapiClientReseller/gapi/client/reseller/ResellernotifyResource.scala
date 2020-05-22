package typingsSlinky.gapiClientReseller.gapi.client.reseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientReseller.anon.Alt
import typingsSlinky.gapiClientReseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.undefined
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: Alt): Request[ResellernotifyGetwatchdetailsResponse]
  /** Registers a Reseller for receiving notifications. */
  def register(request: Fields): Request[ResellernotifyResource]
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: Fields): Request[ResellernotifyResource]
}

object ResellernotifyResource {
  @scala.inline
  def apply(
    getwatchdetails: Alt => Request[ResellernotifyGetwatchdetailsResponse],
    register: Fields => Request[ResellernotifyResource],
    unregister: Fields => Request[ResellernotifyResource],
    topicName: String = null
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal(getwatchdetails = js.Any.fromFunction1(getwatchdetails), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

