package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.RouteArgs
import typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.RouteState
import typingsSlinky.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typingsSlinky.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typingsSlinky.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentArgs
import typingsSlinky.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentResult
import typingsSlinky.pulumiAws.getRouteTableMod.GetRouteTableArgs
import typingsSlinky.pulumiAws.getRouteTableMod.GetRouteTableResult
import typingsSlinky.pulumiAws.getTransitGatewayMod.GetTransitGatewayArgs
import typingsSlinky.pulumiAws.getTransitGatewayMod.GetTransitGatewayResult
import typingsSlinky.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentArgs
import typingsSlinky.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentResult
import typingsSlinky.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentArgs
import typingsSlinky.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentResult
import typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachmentArgs
import typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachmentState
import typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociationArgs
import typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociationState
import typingsSlinky.pulumiAws.routeTableMod.RouteTableArgs
import typingsSlinky.pulumiAws.routeTableMod.RouteTableState
import typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagationArgs
import typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagationState
import typingsSlinky.pulumiAws.transitGatewayMod.TransitGatewayArgs
import typingsSlinky.pulumiAws.transitGatewayMod.TransitGatewayState
import typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterArgs
import typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterState
import typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachmentArgs
import typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachmentState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2transitgatewayMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment")
  @js.native
  class PeeringAttachment protected ()
    extends typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachment {
    /**
      * Create a PeeringAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringAttachmentArgs) = this()
    def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PeeringAttachment {
    
    /**
      * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState): typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "Route")
  @js.native
  class Route protected ()
    extends typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Route {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable")
  @js.native
  class RouteTable protected ()
    extends typingsSlinky.pulumiAws.routeTableMod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RouteTable {
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState): typingsSlinky.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTableMod.RouteTable = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation")
  @js.native
  class RouteTableAssociation protected ()
    extends typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableAssociationArgs) = this()
    def this(name: String, args: RouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RouteTableAssociation {
    
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation")
  @js.native
  class RouteTablePropagation protected ()
    extends typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagation {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTablePropagationArgs) = this()
    def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RouteTablePropagation {
    
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway")
  @js.native
  class TransitGateway protected ()
    extends typingsSlinky.pulumiAws.transitGatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TransitGateway {
    
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState): typingsSlinky.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.transitGatewayMod.TransitGateway = js.native
    
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment")
  @js.native
  class VpcAttachment protected ()
    extends typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachment {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentArgs) = this()
    def this(name: String, args: VpcAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VpcAttachment {
    
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter")
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter {
    /**
      * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentAccepterArgs) = this()
    def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VpcAttachmentAccepter {
    
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
}
