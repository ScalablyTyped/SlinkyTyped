package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.acceleratorMod.AcceleratorArgs
import typingsSlinky.pulumiAws.acceleratorMod.AcceleratorState
import typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroupArgs
import typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroupState
import typingsSlinky.pulumiAws.globalacceleratorListenerMod.ListenerArgs
import typingsSlinky.pulumiAws.globalacceleratorListenerMod.ListenerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "globalaccelerator")
@js.native
object globalaccelerator extends js.Object {
  @js.native
  class Accelerator protected ()
    extends typingsSlinky.pulumiAws.globalacceleratorMod.Accelerator {
    /**
      * Create a Accelerator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AcceleratorArgs) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EndpointGroup protected ()
    extends typingsSlinky.pulumiAws.globalacceleratorMod.EndpointGroup {
    /**
      * Create a EndpointGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointGroupArgs) = this()
    def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Listener protected ()
    extends typingsSlinky.pulumiAws.globalacceleratorMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Accelerator extends js.Object {
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EndpointGroup extends js.Object {
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
  }
  
}

