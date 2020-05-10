package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramSettings extends js.Object {
  /**
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    */
  var PreferredChannelPipeline: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.PreferredChannelPipeline] = js.native
  /**
    * Unique program number.
    */
  var ProgramNumber: integerMin0Max65535 = js.native
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.native
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.native
}

object MultiplexProgramSettings {
  @scala.inline
  def apply(ProgramNumber: integerMin0Max65535): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
  @scala.inline
  implicit class MultiplexProgramSettingsOps[Self <: MultiplexProgramSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgramNumber(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredChannelPipeline(value: PreferredChannelPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredChannelPipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredChannelPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredChannelPipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceDescriptor(value: MultiplexProgramServiceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSettings(value: MultiplexVideoSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSettings")(js.undefined)
        ret
    }
  }
  
}

