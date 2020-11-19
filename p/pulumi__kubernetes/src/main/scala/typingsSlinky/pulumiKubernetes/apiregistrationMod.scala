package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.v1ApiserviceListMod.APIServiceListArgs
import typingsSlinky.pulumiKubernetes.v1ApiserviceMod.APIServiceArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/apiregistration", JSImport.Namespace)
@js.native
object apiregistrationMod extends js.Object {
  
  @js.native
  object v1 extends js.Object {
    
    @js.native
    class APIService protected ()
      extends typingsSlinky.pulumiKubernetes.apiregistrationV1Mod.APIService {
      /**
        * Create a APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: APIServiceArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: APIServiceArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object APIService extends js.Object {
      
      /**
        * Get an existing APIService resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean = js.native
    }
    
    @js.native
    class APIServiceList protected ()
      extends typingsSlinky.pulumiKubernetes.apiregistrationV1Mod.APIServiceList {
      /**
        * Create a APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: APIServiceListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: APIServiceListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      
      /**
        * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = js.native
      
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiserviceList.APIServiceList */ Boolean = js.native
    }
  }
  
  @js.native
  object v1beta1 extends js.Object {
    
    @js.native
    class APIService protected ()
      extends typingsSlinky.pulumiKubernetes.apiregistrationV1beta1Mod.APIService {
      /**
        * Create a APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.apiserviceMod.APIServiceArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.apiserviceMod.APIServiceArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object APIService extends js.Object {
      
      /**
        * Get an existing APIService resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.apiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.apiserviceMod.APIService = js.native
      
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean = js.native
    }
    
    @js.native
    class APIServiceList protected ()
      extends typingsSlinky.pulumiKubernetes.apiregistrationV1beta1Mod.APIServiceList {
      /**
        * Create a APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.apiserviceListMod.APIServiceListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.apiserviceListMod.APIServiceListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      
      /**
        * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.apiserviceListMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.apiserviceListMod.APIServiceList = js.native
      
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiserviceList.APIServiceList */ Boolean = js.native
    }
  }
}
