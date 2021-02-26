package typingsSlinky.pulumiAws.iamMod

import typingsSlinky.pulumiAws.groupMembershipMod.GroupMembershipArgs
import typingsSlinky.pulumiAws.groupMembershipMod.GroupMembershipState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "GroupMembership")
@js.native
class GroupMembership protected ()
  extends typingsSlinky.pulumiAws.groupMembershipMod.GroupMembership {
  /**
    * Create a GroupMembership resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupMembershipArgs) = this()
  def this(name: String, args: GroupMembershipArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object GroupMembership {
  
  /**
    * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "GroupMembership.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.groupMembershipMod.GroupMembership = js.native
  @JSImport("@pulumi/aws/iam", "GroupMembership.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupMembershipMod.GroupMembership = js.native
  @JSImport("@pulumi/aws/iam", "GroupMembership.get")
  @js.native
  def get(name: String, id: Input[ID], state: GroupMembershipState): typingsSlinky.pulumiAws.groupMembershipMod.GroupMembership = js.native
  @JSImport("@pulumi/aws/iam", "GroupMembership.get")
  @js.native
  def get(name: String, id: Input[ID], state: GroupMembershipState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupMembershipMod.GroupMembership = js.native
  
  /**
    * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "GroupMembership.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupMembership.GroupMembership */ Boolean = js.native
}
