package typingsSlinky.pulumiAws.organizationCustomRuleMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule")
@js.native
class OrganizationCustomRule protected () extends CustomResource {
  /**
    * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationCustomRuleArgs) = this()
  def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the rule
    */
  val arn: Output_[String] = js.native
  
  /**
    * Description of the rule
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * List of AWS account identifiers to exclude from the rule
    */
  val excludedAccounts: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * A string in JSON format that is passed to the AWS Config Rule Lambda Function
    */
  val inputParameters: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the rule Lambda Function
    */
  val lambdaFunctionArn: Output_[String] = js.native
  
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
    */
  val maximumExecutionFrequency: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the rule
    */
  val name: Output_[String] = js.native
  
  /**
    * Identifier of the AWS resource to evaluate
    */
  val resourceIdScope: Output_[js.UndefOr[String]] = js.native
  
  /**
    * List of types of AWS resources to evaluate
    */
  val resourceTypesScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: Output_[js.UndefOr[String]] = js.native
  
  /**
    * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
    */
  val triggerTypes: Output_[js.Array[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule")
@js.native
object OrganizationCustomRule extends js.Object {
  
  /**
    * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): OrganizationCustomRule = js.native
  
  /**
    * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
}
