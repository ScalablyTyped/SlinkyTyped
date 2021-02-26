package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.v1EventListMod.EventListArgs
import typingsSlinky.pulumiKubernetes.v1EventMod.EventArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes/events", "v1.Event")
    @js.native
    class Event protected ()
      extends typingsSlinky.pulumiKubernetes.eventsV1Mod.Event {
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
    object Event {
      
      /**
        * Get an existing Event resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/events", "v1.Event.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1EventMod.Event = js.native
      @JSImport("@pulumi/kubernetes/events", "v1.Event.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1EventMod.Event = js.native
      
      /**
        * Returns true if the given object is an instance of Event.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/events", "v1.Event.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1/event.Event */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/events", "v1.EventList")
    @js.native
    class EventList protected ()
      extends typingsSlinky.pulumiKubernetes.eventsV1Mod.EventList {
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
    object EventList {
      
      /**
        * Get an existing EventList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/events", "v1.EventList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1EventListMod.EventList = js.native
      @JSImport("@pulumi/kubernetes/events", "v1.EventList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1EventListMod.EventList = js.native
      
      /**
        * Returns true if the given object is an instance of EventList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/events", "v1.EventList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1/eventList.EventList */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes/events", "v1beta1.Event")
    @js.native
    class Event protected ()
      extends typingsSlinky.pulumiKubernetes.eventsV1beta1Mod.Event {
      /**
        * Create a Event resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.v1beta1EventMod.EventArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v1beta1EventMod.EventArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object Event {
      
      /**
        * Get an existing Event resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/events", "v1beta1.Event.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1EventMod.Event = js.native
      @JSImport("@pulumi/kubernetes/events", "v1beta1.Event.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1EventMod.Event = js.native
      
      /**
        * Returns true if the given object is an instance of Event.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/events", "v1beta1.Event.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/event.Event */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/events", "v1beta1.EventList")
    @js.native
    class EventList protected ()
      extends typingsSlinky.pulumiKubernetes.eventsV1beta1Mod.EventList {
      /**
        * Create a EventList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object EventList {
      
      /**
        * Get an existing EventList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/events", "v1beta1.EventList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
      @JSImport("@pulumi/kubernetes/events", "v1beta1.EventList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1EventListMod.EventList = js.native
      
      /**
        * Returns true if the given object is an instance of EventList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/events", "v1beta1.EventList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventList.EventList */ Boolean = js.native
    }
  }
}
