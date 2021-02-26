package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bgpPeerMod {
  
  @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
  @js.native
  class BgpPeer protected () extends CustomResource {
    /**
      * Create a BgpPeer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BgpPeerArgs) = this()
    def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val amazonAddress: Output_[String] = js.native
    
    /**
      * The Direct Connect endpoint on which the BGP peer terminates.
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
      * The ID of the BGP peer.
      */
    val bgpPeerId: Output_[String] = js.native
    
    /**
      * The Up/Down state of the BGP peer.
      */
    val bgpStatus: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID]): BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: BgpPeerState): BgpPeer = js.native
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer.get")
    @js.native
    def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): BgpPeer = js.native
    
    /**
      * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = js.native
  }
  
  @js.native
  trait BgpPeerArgs extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Input[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
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
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: Input[String] = js.native
  }
  object BgpPeerArgs {
    
    @scala.inline
    def apply(addressFamily: Input[String], bgpAsn: Input[Double], virtualInterfaceId: Input[String]): BgpPeerArgs = {
      val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BgpPeerArgs]
    }
    
    @scala.inline
    implicit class BgpPeerArgsMutableBuilder[Self <: BgpPeerArgs] (val x: Self) extends AnyVal {
      
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
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BgpPeerState extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Direct Connect endpoint on which the BGP peer terminates.
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
      * The ID of the BGP peer.
      */
    val bgpPeerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Up/Down state of the BGP peer.
      */
    val bgpStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: js.UndefOr[Input[String]] = js.native
  }
  object BgpPeerState {
    
    @scala.inline
    def apply(): BgpPeerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BgpPeerState]
    }
    
    @scala.inline
    implicit class BgpPeerStateMutableBuilder[Self <: BgpPeerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
      
      @scala.inline
      def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
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
      def setBgpPeerId(value: Input[String]): Self = StObject.set(x, "bgpPeerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpPeerIdUndefined: Self = StObject.set(x, "bgpPeerId", js.undefined)
      
      @scala.inline
      def setBgpStatus(value: Input[String]): Self = StObject.set(x, "bgpStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpStatusUndefined: Self = StObject.set(x, "bgpStatus", js.undefined)
      
      @scala.inline
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    }
  }
}
