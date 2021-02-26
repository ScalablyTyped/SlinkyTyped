package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.instanceMod.InstanceArgs
import typingsSlinky.pulumiAws.instanceMod.InstanceState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.Instance")
@js.native
class Instance protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.Instance {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceArgs) = this()
  def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Instance {
  
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.Instance.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.instanceMod.Instance = js.native
  @JSImport("@pulumi/aws", "ec2.Instance.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceMod.Instance = js.native
  @JSImport("@pulumi/aws", "ec2.Instance.get")
  @js.native
  def get(name: String, id: Input[ID], state: InstanceState): typingsSlinky.pulumiAws.instanceMod.Instance = js.native
  @JSImport("@pulumi/aws", "ec2.Instance.get")
  @js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.instanceMod.Instance = js.native
  
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.Instance.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/instance.Instance */ Boolean = js.native
}
