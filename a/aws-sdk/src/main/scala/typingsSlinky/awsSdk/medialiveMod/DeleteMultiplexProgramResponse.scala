package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultiplexProgramResponse extends js.Object {
  /**
    * The MediaLive channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexProgramSettings] = js.native
  /**
    * The packet identifier map for this multiplex program.
    */
  var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.native
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.native
}

object DeleteMultiplexProgramResponse {
  @scala.inline
  def apply(): DeleteMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiplexProgramResponse]
  }
  @scala.inline
  implicit class DeleteMultiplexProgramResponseOps[Self <: DeleteMultiplexProgramResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplexProgramSettings(value: MultiplexProgramSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexProgramSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexProgramSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexProgramSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketIdentifiersMap(value: MultiplexProgramPacketIdentifiersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PacketIdentifiersMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketIdentifiersMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PacketIdentifiersMap")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramName")(js.undefined)
        ret
    }
  }
  
}

