package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonCategoryId
import typingsSlinky.gapiYoutube.AnonRequestBody
import typingsSlinky.gapiYoutube.GoogleApiYouTubeChannelResource
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channels extends js.Object {
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: AnonCategoryId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: AnonRequestBody): HttpRequest[GoogleApiYouTubeChannelResource]
}

object channels {
  @scala.inline
  def apply(
    list: AnonCategoryId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]],
    update: AnonRequestBody => HttpRequest[GoogleApiYouTubeChannelResource]
  ): channels = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[channels]
  }
}

