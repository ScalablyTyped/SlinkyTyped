package typingsSlinky.pulumiAws.topicPolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy")
@js.native
class TopicPolicy protected () extends CustomResource {
  /**
    * Create a TopicPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicPolicyArgs) = this()
  def this(name: String, args: TopicPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the SNS topic
    */
  val arn: Output_[String] = js.native
  
  /**
    * The fully-formed AWS policy as JSON.
    */
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy")
@js.native
object TopicPolicy extends js.Object {
  
  /**
    * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TopicPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TopicPolicy = js.native
  def get(name: String, id: Input[ID], state: TopicPolicyState): TopicPolicy = js.native
  def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): TopicPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
}
