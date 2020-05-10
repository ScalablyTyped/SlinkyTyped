package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobBookmarkEntry extends js.Object {
  /**
    * The attempt ID number.
    */
  var Attempt: js.UndefOr[IntegerValue] = js.native
  /**
    * The bookmark itself.
    */
  var JobBookmark: js.UndefOr[JsonValue] = js.native
  /**
    * The name of the job in question.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobName] = js.native
  /**
    * The unique run identifier associated with the previous job run.
    */
  var PreviousRunId: js.UndefOr[RunId] = js.native
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.native
  /**
    * The run ID number.
    */
  var RunId: js.UndefOr[typingsSlinky.awsSdk.glueMod.RunId] = js.native
  /**
    * The version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.native
}

object JobBookmarkEntry {
  @scala.inline
  def apply(): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarkEntry]
  }
  @scala.inline
  implicit class JobBookmarkEntryOps[Self <: JobBookmarkEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempt(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attempt")(js.undefined)
        ret
    }
    @scala.inline
    def withJobBookmark(value: JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBookmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmark")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: JobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousRunId(value: RunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousRunId")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(js.undefined)
        ret
    }
    @scala.inline
    def withRunId(value: RunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

