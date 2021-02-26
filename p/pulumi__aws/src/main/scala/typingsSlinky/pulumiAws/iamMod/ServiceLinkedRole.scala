package typingsSlinky.pulumiAws.iamMod

import typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRoleArgs
import typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRoleState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "ServiceLinkedRole")
@js.native
class ServiceLinkedRole protected ()
  extends typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRole {
  /**
    * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServiceLinkedRoleArgs) = this()
  def this(name: String, args: ServiceLinkedRoleArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object ServiceLinkedRole {
  
  /**
    * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "ServiceLinkedRole.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRole = js.native
  @JSImport("@pulumi/aws/iam", "ServiceLinkedRole.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRole = js.native
  @JSImport("@pulumi/aws/iam", "ServiceLinkedRole.get")
  @js.native
  def get(name: String, id: Input[ID], state: ServiceLinkedRoleState): typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRole = js.native
  @JSImport("@pulumi/aws/iam", "ServiceLinkedRole.get")
  @js.native
  def get(name: String, id: Input[ID], state: ServiceLinkedRoleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceLinkedRoleMod.ServiceLinkedRole = js.native
  
  /**
    * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "ServiceLinkedRole.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serviceLinkedRole.ServiceLinkedRole */ Boolean = js.native
}
