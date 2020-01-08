package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.ecsCapacityProviderMod.CapacityProviderArgs
import typingsSlinky.atPulumiAws.ecsCapacityProviderMod.CapacityProviderState
import typingsSlinky.atPulumiAws.ecsClusterMod.ClusterArgs
import typingsSlinky.atPulumiAws.ecsClusterMod.ClusterState
import typingsSlinky.atPulumiAws.ecsGetClusterMod.GetClusterArgs
import typingsSlinky.atPulumiAws.ecsGetClusterMod.GetClusterResult
import typingsSlinky.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionArgs
import typingsSlinky.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionResult
import typingsSlinky.atPulumiAws.ecsGetServiceMod.GetServiceArgs
import typingsSlinky.atPulumiAws.ecsGetServiceMod.GetServiceResult
import typingsSlinky.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionArgs
import typingsSlinky.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionResult
import typingsSlinky.atPulumiAws.ecsServiceMod.ServiceArgs
import typingsSlinky.atPulumiAws.ecsServiceMod.ServiceState
import typingsSlinky.atPulumiAws.ecsTaskDefinitionMod.TaskDefinitionArgs
import typingsSlinky.atPulumiAws.ecsTaskDefinitionMod.TaskDefinitionState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ecs")
@js.native
object ecs extends js.Object {
  @js.native
  class CapacityProvider protected ()
    extends typingsSlinky.atPulumiAws.ecsMod.CapacityProvider {
    /**
      * Create a CapacityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CapacityProviderArgs) = this()
    def this(name: String, args: CapacityProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Cluster protected ()
    extends typingsSlinky.atPulumiAws.ecsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Service protected ()
    extends typingsSlinky.atPulumiAws.ecsMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TaskDefinition protected ()
    extends typingsSlinky.atPulumiAws.ecsMod.TaskDefinition {
    /**
      * Create a TaskDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskDefinitionArgs) = this()
    def this(name: String, args: TaskDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
  /* static members */
  @js.native
  object CapacityProvider extends js.Object {
    /**
      * Get an existing CapacityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState): typingsSlinky.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    /**
      * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.atPulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ecsClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Service extends js.Object {
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ecsServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState): typingsSlinky.atPulumiAws.ecsServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ecsServiceMod.Service = js.native
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TaskDefinition extends js.Object {
    /**
      * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState): typingsSlinky.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    /**
      * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = js.native
  }
  
}

