package typingsSlinky.pulumiAws.jobMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.glue.JobCommand
import typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty
import typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobArgs extends js.Object {
  /**
    * **DEPRECATED** (Optional) The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    *
    * @deprecated Please use attribute `max_capacity' instead. This attribute might be removed in future releases.
    */
  val allocatedCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The command of the job. Defined below.
    */
  val command: Input[JobCommand] = js.native
  /**
    * The list of connections used for this job.
    */
  val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
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
  val roleArn: Input[String] = js.native
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: js.UndefOr[Input[String]] = js.native
}

object JobArgs {
  @scala.inline
  def apply(command: Input[JobCommand], roleArn: Input[String]): JobArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobArgs]
  }
  @scala.inline
  implicit class JobArgsOps[Self <: JobArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: Input[JobCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatedCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultArguments(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionProperty(value: Input[JobExecutionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGlueVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glueVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlueVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glueVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationProperty(value: Input[JobNotificationProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfWorkers(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(js.undefined)
        ret
    }
  }
  
}

