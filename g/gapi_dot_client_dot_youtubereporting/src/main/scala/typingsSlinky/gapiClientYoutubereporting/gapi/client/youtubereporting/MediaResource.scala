package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutubereporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: Key): Request[Media] = js.native
}

object MediaResource {
  @scala.inline
  def apply(download: Key => Request[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
    __obj.asInstanceOf[MediaResource]
  }
  @scala.inline
  implicit class MediaResourceOps[Self <: MediaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: Key => Request[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

