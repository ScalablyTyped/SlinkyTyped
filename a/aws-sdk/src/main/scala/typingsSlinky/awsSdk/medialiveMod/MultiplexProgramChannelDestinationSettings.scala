package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramChannelDestinationSettings extends js.Object {
  /**
    * The ID of the Multiplex that the encoder is providing output to. You do not need to specify the individual inputs to the Multiplex; MediaLive will handle the connection of the two MediaLive pipelines to the two Multiplex instances.
  The Multiplex must be in the same region as the Channel.
    */
  var MultiplexId: js.UndefOr[stringMin1] = js.native
  /**
    * The program name of the Multiplex program that the encoder is providing output to.
    */
  var ProgramName: js.UndefOr[stringMin1] = js.native
}

object MultiplexProgramChannelDestinationSettings {
  @scala.inline
  def apply(): MultiplexProgramChannelDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramChannelDestinationSettings]
  }
  @scala.inline
  implicit class MultiplexProgramChannelDestinationSettingsOps[Self <: MultiplexProgramChannelDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexId(value: stringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramName(value: stringMin1): Self = {
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

