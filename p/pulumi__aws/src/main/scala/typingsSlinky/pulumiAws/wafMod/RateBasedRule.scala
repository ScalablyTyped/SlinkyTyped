package typingsSlinky.pulumiAws.wafMod

import typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRuleArgs
import typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRuleState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "RateBasedRule")
@js.native
class RateBasedRule protected ()
  extends typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule {
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
@JSImport("@pulumi/aws/waf", "RateBasedRule")
@js.native
object RateBasedRule extends js.Object {
  /**
    * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = js.native
}

