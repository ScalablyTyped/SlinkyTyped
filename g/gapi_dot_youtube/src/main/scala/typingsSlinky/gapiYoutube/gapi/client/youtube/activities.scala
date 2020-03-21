package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonChannelId
import typingsSlinky.gapiYoutube.AnonPart
import typingsSlinky.gapiYoutube.GoogleApiYouTubeActivityResource
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: AnonChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
}

object activities {
  @scala.inline
  def apply(
    insert: AnonPart => HttpRequest[GoogleApiYouTubeActivityResource],
    list: AnonChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[activities]
  }
}

