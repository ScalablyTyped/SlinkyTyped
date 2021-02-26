package typingsSlinky.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRestrictionsForRepo extends StObject {
  
  var getRestrictionsForOrg: `712` = js.native
  
  var getRestrictionsForRepo: `713` = js.native
  
  var removeRestrictionsForOrg: `714` = js.native
  
  var removeRestrictionsForRepo: `715` = js.native
  
  var setRestrictionsForOrg: `716` = js.native
  
  var setRestrictionsForRepo: `717` = js.native
}
object GetRestrictionsForRepo {
  
  @scala.inline
  def apply(
    getRestrictionsForOrg: `712`,
    getRestrictionsForRepo: `713`,
    removeRestrictionsForOrg: `714`,
    removeRestrictionsForRepo: `715`,
    setRestrictionsForOrg: `716`,
    setRestrictionsForRepo: `717`
  ): GetRestrictionsForRepo = {
    val __obj = js.Dynamic.literal(getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForRepo]
  }
  
  @scala.inline
  implicit class GetRestrictionsForRepoMutableBuilder[Self <: GetRestrictionsForRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRestrictionsForOrg(value: `712`): Self = StObject.set(x, "getRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRestrictionsForRepo(value: `713`): Self = StObject.set(x, "getRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForOrg(value: `714`): Self = StObject.set(x, "removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForRepo(value: `715`): Self = StObject.set(x, "removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForOrg(value: `716`): Self = StObject.set(x, "setRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForRepo(value: `717`): Self = StObject.set(x, "setRestrictionsForRepo", value.asInstanceOf[js.Any])
  }
}
