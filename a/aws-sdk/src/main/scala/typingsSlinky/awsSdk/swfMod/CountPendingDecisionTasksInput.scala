package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountPendingDecisionTasksInput extends js.Object {
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName = js.native
  /**
    * The name of the task list.
    */
  var taskList: TaskList = js.native
}

object CountPendingDecisionTasksInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingDecisionTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingDecisionTasksInput]
  }
  @scala.inline
  implicit class CountPendingDecisionTasksInputOps[Self <: CountPendingDecisionTasksInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskList(value: TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

