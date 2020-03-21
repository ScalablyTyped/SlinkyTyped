package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDoubleclickbidmanager.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: AnonAlt): Request_[DownloadResponse]
}

object SdfResource {
  @scala.inline
  def apply(download: AnonAlt => Request_[DownloadResponse]): SdfResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
  
    __obj.asInstanceOf[SdfResource]
  }
}

