package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.ssm.MaintenanceWindowTargetTarget
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maintenanceWindowTargetMod {
  
  @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget")
  @js.native
  class MaintenanceWindowTarget protected () extends CustomResource {
    /**
      * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTargetArgs) = this()
    def this(name: String, args: MaintenanceWindowTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the maintenance window target.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the maintenance window target.
      */
    val name: Output_[String] = js.native
    
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    val ownerInformation: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
      */
    val resourceType: Output_[String] = js.native
    
    /**
      * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
      * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
      */
    val targets: Output_[js.Array[MaintenanceWindowTargetTarget]] = js.native
    
    /**
      * The Id of the maintenance window to register the target with.
      */
    val windowId: Output_[String] = js.native
  }
  /* static members */
  object MaintenanceWindowTarget {
    
    /**
      * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): MaintenanceWindowTarget = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): MaintenanceWindowTarget = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
  }
  
  @js.native
  trait MaintenanceWindowTargetArgs extends StObject {
    
    /**
      * The description of the maintenance window target.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the maintenance window target.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    val ownerInformation: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
      */
    val resourceType: Input[String] = js.native
    
    /**
      * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
      * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
      */
    val targets: Input[
        js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]]
      ] = js.native
    
    /**
      * The Id of the maintenance window to register the target with.
      */
    val windowId: Input[String] = js.native
  }
  object MaintenanceWindowTargetArgs {
    
    @scala.inline
    def apply(
      resourceType: Input[String],
      targets: Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]]
        ],
      windowId: Input[String]
    ): MaintenanceWindowTargetArgs = {
      val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceWindowTargetArgs]
    }
    
    @scala.inline
    implicit class MaintenanceWindowTargetArgsMutableBuilder[Self <: MaintenanceWindowTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerInformation(value: Input[String]): Self = StObject.set(x, "ownerInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerInformationUndefined: Self = StObject.set(x, "ownerInformation", js.undefined)
      
      @scala.inline
      def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaintenanceWindowTargetState extends StObject {
    
    /**
      * The description of the maintenance window target.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the maintenance window target.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
      */
    val ownerInformation: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
      */
    val resourceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
      * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
      */
    val targets: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]]
        ]
      ] = js.native
    
    /**
      * The Id of the maintenance window to register the target with.
      */
    val windowId: js.UndefOr[Input[String]] = js.native
  }
  object MaintenanceWindowTargetState {
    
    @scala.inline
    def apply(): MaintenanceWindowTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintenanceWindowTargetState]
    }
    
    @scala.inline
    implicit class MaintenanceWindowTargetStateMutableBuilder[Self <: MaintenanceWindowTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerInformation(value: Input[String]): Self = StObject.set(x, "ownerInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerInformationUndefined: Self = StObject.set(x, "ownerInformation", js.undefined)
      
      @scala.inline
      def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
