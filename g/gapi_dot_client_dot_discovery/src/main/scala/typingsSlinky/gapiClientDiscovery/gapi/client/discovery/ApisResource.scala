package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDiscovery.AnonAlt
import typingsSlinky.gapiClientDiscovery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: AnonAlt): Request_[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: AnonFields): Request_[DirectoryList]
}

object ApisResource {
  @scala.inline
  def apply(getRest: AnonAlt => Request_[RestDescription], list: AnonFields => Request_[DirectoryList]): ApisResource = {
    val __obj = js.Dynamic.literal(getRest = js.Any.fromFunction1(getRest), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ApisResource]
  }
}

