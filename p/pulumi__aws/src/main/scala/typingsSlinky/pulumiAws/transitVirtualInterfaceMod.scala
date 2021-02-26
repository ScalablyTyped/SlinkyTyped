package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitVirtualInterfaceMod {
  
  @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface")
  @js.native
  class TransitVirtualInterface protected () extends CustomResource {
    /**
      * Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TransitVirtualInterfaceArgs) = this()
    def this(name: String, args: TransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
      */
    val amazonAddress: Output_[String] = js.native
    
    val amazonSideAsn: Output_[String] = js.native
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Direct Connect endpoint on which the virtual interface terminates.
      */
    val awsDevice: Output_[String] = js.native
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: Output_[Double] = js.native
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Output_[String] = js.native
    
    /**
      * Indicates whether jumbo frames (8500 MTU) are supported.
      */
    val jumboFrameCapable: Output_[Boolean] = js.native
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
      * The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
      */
    val mtu: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name for the virtual interface.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VLAN ID.
      */
    val vlan: Output_[Double] = js.native
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
    @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID]): TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): TransitVirtualInterface = js.native
    @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): TransitVirtualInterface = js.native
    
    /**
      * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = js.native
  }
  
  @js.native
  trait TransitVirtualInterfaceArgs extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Input[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: Input[Double] = js.native
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: Input[String] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: Input[String] = js.native
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
      * The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
      */
    val mtu: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VLAN ID.
      */
    val vlan: Input[Double] = js.native
  }
  object TransitVirtualInterfaceArgs {
    
    @scala.inline
    def apply(
      addressFamily: Input[String],
      bgpAsn: Input[Double],
      connectionId: Input[String],
      dxGatewayId: Input[String],
      vlan: Input[Double]
    ): TransitVirtualInterfaceArgs = {
      val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], dxGatewayId = dxGatewayId.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitVirtualInterfaceArgs]
    }
    
    @scala.inline
    implicit class TransitVirtualInterfaceArgsMutableBuilder[Self <: TransitVirtualInterfaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      @scala.inline
      def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtu(value: Input[Double]): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitVirtualInterfaceState extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.native
    
    val amazonSideAsn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Direct Connect endpoint on which the virtual interface terminates.
      */
    val awsDevice: js.UndefOr[Input[String]] = js.native
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway to which to connect the virtual interface.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether jumbo frames (8500 MTU) are supported.
      */
    val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
      * The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
      */
    val mtu: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VLAN ID.
      */
    val vlan: js.UndefOr[Input[Double]] = js.native
  }
  object TransitVirtualInterfaceState {
    
    @scala.inline
    def apply(): TransitVirtualInterfaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitVirtualInterfaceState]
    }
    
    @scala.inline
    implicit class TransitVirtualInterfaceStateMutableBuilder[Self <: TransitVirtualInterfaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
      
      @scala.inline
      def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAwsDevice(value: Input[String]): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
      
      @scala.inline
      def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAsnUndefined: Self = StObject.set(x, "bgpAsn", js.undefined)
      
      @scala.inline
      def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setJumboFrameCapable(value: Input[Boolean]): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
      
      @scala.inline
      def setMtu(value: Input[Double]): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
    }
  }
}
