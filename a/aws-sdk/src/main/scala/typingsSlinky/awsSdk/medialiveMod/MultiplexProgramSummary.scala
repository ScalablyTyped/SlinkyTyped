package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramSummary extends js.Object {
  /**
    * The MediaLive Channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.native
}

object MultiplexProgramSummary {
  @scala.inline
  def apply(): MultiplexProgramSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramSummary]
  }
  @scala.inline
  implicit class MultiplexProgramSummaryOps[Self <: MultiplexProgramSummary] (val x: Self) extends AnyVal {
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

