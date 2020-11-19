package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventListArgs
import typingsSlinky.pulumiKubernetes.v1beta1EventMod.EventArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/events/v1beta1", JSImport.Namespace)
@js.native
object eventsV1beta1Mod extends js.Object {
  
  @js.native
  class Event protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta1EventMod.Event {
    /**
      * Create a Event resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Event extends js.Object {
    
    /**
      * Get an existing Event resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1EventMod.Event = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1EventMod.Event = js.native
    
    /**
      * Returns true if the given object is an instance of Event.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/event.Event */ Boolean = js.native
  }
  
  @js.native
  class EventList protected ()
    extends typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventList {
    /**
      * Create a EventList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object EventList extends js.Object {
    
    /**
      * Get an existing EventList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
    
    /**
      * Returns true if the given object is an instance of EventList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventList.EventList */ Boolean = js.native
  }
}
