package typingsSlinky.pulumiAws.mod.opsworks

import typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayerArgs
import typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.JavaAppLayer")
@js.native
class JavaAppLayer protected ()
  extends typingsSlinky.pulumiAws.opsworksMod.JavaAppLayer {
  /**
    * Create a JavaAppLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: JavaAppLayerArgs) = this()
  def this(name: String, args: JavaAppLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.JavaAppLayer")
@js.native
object JavaAppLayer extends js.Object {
  /**
    * Get an existing JavaAppLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
  def get(name: String, id: Input[ID], state: JavaAppLayerState): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
  def get(name: String, id: Input[ID], state: JavaAppLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
  /**
    * Returns true if the given object is an instance of JavaAppLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/javaAppLayer.JavaAppLayer */ Boolean = js.native
}

