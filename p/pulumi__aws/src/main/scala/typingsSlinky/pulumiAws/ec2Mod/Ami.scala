package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.amiMod.AmiArgs
import typingsSlinky.pulumiAws.amiMod.AmiState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "Ami")
@js.native
class Ami protected ()
  extends typingsSlinky.pulumiAws.amiMod.Ami {
  /**
    * Create a Ami resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AmiArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: AmiArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Ami {
  
  /**
    * Get an existing Ami resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "Ami.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.amiMod.Ami = js.native
  @JSImport("@pulumi/aws/ec2", "Ami.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.amiMod.Ami = js.native
  @JSImport("@pulumi/aws/ec2", "Ami.get")
  @js.native
  def get(name: String, id: Input[ID], state: AmiState): typingsSlinky.pulumiAws.amiMod.Ami = js.native
  @JSImport("@pulumi/aws/ec2", "Ami.get")
  @js.native
  def get(name: String, id: Input[ID], state: AmiState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.amiMod.Ami = js.native
  
  /**
    * Returns true if the given object is an instance of Ami.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "Ami.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/ami.Ami */ Boolean = js.native
}
