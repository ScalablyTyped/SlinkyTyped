package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.CategoryId
import typingsSlinky.gapiClientYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: CategoryId): Request[ChannelListResponse] = js.native
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: Part): Request[Channel] = js.native
}

object ChannelsResource {
  @scala.inline
  def apply(list: CategoryId => Request[ChannelListResponse], update: Part => Request[Channel]): ChannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ChannelsResource]
  }
  @scala.inline
  implicit class ChannelsResourceOps[Self <: ChannelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: CategoryId => Request[ChannelListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Part => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

