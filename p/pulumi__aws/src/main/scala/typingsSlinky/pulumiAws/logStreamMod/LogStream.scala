package typingsSlinky.pulumiAws.logStreamMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream")
@js.native
class LogStream protected () extends CustomResource {
  /**
    * Create a LogStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogStreamArgs) = this()
  def this(name: String, args: LogStreamArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) specifying the log stream.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the log group under which the log stream is to be created.
    */
  val logGroupName: Output_[String] = js.native
  
  /**
    * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cloudwatch/logStream", "LogStream")
@js.native
object LogStream extends js.Object {
  
  /**
    * Get an existing LogStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LogStream = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogStream = js.native
  def get(name: String, id: Input[ID], state: LogStreamState): LogStream = js.native
  def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): LogStream = js.native
  
  /**
    * Returns true if the given object is an instance of LogStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = js.native
}
