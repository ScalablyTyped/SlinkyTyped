package typingsSlinky.pulumiAws.sesMod

import typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentityArgs
import typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentityState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ses", "EmailIdentity")
@js.native
class EmailIdentity protected ()
  extends typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity {
  /**
    * Create a EmailIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EmailIdentityArgs) = this()
  def this(name: String, args: EmailIdentityArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/ses", "EmailIdentity")
@js.native
object EmailIdentity extends js.Object {
  
  /**
    * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
  def get(name: String, id: Input[ID], state: EmailIdentityState): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
  def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
  
  /**
    * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = js.native
}
