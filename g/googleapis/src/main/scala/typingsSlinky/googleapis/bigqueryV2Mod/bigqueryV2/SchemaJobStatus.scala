package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatus extends js.Object {
  /**
    * [Output-only] Final error result of the job. If present, indicates that
    * the job has completed and was unsuccessful.
    */
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  /**
    * [Output-only] The first errors encountered during the running of the job.
    * The final message includes the number of errors that caused the process
    * to stop. Errors here do not necessarily mean that the job has completed
    * or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  /**
    * [Output-only] Running state of the job.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaJobStatus {
  @scala.inline
  def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  @scala.inline
  implicit class SchemaJobStatusOps[Self <: SchemaJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorResult(value: SchemaErrorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[SchemaErrorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

