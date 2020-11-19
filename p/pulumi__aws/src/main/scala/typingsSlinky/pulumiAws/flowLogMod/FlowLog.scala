package typingsSlinky.pulumiAws.flowLogMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/flowLog", "FlowLog")
@js.native
class FlowLog protected () extends CustomResource {
  /**
    * Create a FlowLog resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FlowLogArgs) = this()
  def this(name: String, args: FlowLogArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Flow Log.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the logging destination.
    */
  val logDestination: Output_[String] = js.native
  
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The fields to include in the flow log record, in the order in which they should appear.
    */
  val logFormat: Output_[String] = js.native
  
  /**
    * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
    *
    * @deprecated use 'log_destination' argument instead
    */
  val logGroupName: Output_[String] = js.native
  
  /**
    * The maximum interval of time
    * during which a flow of packets is captured and aggregated into a flow
    * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
    * minutes). Default: `600`.
    */
  val maxAggregationInterval: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * Subnet ID to attach to
    */
  val subnetId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: Output_[String] = js.native
  
  /**
    * VPC ID to attach to
    */
  val vpcId: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/flowLog", "FlowLog")
@js.native
object FlowLog extends js.Object {
  
  /**
    * Get an existing FlowLog resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): FlowLog = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FlowLog = js.native
  def get(name: String, id: Input[ID], state: FlowLogState): FlowLog = js.native
  def get(name: String, id: Input[ID], state: FlowLogState, opts: CustomResourceOptions): FlowLog = js.native
  
  /**
    * Returns true if the given object is an instance of FlowLog.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/flowLog.FlowLog */ Boolean = js.native
}
