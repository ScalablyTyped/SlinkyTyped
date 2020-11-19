package typingsSlinky.pulumiAws.staticIpMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp")
@js.native
class StaticIp protected () extends CustomResource {
  /**
    * Create a StaticIp resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: StaticIpArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Lightsail static IP
    */
  val arn: Output_[String] = js.native
  
  /**
    * The allocated static IP address
    */
  val ipAddress: Output_[String] = js.native
  
  /**
    * The name for the allocated static IP
    */
  val name: Output_[String] = js.native
  
  /**
    * The support code.
    */
  val supportCode: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp")
@js.native
object StaticIp extends js.Object {
  
  /**
    * Get an existing StaticIp resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): StaticIp = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StaticIp = js.native
  def get(name: String, id: Input[ID], state: StaticIpState): StaticIp = js.native
  def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): StaticIp = js.native
  
  /**
    * Returns true if the given object is an instance of StaticIp.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
}
