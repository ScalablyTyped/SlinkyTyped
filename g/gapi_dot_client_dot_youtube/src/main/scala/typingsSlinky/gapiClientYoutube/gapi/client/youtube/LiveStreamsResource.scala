package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAltFields
import typingsSlinky.gapiClientYoutube.AnonMine
import typingsSlinky.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AnonAltFields): Request_[Unit] = js.native
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream] = js.native
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: AnonMine): Request_[LiveStreamListResponse] = js.native
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream] = js.native
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream],
    list: AnonMine => Request_[LiveStreamListResponse],
    update: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LiveStreamsResource]
  }
  @scala.inline
  implicit class LiveStreamsResourceOps[Self <: LiveStreamsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAltFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMine => Request_[LiveStreamListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

