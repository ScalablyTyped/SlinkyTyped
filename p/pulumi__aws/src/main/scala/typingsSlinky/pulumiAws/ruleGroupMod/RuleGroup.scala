package typingsSlinky.pulumiAws.ruleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.networkfirewall.RuleGroupRuleGroup
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/networkfirewall/ruleGroup", "RuleGroup")
@js.native
class RuleGroup protected () extends CustomResource {
  /**
    * Create a RuleGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RuleGroupArgs) = this()
  def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) that identifies the rule group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
    */
  val capacity: Output_[Double] = js.native
  
  /**
    * A friendly description of the rule group.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A friendly name of the rule group.
    */
  val name: Output_[String] = js.native
  
  /**
    * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
    */
  val ruleGroup: Output_[RuleGroupRuleGroup] = js.native
  
  /**
    * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `ruleGroup` is specified.
    */
  val rules: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A map of key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
    */
  val `type`: Output_[String] = js.native
  
  /**
    * A string token used when updating the rule group.
    */
  val updateToken: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/networkfirewall/ruleGroup", "RuleGroup")
@js.native
object RuleGroup extends js.Object {
  
  /**
    * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState): RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): RuleGroup = js.native
  
  /**
    * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/ruleGroup.RuleGroup */ Boolean = js.native
}
