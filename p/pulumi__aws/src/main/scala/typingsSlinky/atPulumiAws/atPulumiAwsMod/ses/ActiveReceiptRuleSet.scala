package typingsSlinky.atPulumiAws.atPulumiAwsMod.ses

import typingsSlinky.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetArgs
import typingsSlinky.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet")
@js.native
class ActiveReceiptRuleSet protected ()
  extends typingsSlinky.atPulumiAws.sesMod.ActiveReceiptRuleSet {
  /**
    * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ActiveReceiptRuleSetArgs) = this()
  def this(name: String, args: ActiveReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet")
@js.native
object ActiveReceiptRuleSet extends js.Object {
  /**
    * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): typingsSlinky.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
  /**
    * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
}

