package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonChannelId
import typingsSlinky.gapiYoutube.AnonPart
import typingsSlinky.gapiYoutube.GoogleApiYouTubeActivityResource
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubeActivityResource] = js.native
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: AnonChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]] = js.native
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
  @scala.inline
  implicit class activitiesOps[Self <: activities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonPart => HttpRequest[GoogleApiYouTubeActivityResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(
      value: AnonChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

