package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheParameterGroupResult extends StObject {
  
  var CacheParameterGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheParameterGroup] = js.native
}
object CreateCacheParameterGroupResult {
  
  @scala.inline
  def apply(): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateCacheParameterGroupResultMutableBuilder[Self <: CreateCacheParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroup(value: CacheParameterGroup): Self = StObject.set(x, "CacheParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupUndefined: Self = StObject.set(x, "CacheParameterGroup", js.undefined)
  }
}
