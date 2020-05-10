package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of tasks.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of all the tasks that are returned.
    */
  var Tasks: js.UndefOr[TaskList] = js.native
}

object ListTasksResponse {
  @scala.inline
  def apply(): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksResponse]
  }
  @scala.inline
  implicit class ListTasksResponseOps[Self <: ListTasksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withTasks(value: TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasks")(js.undefined)
        ret
    }
  }
  
}

