package typingsSlinky.pulumiAws.lightsailDomainMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lightsail/domain", "Domain")
@js.native
class Domain protected () extends CustomResource {
  /**
    * Create a Domain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainArgs) = this()
  def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Lightsail domain
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the Lightsail domain to manage
    */
  val domainName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lightsail/domain", "Domain")
@js.native
object Domain extends js.Object {
  
  /**
    * Get an existing Domain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Domain = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
  
  /**
    * Returns true if the given object is an instance of Domain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = js.native
}
