package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.queueMod.QueueArgs
import typingsSlinky.pulumiAws.queueMod.QueueState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "mediaconvert")
@js.native
object mediaconvert extends js.Object {
  
  @js.native
  class Queue protected ()
    extends typingsSlinky.pulumiAws.mediaconvertMod.Queue {
    /**
      * Create a Queue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: QueueArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Queue extends js.Object {
    
    /**
      * Get an existing Queue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.queueMod.Queue = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.queueMod.Queue = js.native
    def get(name: String, id: Input[ID], state: QueueState): typingsSlinky.pulumiAws.queueMod.Queue = js.native
    def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.queueMod.Queue = js.native
    
    /**
      * Returns true if the given object is an instance of Queue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediaconvert/queue.Queue */ Boolean = js.native
  }
}
