package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonChannelIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: AnonChannelIdFields): Request_[Unit] = js.native
  /** Deletes a channel's watermark image. */
  def unset(request: AnonChannelIdFields): Request_[Unit] = js.native
}

object WatermarksResource {
  @scala.inline
  def apply(set: AnonChannelIdFields => Request_[Unit], unset: AnonChannelIdFields => Request_[Unit]): WatermarksResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[WatermarksResource]
  }
  @scala.inline
  implicit class WatermarksResourceOps[Self <: WatermarksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet(value: AnonChannelIdFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnset(value: AnonChannelIdFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unset")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

