package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVpcConfigResponseMod {
  
  @js.native
  trait UnmarshalledVpcConfigResponse extends VpcConfigResponse {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    @JSName("SecurityGroupIds")
    var SecurityGroupIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    @JSName("SubnetIds")
    var SubnetIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledVpcConfigResponse {
    
    @scala.inline
    def apply(): UnmarshalledVpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledVpcConfigResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledVpcConfigResponseMutableBuilder[Self <: UnmarshalledVpcConfigResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait VpcConfigResponse extends StObject {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    var SecurityGroupIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    var SubnetIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>The ID of the VPC.</p>
      */
    var VpcId: js.UndefOr[String] = js.native
  }
  object VpcConfigResponse {
    
    @scala.inline
    def apply(): VpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcConfigResponse]
    }
    
    @scala.inline
    implicit class VpcConfigResponseMutableBuilder[Self <: VpcConfigResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsIterable(value: js.Iterable[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsIterable(value: js.Iterable[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    }
  }
}
