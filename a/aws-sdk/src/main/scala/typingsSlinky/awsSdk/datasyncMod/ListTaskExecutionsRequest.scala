package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsRequest extends js.Object {
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.MaxResults] = js.native
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskArn] = js.native
}

object ListTaskExecutionsRequest {
  @scala.inline
  def apply(): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
  @scala.inline
  implicit class ListTaskExecutionsRequestOps[Self <: ListTaskExecutionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withTaskArn(value: TaskArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(js.undefined)
        ret
    }
  }
  
}

