package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worklink {
  
  @js.native
  trait FleetIdentityProvider extends StObject {
    
    /**
      * The SAML metadata document provided by the customer’s identity provider.
      */
    var samlMetadata: String = js.native
    
    /**
      * The type of identity provider.
      */
    var `type`: String = js.native
  }
  object FleetIdentityProvider {
    
    @scala.inline
    def apply(samlMetadata: String, `type`: String): FleetIdentityProvider = {
      val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetIdentityProvider]
    }
    
    @scala.inline
    implicit class FleetIdentityProviderMutableBuilder[Self <: FleetIdentityProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSamlMetadata(value: String): Self = StObject.set(x, "samlMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FleetNetwork extends StObject {
    
    /**
      * A list of security group IDs associated with access to the provided subnets.
      */
    var securityGroupIds: js.Array[String] = js.native
    
    /**
      * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
      */
    var subnetIds: js.Array[String] = js.native
    
    /**
      * The VPC ID with connectivity to associated websites.
      */
    var vpcId: String = js.native
  }
  object FleetNetwork {
    
    @scala.inline
    def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FleetNetwork = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetNetwork]
    }
    
    @scala.inline
    implicit class FleetNetworkMutableBuilder[Self <: FleetNetwork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
