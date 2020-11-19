package typingsSlinky.pulumiAws.ruleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.wafregional.RuleGroupActivatedRule
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup")
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
    * A list of activated rules, see below
    */
  val activatedRules: Output_[js.UndefOr[js.Array[RuleGroupActivatedRule]]] = js.native
  
  /**
    * The ARN of the WAF Regional Rule Group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: Output_[String] = js.native
  
  /**
    * A friendly name of the rule group
    */
  val name: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = js.native
}
