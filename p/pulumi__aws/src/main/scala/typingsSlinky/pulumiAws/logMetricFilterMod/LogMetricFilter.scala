package typingsSlinky.pulumiAws.logMetricFilterMod

import typingsSlinky.pulumiAws.outputMod.cloudwatch.LogMetricFilterMetricTransformation
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
@js.native
class LogMetricFilter protected () extends CustomResource {
  /**
    * Create a LogMetricFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogMetricFilterArgs) = this()
  def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: Output_[String] = js.native
  
  /**
    * A block defining collection of information needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: Output_[LogMetricFilterMetricTransformation] = js.native
  
  /**
    * A name for the metric filter.
    */
  val name: Output_[String] = js.native
  
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
@js.native
object LogMetricFilter extends js.Object {
  
  /**
    * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState): LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): LogMetricFilter = js.native
  
  /**
    * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
}
