package typingsSlinky.pulumiAws.lambdaMod

import typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMappingArgs
import typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMappingState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
class EventSourceMapping protected ()
  extends typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping {
  /**
    * Create a EventSourceMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventSourceMappingArgs) = this()
  def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
object EventSourceMapping extends js.Object {
  
  /**
    * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
  
  /**
    * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = js.native
}
