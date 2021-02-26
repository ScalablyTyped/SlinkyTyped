package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeCacheSecurityGroupIngressMessage extends StObject {
  
  /**
    * The name of the cache security group to revoke ingress from.
    */
  var CacheSecurityGroupName: String = js.native
  
  /**
    * The name of the Amazon EC2 security group to revoke access from.
    */
  var EC2SecurityGroupName: String = js.native
  
  /**
    * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
    */
  var EC2SecurityGroupOwnerId: String = js.native
}
object RevokeCacheSecurityGroupIngressMessage {
  
  @scala.inline
  def apply(CacheSecurityGroupName: String, EC2SecurityGroupName: String, EC2SecurityGroupOwnerId: String): RevokeCacheSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupName = EC2SecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit class RevokeCacheSecurityGroupIngressMessageMutableBuilder[Self <: RevokeCacheSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
  }
}
