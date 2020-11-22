package typingsSlinky.pulumiAws.loggingConfigurationMod

import typingsSlinky.pulumiAws.outputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/networkfirewall/loggingConfiguration", "LoggingConfiguration")
@js.native
class LoggingConfiguration protected () extends CustomResource {
  /**
    * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LoggingConfigurationArgs) = this()
  def this(name: String, args: LoggingConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the Network Firewall firewall.
    */
  val firewallArn: Output_[String] = js.native
  
  /**
    * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
    */
  val loggingConfiguration: Output_[LoggingConfigurationLoggingConfiguration] = js.native
}
/* static members */
@JSImport("@pulumi/aws/networkfirewall/loggingConfiguration", "LoggingConfiguration")
@js.native
object LoggingConfiguration extends js.Object {
  
  /**
    * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: LoggingConfigurationState): LoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: LoggingConfigurationState, opts: CustomResourceOptions): LoggingConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/loggingConfiguration.LoggingConfiguration */ Boolean = js.native
}
