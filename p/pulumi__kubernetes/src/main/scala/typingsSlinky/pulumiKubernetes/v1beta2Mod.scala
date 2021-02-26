package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.daemonSetListMod.DaemonSetListArgs
import typingsSlinky.pulumiKubernetes.daemonSetMod.DaemonSetArgs
import typingsSlinky.pulumiKubernetes.replicaSetListMod.ReplicaSetListArgs
import typingsSlinky.pulumiKubernetes.replicaSetMod.ReplicaSetArgs
import typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionListMod.ControllerRevisionListArgs
import typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionMod.ControllerRevisionArgs
import typingsSlinky.pulumiKubernetes.v1beta2DeploymentListMod.DeploymentListArgs
import typingsSlinky.pulumiKubernetes.v1beta2DeploymentMod.DeploymentArgs
import typingsSlinky.pulumiKubernetes.v1beta2StatefulSetListMod.StatefulSetListArgs
import typingsSlinky.pulumiKubernetes.v1beta2StatefulSetMod.StatefulSetArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta2Mod {
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevision")
  @js.native
  class ControllerRevision protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionMod.ControllerRevision {
    /**
      * Create a ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta2/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevision {
    
    /**
      * Get an existing ControllerRevision resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionMod.ControllerRevision = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionMod.ControllerRevision = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevision.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/controllerRevision.ControllerRevision */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevisionList")
  @js.native
  class ControllerRevisionList protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionListMod.ControllerRevisionList {
    /**
      * Create a ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevisionList {
    
    /**
      * Get an existing ControllerRevisionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionListMod.ControllerRevisionList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2ControllerRevisionListMod.ControllerRevisionList = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ControllerRevisionList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/controllerRevisionList.ControllerRevisionList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSet")
  @js.native
  class DaemonSet protected ()
    extends typingsSlinky.pulumiKubernetes.daemonSetMod.DaemonSet {
    /**
      * Create a DaemonSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta2/DaemonSet is deprecated by apps/v1/DaemonSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: DaemonSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DaemonSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DaemonSet {
    
    /**
      * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.daemonSetMod.DaemonSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.daemonSetMod.DaemonSet = js.native
    
    /**
      * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSet.DaemonSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSetList")
  @js.native
  class DaemonSetList protected ()
    extends typingsSlinky.pulumiKubernetes.daemonSetListMod.DaemonSetList {
    /**
      * Create a DaemonSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DaemonSetListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DaemonSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DaemonSetList {
    
    /**
      * Get an existing DaemonSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.daemonSetListMod.DaemonSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.daemonSetListMod.DaemonSetList = js.native
    
    /**
      * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DaemonSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSetList.DaemonSetList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "Deployment")
  @js.native
  class Deployment protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2DeploymentMod.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: DeploymentArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Deployment {
    
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2DeploymentMod.Deployment = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2DeploymentMod.Deployment = js.native
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "Deployment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/deployment.Deployment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "DeploymentList")
  @js.native
  class DeploymentList protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2DeploymentListMod.DeploymentList {
    /**
      * Create a DeploymentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DeploymentListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DeploymentListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DeploymentList {
    
    /**
      * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2DeploymentListMod.DeploymentList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2DeploymentListMod.DeploymentList = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "DeploymentList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/deploymentList.DeploymentList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSet")
  @js.native
  class ReplicaSet protected ()
    extends typingsSlinky.pulumiKubernetes.replicaSetMod.ReplicaSet {
    /**
      * Create a ReplicaSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta2/ReplicaSet is deprecated by apps/v1/ReplicaSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: ReplicaSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ReplicaSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicaSet {
    
    /**
      * Get an existing ReplicaSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.replicaSetMod.ReplicaSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.replicaSetMod.ReplicaSet = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSet.ReplicaSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList")
  @js.native
  class ReplicaSetList protected ()
    extends typingsSlinky.pulumiKubernetes.replicaSetListMod.ReplicaSetList {
    /**
      * Create a ReplicaSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ReplicaSetListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ReplicaSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicaSetList {
    
    /**
      * Get an existing ReplicaSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.replicaSetListMod.ReplicaSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.replicaSetListMod.ReplicaSetList = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicaSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSetList.ReplicaSetList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSet")
  @js.native
  class StatefulSet protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2StatefulSetMod.StatefulSet {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta2/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSet {
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2StatefulSetMod.StatefulSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2StatefulSetMod.StatefulSet = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/statefulSet.StatefulSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSetList")
  @js.native
  class StatefulSetList protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta2StatefulSetListMod.StatefulSetList {
    /**
      * Create a StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSetList {
    
    /**
      * Get an existing StatefulSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta2StatefulSetListMod.StatefulSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta2StatefulSetListMod.StatefulSetList = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta2", "StatefulSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/statefulSetList.StatefulSetList */ Boolean = js.native
  }
}
