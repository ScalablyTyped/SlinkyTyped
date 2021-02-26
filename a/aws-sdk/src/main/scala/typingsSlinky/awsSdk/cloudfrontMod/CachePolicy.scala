package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicy extends StObject {
  
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: typingsSlinky.awsSdk.cloudfrontMod.CachePolicyConfig = js.native
  
  /**
    * The unique identifier for the cache policy.
    */
  var Id: String = js.native
  
  /**
    * The date and time when the cache policy was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}
object CachePolicy {
  
  @scala.inline
  def apply(CachePolicyConfig: CachePolicyConfig, Id: String, LastModifiedTime: js.Date): CachePolicy = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicy]
  }
  
  @scala.inline
  implicit class CachePolicyMutableBuilder[Self <: CachePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
