package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskAssessmentResult extends js.Object {
  /**
    *  The task assessment results in JSON format. 
    */
  var AssessmentResults: js.UndefOr[String] = js.native
  /**
    *  The file containing the results of the task assessment. 
    */
  var AssessmentResultsFile: js.UndefOr[String] = js.native
  /**
    *  The status of the task assessment. 
    */
  var AssessmentStatus: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    *  The replication task identifier of the task on which the task assessment was run. 
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * The date the task assessment was completed. 
    */
  var ReplicationTaskLastAssessmentDate: js.UndefOr[js.Date] = js.native
  /**
    *  The URL of the S3 object containing the task assessment results. 
    */
  var S3ObjectUrl: js.UndefOr[String] = js.native
}

object ReplicationTaskAssessmentResult {
  @scala.inline
  def apply(): ReplicationTaskAssessmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskAssessmentResult]
  }
  @scala.inline
  implicit class ReplicationTaskAssessmentResultOps[Self <: ReplicationTaskAssessmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssessmentResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentResults")(js.undefined)
        ret
    }
    @scala.inline
    def withAssessmentResultsFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentResultsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssessmentResultsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentResultsFile")(js.undefined)
        ret
    }
    @scala.inline
    def withAssessmentStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssessmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssessmentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskLastAssessmentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskLastAssessmentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskLastAssessmentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskLastAssessmentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ObjectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ObjectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ObjectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ObjectUrl")(js.undefined)
        ret
    }
  }
  
}

