package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMapping extends js.Object {
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[listOfOutputChannelMapping] = js.native
}

object ChannelMapping {
  @scala.inline
  def apply(): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMapping]
  }
  @scala.inline
  implicit class ChannelMappingOps[Self <: ChannelMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputChannels(value: listOfOutputChannelMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputChannels")(js.undefined)
        ret
    }
  }
  
}

