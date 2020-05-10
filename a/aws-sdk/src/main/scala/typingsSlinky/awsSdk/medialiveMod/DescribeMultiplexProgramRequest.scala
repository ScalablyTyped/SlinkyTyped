package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMultiplexProgramRequest extends js.Object {
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: string = js.native
  /**
    * The name of the program.
    */
  var ProgramName: string = js.native
}

object DescribeMultiplexProgramRequest {
  @scala.inline
  def apply(MultiplexId: string, ProgramName: string): DescribeMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexProgramRequest]
  }
  @scala.inline
  implicit class DescribeMultiplexProgramRequestOps[Self <: DescribeMultiplexProgramRequest] (val x: Self) extends AnyVal {
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
    def withProgramName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

