package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexProgramsResponse extends js.Object {
  /**
    * List of multiplex programs.
    */
  var MultiplexPrograms: js.UndefOr[listOfMultiplexProgramSummary] = js.native
  /**
    * Token for the next ListMultiplexProgram request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListMultiplexProgramsResponse {
  @scala.inline
  def apply(): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
  @scala.inline
  implicit class ListMultiplexProgramsResponseOps[Self <: ListMultiplexProgramsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexPrograms(value: listOfMultiplexProgramSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexPrograms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexPrograms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexPrograms")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

