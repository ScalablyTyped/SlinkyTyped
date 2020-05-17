package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typingsSlinky.gapiYoutube.GoogleApiYouTubeVideoResource
import typingsSlinky.gapiYoutube.anon.AutoLevels
import typingsSlinky.gapiYoutube.anon.Chart
import typingsSlinky.gapiYoutube.anon.IdOnBehalfOfContentOwner
import typingsSlinky.gapiYoutube.anon.OnBehalfOfContentOwnerRating
import typingsSlinky.gapiYoutube.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse] = js.native
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: AutoLevels): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: Chart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]] = js.native
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: OnBehalfOfContentOwnerRating): HttpRequest[_] = js.native
  /**
    * Updates a video's metadata.
    */
  def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
}

object videos {
  @scala.inline
  def apply(
    delete: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
    getRating: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
    insert: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
    list: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
    rate: OnBehalfOfContentOwnerRating => HttpRequest[_],
    update: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[videos]
  }
  @scala.inline
  implicit class videosOps[Self <: videos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRating(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRate(value: OnBehalfOfContentOwnerRating => HttpRequest[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

