package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTarget
import typingsSlinky.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maintenanceWindowTaskMod {
  
  @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
  @js.native
  class MaintenanceWindowTask protected () extends CustomResource {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTaskArgs) = this()
    def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the maintenance window task.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: Output_[String] = js.native
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: Output_[String] = js.native
    
    /**
      * The name of the maintenance window task.
      */
    val name: Output_[String] = js.native
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: Output_[String] = js.native
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: Output_[js.Array[MaintenanceWindowTaskTarget]] = js.native
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: Output_[String] = js.native
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: Output_[js.UndefOr[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: Output_[String] = js.native
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: Output_[String] = js.native
  }
  /* static members */
  object MaintenanceWindowTask {
    
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID]): MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): MaintenanceWindowTask = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): MaintenanceWindowTask = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
  }
  
  @js.native
  trait MaintenanceWindowTaskArgs extends StObject {
    
    /**
      * The description of the maintenance window task.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: Input[String] = js.native
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: Input[String] = js.native
    
    /**
      * The name of the maintenance window task.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: Input[String] = js.native
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: Input[
        js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]
      ] = js.native
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: Input[String] = js.native
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
        ]
      ] = js.native
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: Input[String] = js.native
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: Input[String] = js.native
  }
  object MaintenanceWindowTaskArgs {
    
    @scala.inline
    def apply(
      maxConcurrency: Input[String],
      maxErrors: Input[String],
      serviceRoleArn: Input[String],
      targets: Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]
        ],
      taskArn: Input[String],
      taskType: Input[String],
      windowId: Input[String]
    ): MaintenanceWindowTaskArgs = {
      val __obj = js.Dynamic.literal(maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxErrors = maxErrors.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], taskArn = taskArn.asInstanceOf[js.Any], taskType = taskType.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceWindowTaskArgs]
    }
    
    @scala.inline
    implicit class MaintenanceWindowTaskArgsMutableBuilder[Self <: MaintenanceWindowTaskArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setTaskArn(value: Input[String]): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskInvocationParameters(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
            ]
      ): Self = StObject.set(x, "taskInvocationParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskInvocationParametersUndefined: Self = StObject.set(x, "taskInvocationParameters", js.undefined)
      
      @scala.inline
      def setTaskType(value: Input[String]): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaintenanceWindowTaskState extends StObject {
    
    /**
      * The description of the maintenance window task.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the maintenance window task.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]
        ]
      ] = js.native
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
        ]
      ] = js.native
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: js.UndefOr[Input[String]] = js.native
  }
  object MaintenanceWindowTaskState {
    
    @scala.inline
    def apply(): MaintenanceWindowTaskState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintenanceWindowTaskState]
    }
    
    @scala.inline
    implicit class MaintenanceWindowTaskStateMutableBuilder[Self <: MaintenanceWindowTaskState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      @scala.inline
      def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setTaskArn(value: Input[String]): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
      
      @scala.inline
      def setTaskInvocationParameters(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
            ]
      ): Self = StObject.set(x, "taskInvocationParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskInvocationParametersUndefined: Self = StObject.set(x, "taskInvocationParameters", js.undefined)
      
      @scala.inline
      def setTaskType(value: Input[String]): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
      
      @scala.inline
      def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
