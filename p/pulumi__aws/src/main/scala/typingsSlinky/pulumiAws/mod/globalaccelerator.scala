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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalaccelerator {
  
  @JSImport("@pulumi/aws", "globalaccelerator.Accelerator")
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Accelerator {
    
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: AcceleratorState): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.acceleratorMod.Accelerator = js.native
    
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.Accelerator.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup")
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
  /* static members */
  object EndpointGroup {
    
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.EndpointGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "globalaccelerator.Listener")
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
  object Listener {
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "globalaccelerator.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "globalaccelerator.Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
  }
}
