package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to runs of this job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. 
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  /**
    * The JobCommand that executes this job.
    */
  var Command: js.UndefOr[JobCommand] = js.native
  /**
    * The connections used for this job.
    */
  var Connections: js.UndefOr[ConnectionsList] = js.native
  /**
    * The time and date that this job definition was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.native
  /**
    * The default arguments for this job, specified as name-value pairs. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var DefaultArguments: js.UndefOr[GenericMap] = js.native
  /**
    * A description of the job.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
    */
  var ExecutionProperty: js.UndefOr[typingsSlinky.awsSdk.glueMod.ExecutionProperty] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The last point in time when this job definition was modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * This field is reserved for future use.
    */
  var LogUri: js.UndefOr[UriString] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * The maximum number of times to retry this job after a JobRun fails.
    */
  var MaxRetries: js.UndefOr[typingsSlinky.awsSdk.glueMod.MaxRetries] = js.native
  /**
    * The name you assign to this job definition.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Non-overridable arguments for this job, specified as name-value pairs.
    */
  var NonOverridableArguments: js.UndefOr[GenericMap] = js.native
  /**
    * Specifies configuration properties of a job notification.
    */
  var NotificationProperty: js.UndefOr[typingsSlinky.awsSdk.glueMod.NotificationProperty] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
    */
  var Role: js.UndefOr[RoleString] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this job.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.glueMod.Timeout] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.  
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def withCommand(value: JobCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: ConnectionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connections")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultArguments(value: GenericMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionProperty(value: ExecutionProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionProperty")(js.undefined)
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
    def withLogUri(value: UriString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(js.undefined)
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
    def withMaxRetries(value: MaxRetries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonOverridableArguments(value: GenericMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonOverridableArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonOverridableArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonOverridableArguments")(js.undefined)
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
    def withRole(value: RoleString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
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

