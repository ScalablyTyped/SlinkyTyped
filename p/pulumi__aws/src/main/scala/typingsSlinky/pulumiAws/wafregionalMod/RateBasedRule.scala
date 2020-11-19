package typingsSlinky.pulumiAws.wafregionalMod

import typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRuleArgs
import typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRuleState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafregional", "RateBasedRule")
@js.native
class RateBasedRule protected ()
  extends typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule {
  /**
    * Create a RateBasedRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RateBasedRuleArgs) = this()
  def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/wafregional", "RateBasedRule")
@js.native
object RateBasedRule extends js.Object {
  
  /**
    * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
  
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
}
