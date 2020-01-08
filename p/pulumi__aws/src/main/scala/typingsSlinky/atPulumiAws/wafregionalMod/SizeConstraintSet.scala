package typingsSlinky.atPulumiAws.wafregionalMod

import typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSetArgs
import typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSetState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional", "SizeConstraintSet")
@js.native
class SizeConstraintSet protected ()
  extends typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet {
  /**
    * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SizeConstraintSetArgs) = this()
  def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/wafregional", "SizeConstraintSet")
@js.native
object SizeConstraintSet extends js.Object {
  /**
    * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState): typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
  /**
    * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
}

