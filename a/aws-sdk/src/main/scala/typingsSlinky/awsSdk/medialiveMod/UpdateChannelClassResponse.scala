package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelClassResponse extends js.Object {
  var Channel: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Channel] = js.native
}

object UpdateChannelClassResponse {
  @scala.inline
  def apply(): UpdateChannelClassResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelClassResponse]
  }
  @scala.inline
  implicit class UpdateChannelClassResponseOps[Self <: UpdateChannelClassResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel")(js.undefined)
        ret
    }
  }
  
}

