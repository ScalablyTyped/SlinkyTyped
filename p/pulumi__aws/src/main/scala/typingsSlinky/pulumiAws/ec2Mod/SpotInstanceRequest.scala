package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequestArgs
import typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequestState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "SpotInstanceRequest")
@js.native
class SpotInstanceRequest protected ()
  extends typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequest {
  /**
    * Create a SpotInstanceRequest resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SpotInstanceRequestArgs) = this()
  def this(name: String, args: SpotInstanceRequestArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object SpotInstanceRequest {
  
  /**
    * Get an existing SpotInstanceRequest resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "SpotInstanceRequest.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequest = js.native
  @JSImport("@pulumi/aws/ec2", "SpotInstanceRequest.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequest = js.native
  @JSImport("@pulumi/aws/ec2", "SpotInstanceRequest.get")
  @js.native
  def get(name: String, id: Input[ID], state: SpotInstanceRequestState): typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequest = js.native
  @JSImport("@pulumi/aws/ec2", "SpotInstanceRequest.get")
  @js.native
  def get(name: String, id: Input[ID], state: SpotInstanceRequestState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.spotInstanceRequestMod.SpotInstanceRequest = js.native
  
  /**
    * Returns true if the given object is an instance of SpotInstanceRequest.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "SpotInstanceRequest.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotInstanceRequest.SpotInstanceRequest */ Boolean = js.native
}
