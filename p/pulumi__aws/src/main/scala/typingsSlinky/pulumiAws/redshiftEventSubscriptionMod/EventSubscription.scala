package typingsSlinky.pulumiAws.redshiftEventSubscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/redshift/eventSubscription", "EventSubscription")
@js.native
class EventSubscription protected () extends CustomResource {
  /**
    * Create a EventSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventSubscriptionArgs) = this()
  def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  val customerAwsId: Output_[String] = js.native
  
  /**
    * A boolean flag to enable/disable the subscription. Defaults to true.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
    */
  val eventCategories: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The name of the Redshift event subscription.
    */
  val name: Output_[String] = js.native
  
  /**
    * The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
    */
  val severity: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the SNS topic to send events to.
    */
  val snsTopicArn: Output_[String] = js.native
  
  /**
    * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a sourceType must also be specified.
    */
  val sourceIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
    */
  val sourceType: Output_[js.UndefOr[String]] = js.native
  
  val status: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/redshift/eventSubscription", "EventSubscription")
@js.native
object EventSubscription extends js.Object {
  
  /**
    * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): EventSubscription = js.native
  
  /**
    * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
}
