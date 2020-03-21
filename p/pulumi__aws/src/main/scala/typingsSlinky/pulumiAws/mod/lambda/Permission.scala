package typingsSlinky.pulumiAws.mod.lambda

import typingsSlinky.pulumiAws.permissionMod.PermissionArgs
import typingsSlinky.pulumiAws.permissionMod.PermissionState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.Permission")
@js.native
class Permission protected ()
  extends typingsSlinky.pulumiAws.lambdaMod.Permission {
  /**
    * Create a Permission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PermissionArgs) = this()
  def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "lambda.Permission")
@js.native
object Permission extends js.Object {
  /**
    * Get an existing Permission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
  /**
    * Returns true if the given object is an instance of Permission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ Boolean = js.native
}

