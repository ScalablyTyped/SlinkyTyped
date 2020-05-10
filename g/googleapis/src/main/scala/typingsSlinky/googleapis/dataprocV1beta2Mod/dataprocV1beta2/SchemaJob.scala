package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job resource.
  */
@js.native
trait SchemaJob extends js.Object {
  /**
    * Output only. If present, the location of miscellaneous control files
    * which may be used as part of job setup and handling. If not present,
    * control files may be placed in the same location as driver_output_uri.
    */
  var driverControlFilesUri: js.UndefOr[String] = js.native
  /**
    * Output only. A URI pointing to the location of the stdout of the
    * job&#39;s driver program.
    */
  var driverOutputResourceUri: js.UndefOr[String] = js.native
  /**
    * Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[SchemaHadoopJob] = js.native
  /**
    * Job is a Hive job.
    */
  var hiveJob: js.UndefOr[SchemaHiveJob] = js.native
  /**
    * Output only. A UUID that uniquely identifies a job within the project
    * over time. This is in contrast to a user-settable reference.job_id that
    * may be reused over time.
    */
  var jobUuid: js.UndefOr[String] = js.native
  /**
    * Optional. The labels to associate with this job. Label keys must contain
    * 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a job.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Job is a Pig job.
    */
  var pigJob: js.UndefOr[SchemaPigJob] = js.native
  /**
    * Required. Job information, including how, when, and where to run the job.
    */
  var placement: js.UndefOr[SchemaJobPlacement] = js.native
  /**
    * Job is a Presto job
    */
  var prestoJob: js.UndefOr[SchemaPrestoJob] = js.native
  /**
    * Job is a Pyspark job.
    */
  var pysparkJob: js.UndefOr[SchemaPySparkJob] = js.native
  /**
    * Optional. The fully qualified reference to the job, which can be used to
    * obtain the equivalent REST path of the job resource. If this property is
    * not specified when a job is created, the server generates a
    * &lt;code&gt;job_id&lt;/code&gt;.
    */
  var reference: js.UndefOr[SchemaJobReference] = js.native
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[SchemaJobScheduling] = js.native
  /**
    * Job is a Spark job.
    */
  var sparkJob: js.UndefOr[SchemaSparkJob] = js.native
  /**
    * Job is a SparkR job.
    */
  var sparkRJob: js.UndefOr[SchemaSparkRJob] = js.native
  /**
    * Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[SchemaSparkSqlJob] = js.native
  /**
    * Output only. The job status. Additional application-specific status
    * information may be contained in the &lt;code&gt;type_job&lt;/code&gt; and
    * &lt;code&gt;yarn_applications&lt;/code&gt; fields.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.native
  /**
    * Output only. The previous job status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaJobStatus]] = js.native
  /**
    * Output only. The email address of the user submitting the job. For jobs
    * submitted on the cluster, the address is
    * &lt;code&gt;username@hostname&lt;/code&gt;.
    */
  var submittedBy: js.UndefOr[String] = js.native
  /**
    * Output only. The collection of YARN applications spun up by this job.Beta
    * Feature: This report is available for testing purposes only. It may be
    * changed before final release.
    */
  var yarnApplications: js.UndefOr[js.Array[SchemaYarnApplication]] = js.native
}

object SchemaJob {
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  @scala.inline
  implicit class SchemaJobOps[Self <: SchemaJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriverControlFilesUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverControlFilesUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriverControlFilesUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverControlFilesUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDriverOutputResourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverOutputResourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriverOutputResourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverOutputResourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withHadoopJob(value: SchemaHadoopJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hadoopJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHadoopJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hadoopJob")(js.undefined)
        ret
    }
    @scala.inline
    def withHiveJob(value: SchemaHiveJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiveJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiveJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiveJob")(js.undefined)
        ret
    }
    @scala.inline
    def withJobUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobUuid")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPigJob(value: SchemaPigJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pigJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPigJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pigJob")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: SchemaJobPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPrestoJob(value: SchemaPrestoJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestoJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrestoJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prestoJob")(js.undefined)
        ret
    }
    @scala.inline
    def withPysparkJob(value: SchemaPySparkJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pysparkJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPysparkJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pysparkJob")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: SchemaJobReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduling(value: SchemaJobScheduling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(js.undefined)
        ret
    }
    @scala.inline
    def withSparkJob(value: SchemaSparkJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparkJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkJob")(js.undefined)
        ret
    }
    @scala.inline
    def withSparkRJob(value: SchemaSparkRJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkRJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparkRJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkRJob")(js.undefined)
        ret
    }
    @scala.inline
    def withSparkSqlJob(value: SchemaSparkSqlJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkSqlJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparkSqlJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparkSqlJob")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusHistory(value: js.Array[SchemaJobStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withYarnApplications(value: js.Array[SchemaYarnApplication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarnApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYarnApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarnApplications")(js.undefined)
        ret
    }
  }
  
}

