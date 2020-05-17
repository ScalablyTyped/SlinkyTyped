package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.AutoLevels
import typingsSlinky.gapiClientYoutube.anon.Chart
import typingsSlinky.gapiClientYoutube.anon.KeyOauthtoken
import typingsSlinky.gapiClientYoutube.anon.Part
import typingsSlinky.gapiClientYoutube.anon.PrettyPrint
import typingsSlinky.gapiClientYoutube.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: PrettyPrint): Request[VideoGetRatingResponse] = js.native
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AutoLevels): Request[Video] = js.native
  /** Returns a list of videos that match the API request parameters. */
  def list(request: Chart): Request[VideoListResponse] = js.native
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: Rating): Request[Unit] = js.native
  /** Report abuse for a video. */
  def reportAbuse(request: KeyOauthtoken): Request[Unit] = js.native
  /** Updates a video's metadata. */
  def update(request: Part): Request[Video] = js.native
}

object VideosResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    getRating: PrettyPrint => Request[VideoGetRatingResponse],
    insert: AutoLevels => Request[Video],
    list: Chart => Request[VideoListResponse],
    rate: Rating => Request[Unit],
    reportAbuse: KeyOauthtoken => Request[Unit],
    update: Part => Request[Video]
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
    def withDelete(value: PrettyPrint => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRating(value: PrettyPrint => Request[VideoGetRatingResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AutoLevels => Request[Video]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Chart => Request[VideoListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRate(value: Rating => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportAbuse(value: KeyOauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportAbuse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Part => Request[Video]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

