package typingsSlinky.pulumiAws.cloudwatchMod

import typingsSlinky.pulumiAws.eventPermissionMod.EventPermissionArgs
import typingsSlinky.pulumiAws.eventPermissionMod.EventPermissionState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch", "EventPermission")
@js.native
class EventPermission protected ()
  extends typingsSlinky.pulumiAws.eventPermissionMod.EventPermission {
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
  
  /**
    * Returns true if the given object is an instance of EventPermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
}
