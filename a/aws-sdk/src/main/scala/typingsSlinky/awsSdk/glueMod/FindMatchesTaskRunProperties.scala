package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchesTaskRunProperties extends js.Object {
  /**
    * The job ID for the Find Matches task run.
    */
  var JobId: js.UndefOr[HashString] = js.native
  /**
    * The name assigned to the job for the Find Matches task run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The job run ID for the Find Matches task run.
    */
  var JobRunId: js.UndefOr[HashString] = js.native
}

object FindMatchesTaskRunProperties {
  @scala.inline
  def apply(): FindMatchesTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMatchesTaskRunProperties]
  }
  @scala.inline
  implicit class FindMatchesTaskRunPropertiesOps[Self <: FindMatchesTaskRunProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: NameString): Self = {
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
    def withJobRunId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(js.undefined)
        ret
    }
  }
  
}

