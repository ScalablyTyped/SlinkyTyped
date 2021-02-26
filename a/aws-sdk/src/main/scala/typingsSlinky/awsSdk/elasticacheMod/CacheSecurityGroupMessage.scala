package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecurityGroupMessage extends StObject {
  
  /**
    * A list of cache security groups. Each element in the list contains detailed information about one group.
    */
  var CacheSecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheSecurityGroups] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CacheSecurityGroupMessage {
  
  @scala.inline
  def apply(): CacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class CacheSecurityGroupMessageMutableBuilder[Self <: CacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroups(value: CacheSecurityGroups): Self = StObject.set(x, "CacheSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupsUndefined: Self = StObject.set(x, "CacheSecurityGroups", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupsVarargs(value: CacheSecurityGroup*): Self = StObject.set(x, "CacheSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
