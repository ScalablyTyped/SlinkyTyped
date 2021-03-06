package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicyArgs
import typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicyState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dlmMod {
  
  @JSImport("@pulumi/aws/dlm", "LifecyclePolicy")
  @js.native
  class LifecyclePolicy protected ()
    extends typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicy {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecyclePolicyArgs) = this()
    def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LifecyclePolicy {
    
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dlm", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lifecyclePolicyMod.LifecyclePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dlm", "LifecyclePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dlm/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
}
