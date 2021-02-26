package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetVpcEndpointFilter
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointDnsEntry
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcEndpointMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcEndpoint", "getVpcEndpoint")
  @js.native
  def getVpcEndpoint(): js.Promise[GetVpcEndpointResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpoint", "getVpcEndpoint")
  @js.native
  def getVpcEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcEndpointResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpoint", "getVpcEndpoint")
  @js.native
  def getVpcEndpoint(args: GetVpcEndpointArgs): js.Promise[GetVpcEndpointResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpoint", "getVpcEndpoint")
  @js.native
  def getVpcEndpoint(args: GetVpcEndpointArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointResult] = js.native
  
  @js.native
  trait GetVpcEndpointArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcEndpointFilter]] = js.native
    
    /**
      * The ID of the specific VPC Endpoint to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: js.UndefOr[String] = js.native
    
    /**
      * The state of the specific VPC Endpoint to retrieve.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the specific VPC Endpoint to retrieve.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The ID of the VPC in which the specific VPC Endpoint is used.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetVpcEndpointArgs {
    
    @scala.inline
    def apply(): GetVpcEndpointArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcEndpointArgs]
    }
    
    @scala.inline
    implicit class GetVpcEndpointArgsMutableBuilder[Self <: GetVpcEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcEndpointFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcEndpointFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcEndpointResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint.
      */
    val arn: String = js.native
    
    /**
      * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val cidrBlocks: js.Array[String] = js.native
    
    /**
      * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
      */
    val dnsEntries: js.Array[GetVpcEndpointDnsEntry] = js.native
    
    val filters: js.UndefOr[js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointFilter]] = js.native
    
    val id: String = js.native
    
    /**
      * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
      */
    val networkInterfaceIds: js.Array[String] = js.native
    
    /**
      * The ID of the AWS account that owns the VPC endpoint.
      */
    val ownerId: String = js.native
    
    /**
      * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
      */
    val policy: String = js.native
    
    /**
      * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val prefixListId: String = js.native
    
    /**
      * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
      */
    val privateDnsEnabled: Boolean = js.native
    
    /**
      * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
      */
    val requesterManaged: Boolean = js.native
    
    /**
      * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
      */
    val routeTableIds: js.Array[String] = js.native
    
    /**
      * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
      */
    val securityGroupIds: js.Array[String] = js.native
    
    val serviceName: String = js.native
    
    val state: String = js.native
    
    /**
      * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
      */
    val subnetIds: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
    
    /**
      * The VPC Endpoint type, `Gateway` or `Interface`.
      */
    val vpcEndpointType: String = js.native
    
    val vpcId: String = js.native
  }
  object GetVpcEndpointResult {
    
    @scala.inline
    def apply(
      arn: String,
      cidrBlocks: js.Array[String],
      dnsEntries: js.Array[GetVpcEndpointDnsEntry],
      id: String,
      networkInterfaceIds: js.Array[String],
      ownerId: String,
      policy: String,
      prefixListId: String,
      privateDnsEnabled: Boolean,
      requesterManaged: Boolean,
      routeTableIds: js.Array[String],
      securityGroupIds: js.Array[String],
      serviceName: String,
      state: String,
      subnetIds: js.Array[String],
      tags: StringDictionary[String],
      vpcEndpointType: String,
      vpcId: String
    ): GetVpcEndpointResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlocks = cidrBlocks.asInstanceOf[js.Any], dnsEntries = dnsEntries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceIds = networkInterfaceIds.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], prefixListId = prefixListId.asInstanceOf[js.Any], privateDnsEnabled = privateDnsEnabled.asInstanceOf[js.Any], requesterManaged = requesterManaged.asInstanceOf[js.Any], routeTableIds = routeTableIds.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointType = vpcEndpointType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcEndpointResult]
    }
    
    @scala.inline
    implicit class GetVpcEndpointResultMutableBuilder[Self <: GetVpcEndpointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setDnsEntries(value: js.Array[GetVpcEndpointDnsEntry]): Self = StObject.set(x, "dnsEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsEntriesVarargs(value: GetVpcEndpointDnsEntry*): Self = StObject.set(x, "dnsEntries", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIds(value: js.Array[String]): Self = StObject.set(x, "networkInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "networkInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListId(value: String): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsEnabled(value: Boolean): Self = StObject.set(x, "privateDnsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterManaged(value: Boolean): Self = StObject.set(x, "requesterManaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIds(value: js.Array[String]): Self = StObject.set(x, "routeTableIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdsVarargs(value: String*): Self = StObject.set(x, "routeTableIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointType(value: String): Self = StObject.set(x, "vpcEndpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
