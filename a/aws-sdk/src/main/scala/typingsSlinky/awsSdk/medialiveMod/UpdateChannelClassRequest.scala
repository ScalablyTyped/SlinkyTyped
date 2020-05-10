package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelClassRequest extends js.Object {
  /**
    * The channel class that you wish to update this channel to use.
    */
  var ChannelClass: typingsSlinky.awsSdk.medialiveMod.ChannelClass = js.native
  /**
    * Channel Id of the channel whose class should be updated.
    */
  var ChannelId: string = js.native
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
}

object UpdateChannelClassRequest {
  @scala.inline
  def apply(ChannelClass: ChannelClass, ChannelId: string): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
  @scala.inline
  implicit class UpdateChannelClassRequestOps[Self <: UpdateChannelClassRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelClass(value: ChannelClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: listOfOutputDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(js.undefined)
        ret
    }
  }
  
}

