package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeCacheSecurityGroupIngressResult extends StObject {
  
  var CacheSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}
object AuthorizeCacheSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): AuthorizeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class AuthorizeCacheSecurityGroupIngressResultMutableBuilder[Self <: AuthorizeCacheSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroup(value: CacheSecurityGroup): Self = StObject.set(x, "CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupUndefined: Self = StObject.set(x, "CacheSecurityGroup", js.undefined)
  }
}
