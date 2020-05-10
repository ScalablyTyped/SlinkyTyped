package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioChannelMapping extends js.Object {
  /**
    * Indices and gain values for each input channel that should be remixed into this output channel.
    */
  var InputChannelLevels: listOfInputChannelLevel = js.native
  /**
    * The index of the output channel being produced.
    */
  var OutputChannel: integerMin0Max7 = js.native
}

object AudioChannelMapping {
  @scala.inline
  def apply(InputChannelLevels: listOfInputChannelLevel, OutputChannel: integerMin0Max7): AudioChannelMapping = {
    val __obj = js.Dynamic.literal(InputChannelLevels = InputChannelLevels.asInstanceOf[js.Any], OutputChannel = OutputChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioChannelMapping]
  }
  @scala.inline
  implicit class AudioChannelMappingOps[Self <: AudioChannelMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputChannelLevels(value: listOfInputChannelLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputChannelLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputChannel(value: integerMin0Max7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputChannel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

