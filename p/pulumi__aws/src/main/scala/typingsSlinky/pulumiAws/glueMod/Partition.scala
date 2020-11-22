package typingsSlinky.pulumiAws.glueMod

import typingsSlinky.pulumiAws.partitionMod.PartitionArgs
import typingsSlinky.pulumiAws.partitionMod.PartitionState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue", "Partition")
@js.native
class Partition protected ()
  extends typingsSlinky.pulumiAws.partitionMod.Partition {
  /**
    * Create a Partition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PartitionArgs) = this()
  def this(name: String, args: PartitionArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/glue", "Partition")
@js.native
object Partition extends js.Object {
  
  /**
    * Get an existing Partition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
  def get(name: String, id: Input[ID], state: PartitionState): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
  def get(name: String, id: Input[ID], state: PartitionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
  
  /**
    * Returns true if the given object is an instance of Partition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean = js.native
}
