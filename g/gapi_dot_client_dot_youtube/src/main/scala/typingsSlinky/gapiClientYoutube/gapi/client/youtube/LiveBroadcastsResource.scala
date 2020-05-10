package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAltBroadcastStatus
import typingsSlinky.gapiClientYoutube.AnonAltFields
import typingsSlinky.gapiClientYoutube.AnonBroadcastStatus
import typingsSlinky.gapiClientYoutube.AnonDisplaySlate
import typingsSlinky.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typingsSlinky.gapiClientYoutube.AnonStreamId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: AnonStreamId): Request_[LiveBroadcast] = js.native
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: AnonDisplaySlate): Request_[LiveBroadcast] = js.native
  /** Deletes a broadcast. */
  def delete(request: AnonAltFields): Request_[Unit] = js.native
  /** Creates a broadcast. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast] = js.native
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: AnonBroadcastStatus): Request_[LiveBroadcastListResponse] = js.native
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: AnonAltBroadcastStatus): Request_[LiveBroadcast] = js.native
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast] = js.native
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: AnonStreamId => Request_[LiveBroadcast],
    control: AnonDisplaySlate => Request_[LiveBroadcast],
    delete: AnonAltFields => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast],
    list: AnonBroadcastStatus => Request_[LiveBroadcastListResponse],
    transition: AnonAltBroadcastStatus => Request_[LiveBroadcast],
    update: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), control = js.Any.fromFunction1(control), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), transition = js.Any.fromFunction1(transition), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
  @scala.inline
  implicit class LiveBroadcastsResourceOps[Self <: LiveBroadcastsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: AnonStreamId => Request_[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withControl(value: AnonDisplaySlate => Request_[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAltFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBroadcastStatus => Request_[LiveBroadcastListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransition(value: AnonAltBroadcastStatus => Request_[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

