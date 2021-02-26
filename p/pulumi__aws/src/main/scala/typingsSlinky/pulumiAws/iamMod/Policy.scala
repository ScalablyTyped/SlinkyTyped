package typingsSlinky.pulumiAws.iamMod

import typingsSlinky.pulumiAws.iamPolicyMod.PolicyArgs
import typingsSlinky.pulumiAws.iamPolicyMod.PolicyState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "Policy")
@js.native
class Policy protected ()
  extends typingsSlinky.pulumiAws.iamPolicyMod.Policy {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyArgs) = this()
  def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Policy {
  
  /**
    * Get an existing Policy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "Policy.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.iamPolicyMod.Policy = js.native
  @JSImport("@pulumi/aws/iam", "Policy.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.iamPolicyMod.Policy = js.native
  @JSImport("@pulumi/aws/iam", "Policy.get")
  @js.native
  def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.iamPolicyMod.Policy = js.native
  @JSImport("@pulumi/aws/iam", "Policy.get")
  @js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.iamPolicyMod.Policy = js.native
  
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "Policy.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean = js.native
}
