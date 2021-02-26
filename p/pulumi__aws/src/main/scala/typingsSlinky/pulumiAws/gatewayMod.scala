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

object gatewayMod {
  
  @JSImport("@pulumi/aws/directconnect/gateway", "Gateway")
  @js.native
  class Gateway protected () extends CustomResource {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: Output_[String] = js.native
    
    /**
      * The name of the connection.
      */
    val name: Output_[String] = js.native
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID]): Gateway = js.native
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Gateway = js.native
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState): Gateway = js.native
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/gateway", "Gateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = js.native
  }
  
  @js.native
  trait GatewayArgs extends StObject {
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: Input[String] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object GatewayArgs {
    
    @scala.inline
    def apply(amazonSideAsn: Input[String]): GatewayArgs = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayArgs]
    }
    
    @scala.inline
    implicit class GatewayArgsMutableBuilder[Self <: GatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GatewayState extends StObject {
    
    /**
      * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
      */
    val amazonSideAsn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: js.UndefOr[Input[String]] = js.native
  }
  object GatewayState {
    
    @scala.inline
    def apply(): GatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayState]
    }
    
    @scala.inline
    implicit class GatewayStateMutableBuilder[Self <: GatewayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerAccountId(value: Input[String]): Self = StObject.set(x, "ownerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAccountIdUndefined: Self = StObject.set(x, "ownerAccountId", js.undefined)
    }
  }
}
