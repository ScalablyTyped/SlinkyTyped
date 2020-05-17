package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.AltBroadcastStatus
import typingsSlinky.gapiClientYoutube.anon.AltFields
import typingsSlinky.gapiClientYoutube.anon.BroadcastStatus
import typingsSlinky.gapiClientYoutube.anon.DisplaySlate
import typingsSlinky.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typingsSlinky.gapiClientYoutube.anon.StreamId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: StreamId): Request[LiveBroadcast] = js.native
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: DisplaySlate): Request[LiveBroadcast] = js.native
  /** Deletes a broadcast. */
  def delete(request: AltFields): Request[Unit] = js.native
  /** Creates a broadcast. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[LiveBroadcast] = js.native
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: BroadcastStatus): Request[LiveBroadcastListResponse] = js.native
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: AltBroadcastStatus): Request[LiveBroadcast] = js.native
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: OnBehalfOfContentOwnerChannel): Request[LiveBroadcast] = js.native
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: StreamId => Request[LiveBroadcast],
    control: DisplaySlate => Request[LiveBroadcast],
    delete: AltFields => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[LiveBroadcast],
    list: BroadcastStatus => Request[LiveBroadcastListResponse],
    transition: AltBroadcastStatus => Request[LiveBroadcast],
    update: OnBehalfOfContentOwnerChannel => Request[LiveBroadcast]
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
    def withBind(value: StreamId => Request[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withControl(value: DisplaySlate => Request[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AltFields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: OnBehalfOfContentOwnerChannel => Request[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: BroadcastStatus => Request[LiveBroadcastListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransition(value: AltBroadcastStatus => Request[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: OnBehalfOfContentOwnerChannel => Request[LiveBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

