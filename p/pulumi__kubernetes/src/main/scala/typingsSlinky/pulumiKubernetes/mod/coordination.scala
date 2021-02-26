package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.v1LeaseListMod.LeaseListArgs
import typingsSlinky.pulumiKubernetes.v1LeaseMod.LeaseArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordination {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "coordination.v1.Lease")
    @js.native
    class Lease protected ()
      extends typingsSlinky.pulumiKubernetes.coordinationMod.v1.Lease {
      /**
        * Create a Lease resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: LeaseArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: LeaseArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Lease {
      
      /**
        * Get an existing Lease resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1.Lease.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1LeaseMod.Lease = js.native
      @JSImport("@pulumi/kubernetes", "coordination.v1.Lease.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1LeaseMod.Lease = js.native
      
      /**
        * Returns true if the given object is an instance of Lease.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1.Lease.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1/lease.Lease */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "coordination.v1.LeaseList")
    @js.native
    class LeaseList protected ()
      extends typingsSlinky.pulumiKubernetes.coordinationMod.v1.LeaseList {
      /**
        * Create a LeaseList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: LeaseListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: LeaseListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object LeaseList {
      
      /**
        * Get an existing LeaseList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1.LeaseList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1LeaseListMod.LeaseList = js.native
      @JSImport("@pulumi/kubernetes", "coordination.v1.LeaseList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1LeaseListMod.LeaseList = js.native
      
      /**
        * Returns true if the given object is an instance of LeaseList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1.LeaseList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1/leaseList.LeaseList */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "coordination.v1beta1.Lease")
    @js.native
    class Lease protected ()
      extends typingsSlinky.pulumiKubernetes.coordinationMod.v1beta1.Lease {
      /**
        * Create a Lease resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.leaseMod.LeaseArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.leaseMod.LeaseArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Lease {
      
      /**
        * Get an existing Lease resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.Lease.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.leaseMod.Lease = js.native
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.Lease.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.leaseMod.Lease = js.native
      
      /**
        * Returns true if the given object is an instance of Lease.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.Lease.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "coordination.v1beta1.LeaseList")
    @js.native
    class LeaseList protected ()
      extends typingsSlinky.pulumiKubernetes.coordinationMod.v1beta1.LeaseList {
      /**
        * Create a LeaseList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.leaseListMod.LeaseListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.leaseListMod.LeaseListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object LeaseList {
      
      /**
        * Get an existing LeaseList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.LeaseList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.leaseListMod.LeaseList = js.native
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.LeaseList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.leaseListMod.LeaseList = js.native
      
      /**
        * Returns true if the given object is an instance of LeaseList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "coordination.v1beta1.LeaseList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean = js.native
    }
  }
}
