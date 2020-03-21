package typingsSlinky.pulumiAws.mod.ses

import typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationArgs
import typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ses.DomainIdentityVerification")
@js.native
class DomainIdentityVerification protected ()
  extends typingsSlinky.pulumiAws.sesMod.DomainIdentityVerification {
  /**
    * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainIdentityVerificationArgs) = this()
  def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ses.DomainIdentityVerification")
@js.native
object DomainIdentityVerification extends js.Object {
  /**
    * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
  /**
    * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
}

