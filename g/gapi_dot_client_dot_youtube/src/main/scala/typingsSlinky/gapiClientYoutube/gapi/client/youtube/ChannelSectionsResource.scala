package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Hl
import typingsSlinky.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typingsSlinky.gapiClientYoutube.anon.Part
import typingsSlinky.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[ChannelSection] = js.native
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: Hl): Request[ChannelSectionListResponse] = js.native
  /** Update a channelSection. */
  def update(request: Part): Request[ChannelSection] = js.native
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[ChannelSection],
    list: Hl => Request[ChannelSectionListResponse],
    update: Part => Request[ChannelSection]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ChannelSectionsResource]
  }
  @scala.inline
  implicit class ChannelSectionsResourceOps[Self <: ChannelSectionsResource] (val x: Self) extends AnyVal {
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
    def withInsert(value: OnBehalfOfContentOwnerChannel => Request[ChannelSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Hl => Request[ChannelSectionListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Part => Request[ChannelSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

