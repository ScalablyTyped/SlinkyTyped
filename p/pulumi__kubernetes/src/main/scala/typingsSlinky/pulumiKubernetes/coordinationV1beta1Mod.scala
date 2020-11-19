package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.leaseListMod.LeaseListArgs
import typingsSlinky.pulumiKubernetes.leaseMod.LeaseArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/coordination/v1beta1", JSImport.Namespace)
@js.native
object coordinationV1beta1Mod extends js.Object {
  
  @js.native
  class Lease protected ()
    extends typingsSlinky.pulumiKubernetes.leaseMod.Lease {
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
  @js.native
  object Lease extends js.Object {
    
    /**
      * Get an existing Lease resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.leaseMod.Lease = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.leaseMod.Lease = js.native
    
    /**
      * Returns true if the given object is an instance of Lease.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean = js.native
  }
  
  @js.native
  class LeaseList protected ()
    extends typingsSlinky.pulumiKubernetes.leaseListMod.LeaseList {
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
  @js.native
  object LeaseList extends js.Object {
    
    /**
      * Get an existing LeaseList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.leaseListMod.LeaseList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.leaseListMod.LeaseList = js.native
    
    /**
      * Returns true if the given object is an instance of LeaseList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean = js.native
  }
}
