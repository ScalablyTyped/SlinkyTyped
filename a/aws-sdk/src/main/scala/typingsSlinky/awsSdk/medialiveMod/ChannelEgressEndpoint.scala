package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEgressEndpoint extends js.Object {
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[string] = js.native
}

object ChannelEgressEndpoint {
  @scala.inline
  def apply(): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
  @scala.inline
  implicit class ChannelEgressEndpointOps[Self <: ChannelEgressEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceIp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIp")(js.undefined)
        ret
    }
  }
  
}

