package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2transitgateway.GetTransitGatewayFilter
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTransitGatewayMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getTransitGateway", "getTransitGateway")
  @js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getTransitGateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getTransitGateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getTransitGateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  
  @js.native
  trait GetTransitGatewayArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.native
    
    /**
      * Identifier of the EC2 Transit Gateway.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetTransitGatewayArgs {
    
    @scala.inline
    def apply(): GetTransitGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTransitGatewayArgs]
    }
    
    @scala.inline
    implicit class GetTransitGatewayArgsMutableBuilder[Self <: GetTransitGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetTransitGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetTransitGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetTransitGatewayResult extends StObject {
    
    /**
      * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
      */
    val amazonSideAsn: Double = js.native
    
    /**
      * EC2 Transit Gateway Amazon Resource Name (ARN)
      */
    val arn: String = js.native
    
    /**
      * Identifier of the default association route table
      */
    val associationDefaultRouteTableId: String = js.native
    
    /**
      * Whether resource attachment requests are automatically accepted.
      */
    val autoAcceptSharedAttachments: String = js.native
    
    /**
      * Whether resource attachments are automatically associated with the default association route table.
      */
    val defaultRouteTableAssociation: String = js.native
    
    /**
      * Whether resource attachments automatically propagate routes to the default propagation route table.
      */
    val defaultRouteTablePropagation: String = js.native
    
    /**
      * Description of the EC2 Transit Gateway
      */
    val description: String = js.native
    
    /**
      * Whether DNS support is enabled.
      */
    val dnsSupport: String = js.native
    
    val filters: js.UndefOr[
        js.Array[typingsSlinky.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter]
      ] = js.native
    
    /**
      * EC2 Transit Gateway identifier
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the AWS account that owns the EC2 Transit Gateway
      */
    val ownerId: String = js.native
    
    /**
      * Identifier of the default propagation route table.
      */
    val propagationDefaultRouteTableId: String = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Whether VPN Equal Cost Multipath Protocol support is enabled.
      */
    val vpnEcmpSupport: String = js.native
  }
  object GetTransitGatewayResult {
    
    @scala.inline
    def apply(
      amazonSideAsn: Double,
      arn: String,
      associationDefaultRouteTableId: String,
      autoAcceptSharedAttachments: String,
      defaultRouteTableAssociation: String,
      defaultRouteTablePropagation: String,
      description: String,
      dnsSupport: String,
      ownerId: String,
      propagationDefaultRouteTableId: String,
      tags: StringDictionary[String],
      vpnEcmpSupport: String
    ): GetTransitGatewayResult = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associationDefaultRouteTableId = associationDefaultRouteTableId.asInstanceOf[js.Any], autoAcceptSharedAttachments = autoAcceptSharedAttachments.asInstanceOf[js.Any], defaultRouteTableAssociation = defaultRouteTableAssociation.asInstanceOf[js.Any], defaultRouteTablePropagation = defaultRouteTablePropagation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], propagationDefaultRouteTableId = propagationDefaultRouteTableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpnEcmpSupport = vpnEcmpSupport.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTransitGatewayResult]
    }
    
    @scala.inline
    implicit class GetTransitGatewayResultMutableBuilder[Self <: GetTransitGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: Double): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationDefaultRouteTableId(value: String): Self = StObject.set(x, "associationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptSharedAttachments(value: String): Self = StObject.set(x, "autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteTableAssociation(value: String): Self = StObject.set(x, "defaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteTablePropagation(value: String): Self = StObject.set(x, "defaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSupport(value: String): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagationDefaultRouteTableId(value: String): Self = StObject.set(x, "propagationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnEcmpSupport(value: String): Self = StObject.set(x, "vpnEcmpSupport", value.asInstanceOf[js.Any])
    }
  }
}
