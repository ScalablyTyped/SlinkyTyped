package typingsSlinky.pulumiAws.mod.wafregional

import typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSetArgs
import typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "wafregional.IpSet")
@js.native
class IpSet protected ()
  extends typingsSlinky.pulumiAws.wafregionalMod.IpSet {
  /**
    * Create a IpSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: IpSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "wafregional.IpSet")
@js.native
object IpSet extends js.Object {
  
  /**
    * Get an existing IpSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
  
  /**
    * Returns true if the given object is an instance of IpSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ipSet.IpSet */ Boolean = js.native
}
