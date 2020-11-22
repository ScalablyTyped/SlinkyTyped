package typingsSlinky.pulumiAws.route53Mod

import typingsSlinky.pulumiAws.recordMod.RecordArgs
import typingsSlinky.pulumiAws.recordMod.RecordState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "Record")
@js.native
class Record protected ()
  extends typingsSlinky.pulumiAws.recordMod.Record {
  /**
    * Create a Record resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecordArgs) = this()
  def this(name: String, args: RecordArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/route53", "Record")
@js.native
object Record extends js.Object {
  
  /**
    * Get an existing Record resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.recordMod.Record = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
  def get(name: String, id: Input[ID], state: RecordState): typingsSlinky.pulumiAws.recordMod.Record = js.native
  def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
  
  /**
    * Returns true if the given object is an instance of Record.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
}
