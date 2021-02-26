package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.v1IngressClassListMod.IngressClassListArgs
import typingsSlinky.pulumiKubernetes.v1IngressClassMod.IngressClassArgs
import typingsSlinky.pulumiKubernetes.v1IngressListMod.IngressListArgs
import typingsSlinky.pulumiKubernetes.v1IngressMod.IngressArgs
import typingsSlinky.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyListArgs
import typingsSlinky.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicyArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkingV1Mod {
  
  @JSImport("@pulumi/kubernetes/networking/v1", "Ingress")
  @js.native
  class Ingress protected ()
    extends typingsSlinky.pulumiKubernetes.v1IngressMod.Ingress {
    /**
      * Create a Ingress resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Ingress {
    
    /**
      * Get an existing Ingress resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "Ingress.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1IngressMod.Ingress = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "Ingress.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1IngressMod.Ingress = js.native
    
    /**
      * Returns true if the given object is an instance of Ingress.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "Ingress.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingress.Ingress */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass")
  @js.native
  class IngressClass protected ()
    extends typingsSlinky.pulumiKubernetes.v1IngressClassMod.IngressClass {
    /**
      * Create a IngressClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClass {
    
    /**
      * Get an existing IngressClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1IngressClassMod.IngressClass = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1IngressClassMod.IngressClass = js.native
    
    /**
      * Returns true if the given object is an instance of IngressClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClass.IngressClass */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList")
  @js.native
  class IngressClassList protected ()
    extends typingsSlinky.pulumiKubernetes.v1IngressClassListMod.IngressClassList {
    /**
      * Create a IngressClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClassList {
    
    /**
      * Get an existing IngressClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1IngressClassListMod.IngressClassList = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1IngressClassListMod.IngressClassList = js.native
    
    /**
      * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClassList.IngressClassList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressList")
  @js.native
  class IngressList protected ()
    extends typingsSlinky.pulumiKubernetes.v1IngressListMod.IngressList {
    /**
      * Create a IngressList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressList {
    
    /**
      * Get an existing IngressList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1IngressListMod.IngressList = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1IngressListMod.IngressList = js.native
    
    /**
      * Returns true if the given object is an instance of IngressList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressList.IngressList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy")
  @js.native
  class NetworkPolicy protected ()
    extends typingsSlinky.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy {
    /**
      * Create a NetworkPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkPolicy {
    
    /**
      * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicy.NetworkPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList")
  @js.native
  class NetworkPolicyList protected ()
    extends typingsSlinky.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList {
    /**
      * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkPolicyList {
    
    /**
      * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
    
    /**
      * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicyList.NetworkPolicyList */ Boolean = js.native
  }
}
