package typingsSlinky.pulumiAws.staticIpAttachmentMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lightsail/staticIpAttachment", "StaticIpAttachment")
@js.native
class StaticIpAttachment protected () extends CustomResource {
  /**
    * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StaticIpAttachmentArgs) = this()
  def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: Output_[String] = js.native
  
  /**
    * The allocated static IP address
    */
  val ipAddress: Output_[String] = js.native
  
  /**
    * The name of the allocated static IP
    */
  val staticIpName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lightsail/staticIpAttachment", "StaticIpAttachment")
@js.native
object StaticIpAttachment extends js.Object {
  
  /**
    * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): StaticIpAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StaticIpAttachment = js.native
  def get(name: String, id: Input[ID], state: StaticIpAttachmentState): StaticIpAttachment = js.native
  def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): StaticIpAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
}
