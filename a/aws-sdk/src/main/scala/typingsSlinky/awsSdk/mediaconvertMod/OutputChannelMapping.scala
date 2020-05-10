package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputChannelMapping extends js.Object {
  /**
    * List of input channels
    */
  var InputChannels: js.UndefOr[listOfIntegerMinNegative60Max6] = js.native
}

object OutputChannelMapping {
  @scala.inline
  def apply(): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputChannelMapping]
  }
  @scala.inline
  implicit class OutputChannelMappingOps[Self <: OutputChannelMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputChannels(value: listOfIntegerMinNegative60Max6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputChannels")(js.undefined)
        ret
    }
  }
  
}

