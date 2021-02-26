package typingsSlinky.pulumiKubernetes.mod.apps

import typingsSlinky.pulumiKubernetes.controllerRevisionListMod.ControllerRevisionListArgs
import typingsSlinky.pulumiKubernetes.controllerRevisionMod.ControllerRevisionArgs
import typingsSlinky.pulumiKubernetes.deploymentListMod.DeploymentListArgs
import typingsSlinky.pulumiKubernetes.deploymentMod.DeploymentArgs
import typingsSlinky.pulumiKubernetes.statefulSetListMod.StatefulSetListArgs
import typingsSlinky.pulumiKubernetes.statefulSetMod.StatefulSetArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevision")
  @js.native
  class ControllerRevision protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.ControllerRevision {
    /**
      * Create a ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.controllerRevisionMod.ControllerRevision = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.controllerRevisionMod.ControllerRevision = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevision.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevision.ControllerRevision */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevisionList")
  @js.native
  class ControllerRevisionList protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.ControllerRevisionList {
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.controllerRevisionListMod.ControllerRevisionList = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.controllerRevisionListMod.ControllerRevisionList = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.ControllerRevisionList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionList.ControllerRevisionList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.Deployment")
  @js.native
  class Deployment protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.Deployment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.deploymentMod.Deployment = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.deploymentMod.Deployment = js.native
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.Deployment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deployment.Deployment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.DeploymentList")
  @js.native
  class DeploymentList protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.DeploymentList {
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.deploymentListMod.DeploymentList = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.deploymentListMod.DeploymentList = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.DeploymentList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentList.DeploymentList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSet")
  @js.native
  class StatefulSet protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.StatefulSet {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.statefulSetMod.StatefulSet = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.statefulSetMod.StatefulSet = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSetList")
  @js.native
  class StatefulSetList protected ()
    extends typingsSlinky.pulumiKubernetes.appsMod.v1beta1.StatefulSetList {
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
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.statefulSetListMod.StatefulSetList = js.native
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.statefulSetListMod.StatefulSetList = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "apps.v1beta1.StatefulSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSetList.StatefulSetList */ Boolean = js.native
  }
}
