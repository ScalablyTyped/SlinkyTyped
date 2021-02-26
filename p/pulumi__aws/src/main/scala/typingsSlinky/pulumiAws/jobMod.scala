package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.glue.JobCommand
import typingsSlinky.pulumiAws.outputMod.glue.JobExecutionProperty
import typingsSlinky.pulumiAws.outputMod.glue.JobNotificationProperty
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
  @JSImport("@pulumi/aws/glue/job", "Job")
  @js.native
  class Job protected () extends CustomResource {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobArgs) = this()
    def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of Glue Job
      */
    val arn: Output_[String] = js.native
    
    /**
      * The command of the job. Defined below.
      */
    val command: Output_[JobCommand] = js.native
    
    /**
      * The list of connections used for this job.
      */
    val connections: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
      */
    val defaultArguments: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Description of the job.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Execution property of the job. Defined below.
      */
    val executionProperty: Output_[JobExecutionProperty] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: Output_[String] = js.native
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
      */
    val maxCapacity: Output_[Double] = js.native
    
    /**
      * The maximum number of times to retry this job if it fails.
      */
    val maxRetries: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name you assign to this job. It must be unique in your account.
      */
    val name: Output_[String] = js.native
    
    /**
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: Output_[JobNotificationProperty] = js.native
    
    /**
      * The number of workers of a defined workerType that are allocated when a job runs.
      */
    val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN of the IAM role associated with this job.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The name of the Security Configuration to be associated with the job.
      */
    val securityConfiguration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The job timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Job {
    
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/job", "Job.get")
    @js.native
    def get(name: String, id: Input[ID]): Job = js.native
    @JSImport("@pulumi/aws/glue/job", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Job = js.native
    @JSImport("@pulumi/aws/glue/job", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobState): Job = js.native
    @JSImport("@pulumi/aws/glue/job", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): Job = js.native
    
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/job", "Job.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
  }
  
  @js.native
  trait JobArgs extends StObject {
    
    /**
      * The command of the job. Defined below.
      */
    val command: Input[typingsSlinky.pulumiAws.inputMod.glue.JobCommand] = js.native
    
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
    val executionProperty: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty]] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
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
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty]] = js.native
    
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
  object JobArgs {
    
    @scala.inline
    def apply(command: Input[typingsSlinky.pulumiAws.inputMod.glue.JobCommand], roleArn: Input[String]): JobArgs = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobArgs]
    }
    
    @scala.inline
    implicit class JobArgsMutableBuilder[Self <: JobArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobCommand]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnections(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      @scala.inline
      def setConnectionsVarargs(value: Input[String]*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      @scala.inline
      def setDefaultArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "defaultArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultArgumentsUndefined: Self = StObject.set(x, "defaultArguments", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionProperty(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty]): Self = StObject.set(x, "executionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionPropertyUndefined: Self = StObject.set(x, "executionProperty", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonOverridableArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nonOverridableArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonOverridableArgumentsUndefined: Self = StObject.set(x, "nonOverridableArguments", js.undefined)
      
      @scala.inline
      def setNotificationProperty(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty]): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  @js.native
  trait JobState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Glue Job
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The command of the job. Defined below.
      */
    val command: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.JobCommand]] = js.native
    
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
    val executionProperty: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty]] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
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
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty]] = js.native
    
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
    implicit class JobStateMutableBuilder[Self <: JobState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCommand(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobCommand]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setConnections(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      @scala.inline
      def setConnectionsVarargs(value: Input[String]*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      @scala.inline
      def setDefaultArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "defaultArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultArgumentsUndefined: Self = StObject.set(x, "defaultArguments", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionProperty(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobExecutionProperty]): Self = StObject.set(x, "executionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionPropertyUndefined: Self = StObject.set(x, "executionProperty", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonOverridableArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nonOverridableArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonOverridableArgumentsUndefined: Self = StObject.set(x, "nonOverridableArguments", js.undefined)
      
      @scala.inline
      def setNotificationProperty(value: Input[typingsSlinky.pulumiAws.inputMod.glue.JobNotificationProperty]): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
}
