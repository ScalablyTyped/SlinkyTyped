package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getResourceShareMod.GetResourceShareArgs
import typingsSlinky.pulumiAws.getResourceShareMod.GetResourceShareResult
import typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociationArgs
import typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociationState
import typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociationArgs
import typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociationState
import typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterArgs
import typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterState
import typingsSlinky.pulumiAws.resourceShareMod.ResourceShareArgs
import typingsSlinky.pulumiAws.resourceShareMod.ResourceShareState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ram")
@js.native
object ram extends js.Object {
  @js.native
  class PrincipalAssociation protected ()
    extends typingsSlinky.pulumiAws.ramMod.PrincipalAssociation {
    /**
      * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrincipalAssociationArgs) = this()
    def this(name: String, args: PrincipalAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceAssociation protected ()
    extends typingsSlinky.pulumiAws.ramMod.ResourceAssociation {
    /**
      * Create a ResourceAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceAssociationArgs) = this()
    def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceShare protected ()
    extends typingsSlinky.pulumiAws.ramMod.ResourceShare {
    /**
      * Create a ResourceShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ResourceShareArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ResourceShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceShareAccepter protected ()
    extends typingsSlinky.pulumiAws.ramMod.ResourceShareAccepter {
    /**
      * Create a ResourceShareAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceShareAccepterArgs) = this()
    def this(name: String, args: ResourceShareAccepterArgs, opts: CustomResourceOptions) = this()
  }
  
  def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] = js.native
  def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] = js.native
  /* static members */
  @js.native
  object PrincipalAssociation extends js.Object {
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState): typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    /**
      * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceAssociation extends js.Object {
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState): typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceShare extends js.Object {
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceShareMod.ResourceShare = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceShareMod.ResourceShare = js.native
    def get(name: String, id: Input[ID], state: ResourceShareState): typingsSlinky.pulumiAws.resourceShareMod.ResourceShare = js.native
    def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceShareMod.ResourceShare = js.native
    /**
      * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceShareAccepter extends js.Object {
    /**
      * Get an existing ResourceShareAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState): typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    /**
      * Returns true if the given object is an instance of ResourceShareAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShareAccepter.ResourceShareAccepter */ Boolean = js.native
  }
  
}

