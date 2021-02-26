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

object peeringAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment")
  @js.native
  class PeeringAttachment protected () extends CustomResource {
    /**
      * Create a PeeringAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringAttachmentArgs) = this()
    def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: Output_[String] = js.native
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: Output_[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState): PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): PeeringAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = js.native
  }
  
  @js.native
  trait PeeringAttachmentArgs extends StObject {
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: Input[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: Input[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Input[String] = js.native
  }
  object PeeringAttachmentArgs {
    
    @scala.inline
    def apply(peerRegion: Input[String], peerTransitGatewayId: Input[String], transitGatewayId: Input[String]): PeeringAttachmentArgs = {
      val __obj = js.Dynamic.literal(peerRegion = peerRegion.asInstanceOf[js.Any], peerTransitGatewayId = peerTransitGatewayId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeeringAttachmentArgs]
    }
    
    @scala.inline
    implicit class PeeringAttachmentArgsMutableBuilder[Self <: PeeringAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerAccountId(value: Input[String]): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAccountIdUndefined: Self = StObject.set(x, "peerAccountId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerTransitGatewayId(value: Input[String]): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeeringAttachmentState extends StObject {
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object PeeringAttachmentState {
    
    @scala.inline
    def apply(): PeeringAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeeringAttachmentState]
    }
    
    @scala.inline
    implicit class PeeringAttachmentStateMutableBuilder[Self <: PeeringAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerAccountId(value: Input[String]): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAccountIdUndefined: Self = StObject.set(x, "peerAccountId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      @scala.inline
      def setPeerTransitGatewayId(value: Input[String]): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerTransitGatewayIdUndefined: Self = StObject.set(x, "peerTransitGatewayId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
