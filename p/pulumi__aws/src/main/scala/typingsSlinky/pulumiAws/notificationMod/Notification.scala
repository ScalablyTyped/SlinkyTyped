package typingsSlinky.pulumiAws.notificationMod

import typingsSlinky.pulumiAws.notificationTypeMod.NotificationType
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/autoscaling/notification", "Notification")
@js.native
class Notification protected () extends CustomResource {
  /**
    * Create a Notification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NotificationArgs) = this()
  def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: Output_[js.Array[String]] = js.native
  
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
    */
  val notifications: Output_[js.Array[NotificationType]] = js.native
  
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/autoscaling/notification", "Notification")
@js.native
object Notification extends js.Object {
  
  /**
    * Get an existing Notification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Notification = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Notification = js.native
  def get(name: String, id: Input[ID], state: NotificationState): Notification = js.native
  def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): Notification = js.native
  
  /**
    * Returns true if the given object is an instance of Notification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
}
