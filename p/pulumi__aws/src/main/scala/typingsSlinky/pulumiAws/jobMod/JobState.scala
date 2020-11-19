package typingsSlinky.pulumiAws.jobMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.glue.JobCommand
import typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty
import typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobState extends js.Object {
  
  /**
    * **DEPRECATED** (Optional) The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    *
    * @deprecated Please use attribute `max_capacity' instead. This attribute might be removed in future releases.
    */
  val allocatedCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of Glue Job
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The command of the job. Defined below.
    */
  val command: js.UndefOr[Input[JobCommand]] = js.native
  
  /**
    * The list of connections used for this job.
    */
  val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Description of the job.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: js.UndefOr[Input[JobExecutionProperty]] = js.native
  
  /**
    * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
    */
  val glueVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`.
    */
  val maxCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name you assign to this job. It must be unique in your account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Notification property of the job. Defined below.
    */
  val notificationProperty: js.UndefOr[Input[JobNotificationProperty]] = js.native
  
  /**
    * The number of workers of a defined workerType that are allocated when a job runs.
    */
  val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: js.UndefOr[Input[String]] = js.native
}
object JobState {
  
  @scala.inline
  def apply(): JobState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobState]
  }
  
  @scala.inline
  implicit class JobStateOps[Self <: JobState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocatedCapacity(value: Input[Double]): Self = this.set("allocatedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedCapacity: Self = this.set("allocatedCapacity", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCommand(value: Input[JobCommand]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Input[String]*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: Input[js.Array[Input[String]]]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setDefaultArguments(value: Input[StringDictionary[Input[String]]]): Self = this.set("defaultArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultArguments: Self = this.set("defaultArguments", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExecutionProperty(value: Input[JobExecutionProperty]): Self = this.set("executionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionProperty: Self = this.set("executionProperty", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: Input[String]): Self = this.set("glueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueVersion: Self = this.set("glueVersion", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: Input[Double]): Self = this.set("maxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCapacity: Self = this.set("maxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Input[Double]): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationProperty(value: Input[JobNotificationProperty]): Self = this.set("notificationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationProperty: Self = this.set("notificationProperty", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: Input[Double]): Self = this.set("numberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("numberOfWorkers", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: Input[String]): Self = this.set("securityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("securityConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWorkerType(value: Input[String]): Self = this.set("workerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("workerType", js.undefined)
  }
}
