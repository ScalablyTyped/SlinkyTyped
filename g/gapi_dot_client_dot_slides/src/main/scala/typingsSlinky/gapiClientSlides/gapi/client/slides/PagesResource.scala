package typingsSlinky.gapiClientSlides.gapi.client.slides

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSlides.AnonAccesstoken
import typingsSlinky.gapiClientSlides.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: AnonAccesstoken): Request_[Page] = js.native
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: AnonAlt): Request_[Thumbnail] = js.native
}

object PagesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[Page], getThumbnail: AnonAlt => Request_[Thumbnail]): PagesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getThumbnail = js.Any.fromFunction1(getThumbnail))
    __obj.asInstanceOf[PagesResource]
  }
  @scala.inline
  implicit class PagesResourceOps[Self <: PagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetThumbnail(value: AnonAlt => Request_[Thumbnail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnail")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

