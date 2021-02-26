package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.bgpPeerMod.BgpPeerArgs
import typingsSlinky.pulumiAws.bgpPeerMod.BgpPeerState
import typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociationArgs
import typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociationState
import typingsSlinky.pulumiAws.connectionMod.ConnectionArgs
import typingsSlinky.pulumiAws.connectionMod.ConnectionState
import typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociationArgs
import typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociationState
import typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposalArgs
import typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposalState
import typingsSlinky.pulumiAws.gatewayMod.GatewayArgs
import typingsSlinky.pulumiAws.gatewayMod.GatewayState
import typingsSlinky.pulumiAws.getGatewayMod.GetGatewayArgs
import typingsSlinky.pulumiAws.getGatewayMod.GetGatewayResult
import typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs
import typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState
import typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs
import typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
import typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs
import typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
import typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceArgs
import typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState
import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorArgs
import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorState
import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceArgs
import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceState
import typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroupArgs
import typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroupState
import typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterfaceArgs
import typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterfaceState
import typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceArgs
import typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceState
import typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceArgs
import typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directconnectMod {
  
  @JSImport("@pulumi/aws/directconnect", "BgpPeer")
  @js.native
  class BgpPeer protected ()
    extends typingsSlinky.pulumiAws.bgpPeerMod.BgpPeer {
    /**
      * Create a BgpPeer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BgpPeerArgs) = this()
    def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BgpPeer {
    
    /**
      * Get an existing BgpPeer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.bgpPeerMod.BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.bgpPeerMod.BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: BgpPeerState): typingsSlinky.pulumiAws.bgpPeerMod.BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.bgpPeerMod.BgpPeer = js.native
    
    /**
      * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "BgpPeer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "Connection")
  @js.native
  class Connection protected ()
    extends typingsSlinky.pulumiAws.connectionMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Connection {
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.connectionMod.Connection = js.native
    @JSImport("@pulumi/aws/directconnect", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.connectionMod.Connection = js.native
    @JSImport("@pulumi/aws/directconnect", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typingsSlinky.pulumiAws.connectionMod.Connection = js.native
    @JSImport("@pulumi/aws/directconnect", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.connectionMod.Connection = js.native
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "Connection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation")
  @js.native
  class ConnectionAssociation protected ()
    extends typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociation {
    /**
      * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionAssociationArgs) = this()
    def this(name: String, args: ConnectionAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConnectionAssociation {
    
    /**
      * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionAssociationState): typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.connectionAssociationMod.ConnectionAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ConnectionAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "Gateway")
  @js.native
  class Gateway protected ()
    extends typingsSlinky.pulumiAws.gatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Gateway {
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/directconnect", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/directconnect", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/directconnect", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "Gateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "GatewayAssociation")
  @js.native
  class GatewayAssociation protected ()
    extends typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociation {
    /**
      * Create a GatewayAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationArgs) = this()
    def this(name: String, args: GatewayAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GatewayAssociation {
    
    /**
      * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState): typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal")
  @js.native
  class GatewayAssociationProposal protected ()
    extends typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal {
    /**
      * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationProposalArgs) = this()
    def this(name: String, args: GatewayAssociationProposalArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GatewayAssociationProposal {
    
    /**
      * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface")
  @js.native
  class HostedPrivateVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface {
    /**
      * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPrivateVirtualInterface {
    
    /**
      * Get an existing HostedPrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceState): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter")
  @js.native
  class HostedPrivateVirtualInterfaceAccepter protected ()
    extends typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter {
    /**
      * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPrivateVirtualInterfaceAccepter {
    
    /**
      * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface")
  @js.native
  class HostedPublicVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface {
    /**
      * Create a HostedPublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPublicVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedPublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPublicVirtualInterface {
    
    /**
      * Get an existing HostedPublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterface.HostedPublicVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter")
  @js.native
  class HostedPublicVirtualInterfaceAccepter protected ()
    extends typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter {
    /**
      * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPublicVirtualInterfaceAccepter {
    
    /**
      * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceAccepterState): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPublicVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface")
  @js.native
  class HostedTransitVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface {
    /**
      * Create a HostedTransitVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedTransitVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedTransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedTransitVirtualInterface {
    
    /**
      * Get an existing HostedTransitVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceState): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor")
  @js.native
  class HostedTransitVirtualInterfaceAcceptor protected ()
    extends typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor {
    /**
      * Create a HostedTransitVirtualInterfaceAcceptor resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs) = this()
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedTransitVirtualInterfaceAcceptor {
    
    /**
      * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceAcceptorState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup")
  @js.native
  class LinkAggregationGroup protected ()
    extends typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup {
    /**
      * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LinkAggregationGroupArgs) = this()
    def this(name: String, args: LinkAggregationGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LinkAggregationGroup {
    
    /**
      * Get an existing LinkAggregationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = js.native
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = js.native
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState): typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = js.native
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = js.native
    
    /**
      * Returns true if the given object is an instance of LinkAggregationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface")
  @js.native
  class PrivateVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface {
    /**
      * Create a PrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrivateVirtualInterfaceArgs) = this()
    def this(name: String, args: PrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PrivateVirtualInterface {
    
    /**
      * Get an existing PrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState): typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of PrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/privateVirtualInterface.PrivateVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface")
  @js.native
  class PublicVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface {
    /**
      * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicVirtualInterfaceArgs) = this()
    def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublicVirtualInterface {
    
    /**
      * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface")
  @js.native
  class TransitVirtualInterface protected ()
    extends typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface {
    /**
      * Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TransitVirtualInterfaceArgs) = this()
    def this(name: String, args: TransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TransitVirtualInterface {
    
    /**
      * Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/directconnect", "getGateway")
  @js.native
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] = js.native
  @JSImport("@pulumi/aws/directconnect", "getGateway")
  @js.native
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] = js.native
}
