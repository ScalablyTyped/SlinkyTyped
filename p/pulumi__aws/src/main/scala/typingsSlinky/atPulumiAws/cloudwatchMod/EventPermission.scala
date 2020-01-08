package typingsSlinky.atPulumiAws.cloudwatchMod

import typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermissionArgs
import typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermissionState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventPermission")
@js.native
class EventPermission protected ()
  extends typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermission {
  /**
    * Create a EventPermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventPermissionArgs) = this()
  def this(name: String, args: EventPermissionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "EventPermission")
@js.native
object EventPermission extends js.Object {
  /**
    * Get an existing EventPermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState): typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
  /**
    * Returns true if the given object is an instance of EventPermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
}

