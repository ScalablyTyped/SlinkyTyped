package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexProgramRequest extends js.Object {
  /**
    * ID of the multiplex where the program is to be created.
    */
  var MultiplexId: string = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: typingsSlinky.awsSdk.medialiveMod.MultiplexProgramSettings = js.native
  /**
    * Name of multiplex program.
    */
  var ProgramName: string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
}

object CreateMultiplexProgramRequest {
  @scala.inline
  def apply(
    MultiplexId: string,
    MultiplexProgramSettings: MultiplexProgramSettings,
    ProgramName: string,
    RequestId: string
  ): CreateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], MultiplexProgramSettings = MultiplexProgramSettings.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexProgramRequest]
  }
  @scala.inline
  implicit class CreateMultiplexProgramRequestOps[Self <: CreateMultiplexProgramRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplexProgramSettings(value: MultiplexProgramSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexProgramSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

