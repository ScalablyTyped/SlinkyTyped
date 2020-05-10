package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAlt
import typingsSlinky.gapiClientYoutube.AnonChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /**
    * Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
    *
    * Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to
    * use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the
    * playlistItems.insert() method to mark a video as a favorite.
    */
  def insert(request: AnonAlt): Request_[Activity] = js.native
  /**
    * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel,
    * events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
    */
  def list(request: AnonChannelId): Request_[ActivityListResponse] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(insert: AnonAlt => Request_[Activity], list: AnonChannelId => Request_[ActivityListResponse]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ActivitiesResource]
  }
  @scala.inline
  implicit class ActivitiesResourceOps[Self <: ActivitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonAlt => Request_[Activity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonChannelId => Request_[ActivityListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

