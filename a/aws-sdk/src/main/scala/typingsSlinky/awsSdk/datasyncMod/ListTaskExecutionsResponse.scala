package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.native
}

object ListTaskExecutionsResponse {
  @scala.inline
  def apply(): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
  @scala.inline
  implicit class ListTaskExecutionsResponseOps[Self <: ListTaskExecutionsResponse] (val x: Self) extends AnyVal {
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
    def withTaskExecutions(value: TaskExecutionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutions")(js.undefined)
        ret
    }
  }
  
}

