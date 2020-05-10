package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionStatus extends js.Object {
  /**
    * The date and time that the query completed.
    */
  var CompletionDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of query execution. QUEUED state is listed but is not used by Athena and is reserved for future use. RUNNING indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. SUCCEEDED indicates that the query completed without errors. FAILED indicates that the query experienced an error and did not complete processing. CANCELLED indicates that a user input interrupted query execution. 
    */
  var State: js.UndefOr[QueryExecutionState] = js.native
  /**
    * Further detail about the status of the query.
    */
  var StateChangeReason: js.UndefOr[String] = js.native
  /**
    * The date and time that the query was submitted.
    */
  var SubmissionDateTime: js.UndefOr[js.Date] = js.native
}

object QueryExecutionStatus {
  @scala.inline
  def apply(): QueryExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatus]
  }
  @scala.inline
  implicit class QueryExecutionStatusOps[Self <: QueryExecutionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: QueryExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmissionDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmissionDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmissionDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmissionDateTime")(js.undefined)
        ret
    }
  }
  
}

