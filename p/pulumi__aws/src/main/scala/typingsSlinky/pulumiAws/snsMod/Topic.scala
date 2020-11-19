package typingsSlinky.pulumiAws.snsMod

import typingsSlinky.pulumiAws.topicMod.TopicArgs
import typingsSlinky.pulumiAws.topicMod.TopicState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns", "Topic")
@js.native
class Topic protected ()
  extends typingsSlinky.pulumiAws.topicMod.Topic {
  /**
    * Create a Topic resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TopicArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: TopicArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/sns", "Topic")
@js.native
object Topic extends js.Object {
  
  /**
    * Get an existing Topic resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.topicMod.Topic = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicMod.Topic = js.native
  def get(name: String, id: Input[ID], state: TopicState): typingsSlinky.pulumiAws.topicMod.Topic = js.native
  def get(name: String, id: Input[ID], state: TopicState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicMod.Topic = js.native
  
  /**
    * Returns true if the given object is an instance of Topic.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topic.Topic */ Boolean = js.native
}
