package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionExecutionsOutput extends js.Object {
  /**
    * The details for a list of recent executions, such as action execution ID.
    */
  var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.native
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionExecutionsOutput {
  @scala.inline
  def apply(): ListActionExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionExecutionsOutput]
  }
  @scala.inline
  implicit class ListActionExecutionsOutputOps[Self <: ListActionExecutionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionExecutionDetails(value: ActionExecutionDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionExecutionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

