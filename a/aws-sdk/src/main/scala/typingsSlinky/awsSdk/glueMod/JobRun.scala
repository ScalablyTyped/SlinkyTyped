package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobRun extends js.Object {
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  /**
    * The job arguments associated with this run. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  /**
    * The number of the attempt to run this job.
    */
  var Attempt: js.UndefOr[AttemptCount] = js.native
  /**
    * The date and time that this job run completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * An error message associated with this job run.
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.native
  /**
    * The amount of time (in seconds) that the job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typingsSlinky.awsSdk.glueMod.ExecutionTime] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The ID of this job run.
    */
  var Id: js.UndefOr[IdString] = js.native
  /**
    * The name of the job definition being used in this run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The current state of the job run.
    */
  var JobRunState: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobRunState] = js.native
  /**
    * The last time that this job run was modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The name of the log group for secure logging that can be server-side encrypted in Amazon CloudWatch using AWS KMS. This name can be /aws-glue/jobs/, in which case the default encryption is NONE. If you add a role name and SecurityConfiguration name (in other words, /aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/), then that security configuration is used to encrypt the log group.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typingsSlinky.awsSdk.glueMod.NotificationProperty] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * A list of predecessors to this job run.
    */
  var PredecessorRuns: js.UndefOr[PredecessorList] = js.native
  /**
    * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this job run.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The date and time at which this job run was started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.glueMod.Timeout] = js.native
  /**
    * The name of the trigger that started this job run.
    */
  var TriggerName: js.UndefOr[NameString] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
}

object JobRun {
  @scala.inline
  def apply(): JobRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRun]
  }
  @scala.inline
  implicit class JobRunOps[Self <: JobRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedCapacity(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withArguments(value: GenericMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAttempt(value: AttemptCount): Self = {
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
    def withCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTime(value: ExecutionTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGlueVersion(value: GlueVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlueVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withJobRunState(value: JobRunState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRunState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunState")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCapacity(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationProperty(value: NotificationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfWorkers(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withPredecessorRuns(value: PredecessorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredecessorRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredecessorRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredecessorRuns")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousRunId(value: IdString): Self = {
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
    def withSecurityConfiguration(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Timeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerName")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerType(value: WorkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerType")(js.undefined)
        ret
    }
  }
  
}

