package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkGroupsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The list of workgroups, including their names, descriptions, creation times, and states.
    */
  var WorkGroups: js.UndefOr[WorkGroupsList] = js.native
}

object ListWorkGroupsOutput {
  @scala.inline
  def apply(): ListWorkGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkGroupsOutput]
  }
  @scala.inline
  implicit class ListWorkGroupsOutputOps[Self <: ListWorkGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: Token): Self = {
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
    @scala.inline
    def withWorkGroups(value: WorkGroupsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroups")(js.undefined)
        ret
    }
  }
  
}

