package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroupArgs
import typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup")
@js.native
class DefaultSecurityGroup protected ()
  extends typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroup {
  /**
    * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultSecurityGroupArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: DefaultSecurityGroupArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object DefaultSecurityGroup {
  
  /**
    * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroup = js.native
  @JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroup = js.native
  @JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup.get")
  @js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState): typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroup = js.native
  @JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup.get")
  @js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.defaultSecurityGroupMod.DefaultSecurityGroup = js.native
  
  /**
    * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "DefaultSecurityGroup.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean = js.native
}
