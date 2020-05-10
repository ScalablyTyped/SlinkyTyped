package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexProgramResponse extends js.Object {
  /**
    * The updated multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexProgram] = js.native
}

object UpdateMultiplexProgramResponse {
  @scala.inline
  def apply(): UpdateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMultiplexProgramResponse]
  }
  @scala.inline
  implicit class UpdateMultiplexProgramResponseOps[Self <: UpdateMultiplexProgramResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexProgram(value: MultiplexProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexProgram")(js.undefined)
        ret
    }
  }
  
}

