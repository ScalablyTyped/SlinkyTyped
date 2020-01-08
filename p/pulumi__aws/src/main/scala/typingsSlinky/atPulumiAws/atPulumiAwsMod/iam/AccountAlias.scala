package typingsSlinky.atPulumiAws.atPulumiAwsMod.iam

import typingsSlinky.atPulumiAws.iamAccountAliasMod.AccountAliasArgs
import typingsSlinky.atPulumiAws.iamAccountAliasMod.AccountAliasState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.AccountAlias")
@js.native
class AccountAlias protected ()
  extends typingsSlinky.atPulumiAws.iamMod.AccountAlias {
  /**
    * Create a AccountAlias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccountAliasArgs) = this()
  def this(name: String, args: AccountAliasArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.AccountAlias")
@js.native
object AccountAlias extends js.Object {
  /**
    * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState): typingsSlinky.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
  /**
    * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = js.native
}

