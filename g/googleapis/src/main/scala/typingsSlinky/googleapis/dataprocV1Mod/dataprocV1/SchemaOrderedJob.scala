package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A job executed by the workflow.
  */
@js.native
trait SchemaOrderedJob extends js.Object {
  /**
    * Job is a Hadoop job.
    */
  var hadoopJob: js.UndefOr[SchemaHadoopJob] = js.native
  /**
    * Job is a Hive job.
    */
  var hiveJob: js.UndefOr[SchemaHiveJob] = js.native
  /**
    * Optional. The labels to associate with this job.Label keys must be
    * between 1 and 63 characters long, and must conform to the following
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following regular expression:
    * \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a
    * given job.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Job is a Pig job.
    */
  var pigJob: js.UndefOr[SchemaPigJob] = js.native
  /**
    * Optional. The optional list of prerequisite job step_ids. If not
    * specified, the job will start at the beginning of workflow.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Job is a Pyspark job.
    */
  var pysparkJob: js.UndefOr[SchemaPySparkJob] = js.native
  /**
    * Optional. Job scheduling configuration.
    */
  var scheduling: js.UndefOr[SchemaJobScheduling] = js.native
  /**
    * Job is a Spark job.
    */
  var sparkJob: js.UndefOr[SchemaSparkJob] = js.native
  /**
    * Job is a SparkSql job.
    */
  var sparkSqlJob: js.UndefOr[SchemaSparkSqlJob] = js.native
  /**
    * Required. The step id. The id must be unique among all jobs within the
    * template.The step id is used as prefix for job id, as job
    * goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field
    * from other steps.The id must contain only letters (a-z, A-Z), numbers
    * (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var stepId: js.UndefOr[String] = js.native
}

object SchemaOrderedJob {
  @scala.inline
  def apply(): SchemaOrderedJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderedJob]
  }
  @scala.inline
  implicit class SchemaOrderedJobOps[Self <: SchemaOrderedJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPrerequisiteStepIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteStepIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerequisiteStepIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteStepIds")(js.undefined)
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
    def withStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(js.undefined)
        ret
    }
  }
  
}

