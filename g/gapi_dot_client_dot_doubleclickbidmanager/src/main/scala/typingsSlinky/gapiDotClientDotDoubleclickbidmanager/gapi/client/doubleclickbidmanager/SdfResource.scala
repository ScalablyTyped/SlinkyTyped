package typingsSlinky.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDoubleclickbidmanager.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: Anon_Alt): Request[DownloadResponse]
}

object SdfResource {
  @scala.inline
  def apply(download: Anon_Alt => Request[DownloadResponse]): SdfResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
  
    __obj.asInstanceOf[SdfResource]
  }
}

