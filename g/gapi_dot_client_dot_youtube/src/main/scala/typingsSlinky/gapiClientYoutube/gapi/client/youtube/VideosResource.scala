package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAutoLevels
import typingsSlinky.gapiClientYoutube.AnonChart
import typingsSlinky.gapiClientYoutube.AnonKeyOauthtoken
import typingsSlinky.gapiClientYoutube.AnonPart
import typingsSlinky.gapiClientYoutube.AnonPrettyPrint
import typingsSlinky.gapiClientYoutube.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: AnonPrettyPrint): Request_[VideoGetRatingResponse] = js.native
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AnonAutoLevels): Request_[Video] = js.native
  /** Returns a list of videos that match the API request parameters. */
  def list(request: AnonChart): Request_[VideoListResponse] = js.native
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: AnonRating): Request_[Unit] = js.native
  /** Report abuse for a video. */
  def reportAbuse(request: AnonKeyOauthtoken): Request_[Unit] = js.native
  /** Updates a video's metadata. */
  def update(request: AnonPart): Request_[Video] = js.native
}

object VideosResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    getRating: AnonPrettyPrint => Request_[VideoGetRatingResponse],
    insert: AnonAutoLevels => Request_[Video],
    list: AnonChart => Request_[VideoListResponse],
    rate: AnonRating => Request_[Unit],
    reportAbuse: AnonKeyOauthtoken => Request_[Unit],
    update: AnonPart => Request_[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VideosResource]
  }
  @scala.inline
  implicit class VideosResourceOps[Self <: VideosResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRating(value: AnonPrettyPrint => Request_[VideoGetRatingResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAutoLevels => Request_[Video]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonChart => Request_[VideoListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRate(value: AnonRating => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportAbuse(value: AnonKeyOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportAbuse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPart => Request_[Video]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

