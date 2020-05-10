package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonFields
import typingsSlinky.gapiClientYoutube.AnonId
import typingsSlinky.gapiClientYoutube.AnonKey
import typingsSlinky.gapiClientYoutube.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: AnonId): Request_[Unit] = js.native
  /** Uploads a caption track. */
  def insert(request: AnonKey): Request_[Caption] = js.native
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: AnonOauthtoken): Request_[CaptionListResponse] = js.native
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: AnonKey): Request_[Caption] = js.native
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    download: AnonId => Request_[Unit],
    insert: AnonKey => Request_[Caption],
    list: AnonOauthtoken => Request_[CaptionListResponse],
    update: AnonKey => Request_[Caption]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), download = js.Any.fromFunction1(download), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CaptionsResource]
  }
  @scala.inline
  implicit class CaptionsResourceOps[Self <: CaptionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownload(value: AnonId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Caption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[CaptionListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Caption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

