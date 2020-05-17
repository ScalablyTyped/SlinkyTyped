package typingsSlinky.gapiClientSlides.gapi.client.slides

import typingsSlinky.gapiClientSlides.anon.Accesstoken
import typingsSlinky.gapiClientSlides.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: Accesstoken): typingsSlinky.gapiClient.gapi.client.Request[Page] = js.native
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: Alt): typingsSlinky.gapiClient.gapi.client.Request[Thumbnail] = js.native
}

object PagesResource {
  @scala.inline
  def apply(
    get: Accesstoken => typingsSlinky.gapiClient.gapi.client.Request[Page],
    getThumbnail: Alt => typingsSlinky.gapiClient.gapi.client.Request[Thumbnail]
  ): PagesResource = {
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
    def withGet(value: Accesstoken => typingsSlinky.gapiClient.gapi.client.Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetThumbnail(value: Alt => typingsSlinky.gapiClient.gapi.client.Request[Thumbnail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnail")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

