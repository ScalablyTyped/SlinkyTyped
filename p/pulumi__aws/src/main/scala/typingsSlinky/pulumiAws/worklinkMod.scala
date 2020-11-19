package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationArgs
import typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationState
import typingsSlinky.pulumiAws.worklinkFleetMod.FleetArgs
import typingsSlinky.pulumiAws.worklinkFleetMod.FleetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/worklink", JSImport.Namespace)
@js.native
object worklinkMod extends js.Object {
  
  @js.native
  class Fleet protected ()
    extends typingsSlinky.pulumiAws.worklinkFleetMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Fleet extends js.Object {
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.worklinkFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.worklinkFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState): typingsSlinky.pulumiAws.worklinkFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.worklinkFleetMod.Fleet = js.native
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean = js.native
  }
  
  @js.native
  class WebsiteCertificateAuthorityAssociation protected ()
    extends typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation {
    /**
      * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs) = this()
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object WebsiteCertificateAuthorityAssociation extends js.Object {
    
    /**
      * Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(
      name: String,
      id: Input[ID],
      state: WebsiteCertificateAuthorityAssociationState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = js.native
  }
}
