package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespaceArgs
import typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespaceState
import typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceArgs
import typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceState
import typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceArgs
import typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceState
import typingsSlinky.pulumiAws.servicediscoveryServiceMod.ServiceArgs
import typingsSlinky.pulumiAws.servicediscoveryServiceMod.ServiceState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicediscoveryMod {
  
  @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace")
  @js.native
  class HttpNamespace protected ()
    extends typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespace {
    /**
      * Create a HttpNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HttpNamespaceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HttpNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HttpNamespace {
    
    /**
      * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: HttpNamespaceState): typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: HttpNamespaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    
    /**
      * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery", "HttpNamespace.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace")
  @js.native
  class PrivateDnsNamespace protected ()
    extends typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace {
    /**
      * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrivateDnsNamespaceArgs) = this()
    def this(name: String, args: PrivateDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PrivateDnsNamespace {
    
    /**
      * Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState): typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    
    /**
      * Returns true if the given object is an instance of PrivateDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace")
  @js.native
  class PublicDnsNamespace protected ()
    extends typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace {
    /**
      * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PublicDnsNamespaceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PublicDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublicDnsNamespace {
    
    /**
      * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState): typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    
    /**
      * Returns true if the given object is an instance of PublicDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery", "PublicDnsNamespace.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/servicediscovery", "Service")
  @js.native
  class Service protected ()
    extends typingsSlinky.pulumiAws.servicediscoveryServiceMod.Service {
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
    @JSImport("@pulumi/aws/servicediscovery", "Service.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.servicediscoveryServiceMod.Service = js.native
    @JSImport("@pulumi/aws/servicediscovery", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.servicediscoveryServiceMod.Service = js.native
    @JSImport("@pulumi/aws/servicediscovery", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState): typingsSlinky.pulumiAws.servicediscoveryServiceMod.Service = js.native
    @JSImport("@pulumi/aws/servicediscovery", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.servicediscoveryServiceMod.Service = js.native
    
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery", "Service.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean = js.native
  }
}
