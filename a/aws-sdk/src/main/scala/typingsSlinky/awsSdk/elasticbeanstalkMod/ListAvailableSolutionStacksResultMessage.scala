package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableSolutionStacksResultMessage extends js.Object {
  /**
    *  A list of available solution stacks and their SolutionStackDescription. 
    */
  var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.native
  /**
    * A list of available solution stacks.
    */
  var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.native
}

object ListAvailableSolutionStacksResultMessage {
  @scala.inline
  def apply(): ListAvailableSolutionStacksResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
  }
  @scala.inline
  implicit class ListAvailableSolutionStacksResultMessageOps[Self <: ListAvailableSolutionStacksResultMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSolutionStackDetails(value: AvailableSolutionStackDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStacks(value: AvailableSolutionStackNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStacks")(js.undefined)
        ret
    }
  }
  
}

