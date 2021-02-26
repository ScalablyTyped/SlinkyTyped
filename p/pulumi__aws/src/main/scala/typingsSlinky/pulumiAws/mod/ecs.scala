package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.capacityProviderMod.CapacityProviderArgs
import typingsSlinky.pulumiAws.capacityProviderMod.CapacityProviderState
import typingsSlinky.pulumiAws.ecsClusterMod.ClusterArgs
import typingsSlinky.pulumiAws.ecsClusterMod.ClusterState
import typingsSlinky.pulumiAws.ecsGetClusterMod.GetClusterArgs
import typingsSlinky.pulumiAws.ecsGetClusterMod.GetClusterResult
import typingsSlinky.pulumiAws.getContainerDefinitionMod.GetContainerDefinitionArgs
import typingsSlinky.pulumiAws.getContainerDefinitionMod.GetContainerDefinitionResult
import typingsSlinky.pulumiAws.getServiceMod.GetServiceArgs
import typingsSlinky.pulumiAws.getServiceMod.GetServiceResult
import typingsSlinky.pulumiAws.getTaskDefinitionMod.GetTaskDefinitionArgs
import typingsSlinky.pulumiAws.getTaskDefinitionMod.GetTaskDefinitionResult
import typingsSlinky.pulumiAws.serviceMod.ServiceArgs
import typingsSlinky.pulumiAws.serviceMod.ServiceState
import typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinitionArgs
import typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinitionState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecs {
  
  @JSImport("@pulumi/aws", "ecs.CapacityProvider")
  @js.native
  class CapacityProvider protected ()
    extends typingsSlinky.pulumiAws.ecsMod.CapacityProvider {
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
  /* static members */
  object CapacityProvider {
    
    /**
      * Get an existing CapacityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecs.CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    @JSImport("@pulumi/aws", "ecs.CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    @JSImport("@pulumi/aws", "ecs.CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState): typingsSlinky.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    @JSImport("@pulumi/aws", "ecs.CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    
    /**
      * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecs.CapacityProvider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecs.Cluster")
  @js.native
  class Cluster protected ()
    extends typingsSlinky.pulumiAws.ecsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecs.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ecsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "ecs.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ecsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "ecs.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsSlinky.pulumiAws.ecsClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws", "ecs.Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ecsClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecs.Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecs.Service")
  @js.native
  class Service protected ()
    extends typingsSlinky.pulumiAws.ecsMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Service {
    
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecs.Service.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.serviceMod.Service = js.native
    @JSImport("@pulumi/aws", "ecs.Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceMod.Service = js.native
    @JSImport("@pulumi/aws", "ecs.Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState): typingsSlinky.pulumiAws.serviceMod.Service = js.native
    @JSImport("@pulumi/aws", "ecs.Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceMod.Service = js.native
    
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecs.Service.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecs.TaskDefinition")
  @js.native
  class TaskDefinition protected ()
    extends typingsSlinky.pulumiAws.ecsMod.TaskDefinition {
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
  /* static members */
  object TaskDefinition {
    
    /**
      * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecs.TaskDefinition.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    @JSImport("@pulumi/aws", "ecs.TaskDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    @JSImport("@pulumi/aws", "ecs.TaskDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState): typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    @JSImport("@pulumi/aws", "ecs.TaskDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    
    /**
      * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecs.TaskDefinition.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecs.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws", "ecs.getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws", "ecs.getContainerDefinition")
  @js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] = js.native
  @JSImport("@pulumi/aws", "ecs.getContainerDefinition")
  @js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] = js.native
  
  @JSImport("@pulumi/aws", "ecs.getService")
  @js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = js.native
  @JSImport("@pulumi/aws", "ecs.getService")
  @js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = js.native
  
  @JSImport("@pulumi/aws", "ecs.getTaskDefinition")
  @js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] = js.native
  @JSImport("@pulumi/aws", "ecs.getTaskDefinition")
  @js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] = js.native
}
