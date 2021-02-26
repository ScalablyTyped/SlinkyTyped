package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
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
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl") or Apache Spark streaming ETL job (JobCommand.Name="gluestreaming"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
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
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedCapacity(value: IntegerValue): Self = StObject.set(x, "AllocatedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedCapacityUndefined: Self = StObject.set(x, "AllocatedCapacity", js.undefined)
    
    @scala.inline
    def setCommand(value: JobCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    @scala.inline
    def setConnections(value: ConnectionsList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    @scala.inline
    def setDefaultArguments(value: GenericMap): Self = StObject.set(x, "DefaultArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultArgumentsUndefined: Self = StObject.set(x, "DefaultArguments", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExecutionProperty(value: ExecutionProperty): Self = StObject.set(x, "ExecutionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPropertyUndefined: Self = StObject.set(x, "ExecutionProperty", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    @scala.inline
    def setLogUri(value: UriString): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: NullableDouble): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNonOverridableArguments(value: GenericMap): Self = StObject.set(x, "NonOverridableArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonOverridableArgumentsUndefined: Self = StObject.set(x, "NonOverridableArguments", js.undefined)
    
    @scala.inline
    def setNotificationProperty(value: NotificationProperty): Self = StObject.set(x, "NotificationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPropertyUndefined: Self = StObject.set(x, "NotificationProperty", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    @scala.inline
    def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
