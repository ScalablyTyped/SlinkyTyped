package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.mediastoreContainerMod.ContainerArgs
import typingsSlinky.atPulumiAws.mediastoreContainerMod.ContainerState
import typingsSlinky.atPulumiAws.mediastoreContainerPolicyMod.ContainerPolicyArgs
import typingsSlinky.atPulumiAws.mediastoreContainerPolicyMod.ContainerPolicyState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "mediastore")
@js.native
object mediastore extends js.Object {
  @js.native
  class Container protected ()
    extends typingsSlinky.atPulumiAws.mediastoreMod.Container {
    /**
      * Create a Container resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ContainerArgs) = this()
    def this(name: String, args: ContainerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ContainerPolicy protected ()
    extends typingsSlinky.atPulumiAws.mediastoreMod.ContainerPolicy {
    /**
      * Create a ContainerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ContainerPolicyArgs) = this()
    def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Container extends js.Object {
    /**
      * Get an existing Container resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.mediastoreContainerMod.Container = js.native
    def get(name: String, id: Input[ID], state: ContainerState): typingsSlinky.atPulumiAws.mediastoreContainerMod.Container = js.native
    def get(name: String, id: Input[ID], state: ContainerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.mediastoreContainerMod.Container = js.native
    /**
      * Returns true if the given object is an instance of Container.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/container.Container */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ContainerPolicy extends js.Object {
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.mediastoreContainerPolicyMod.ContainerPolicy = js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState): typingsSlinky.atPulumiAws.mediastoreContainerPolicyMod.ContainerPolicy = js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.mediastoreContainerPolicyMod.ContainerPolicy = js.native
    /**
      * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
  }
  
}

