package typingsSlinky.gapiClientSlides.gapi.client.slides

import typingsSlinky.gapiClientSlides.anon.Accesstoken
import typingsSlinky.gapiClientSlides.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: Accesstoken): typingsSlinky.gapiClient.gapi.client.Request[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: Alt): typingsSlinky.gapiClient.gapi.client.Request[Thumbnail]
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
}

