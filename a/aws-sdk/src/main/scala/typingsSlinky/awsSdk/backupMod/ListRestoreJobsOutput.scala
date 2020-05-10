package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRestoreJobsOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * An array of objects that contain detailed information about jobs to restore saved resources.
    */
  var RestoreJobs: js.UndefOr[RestoreJobsList] = js.native
}

object ListRestoreJobsOutput {
  @scala.inline
  def apply(): ListRestoreJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsOutput]
  }
  @scala.inline
  implicit class ListRestoreJobsOutputOps[Self <: ListRestoreJobsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withRestoreJobs(value: RestoreJobsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreJobs")(js.undefined)
        ret
    }
  }
  
}

