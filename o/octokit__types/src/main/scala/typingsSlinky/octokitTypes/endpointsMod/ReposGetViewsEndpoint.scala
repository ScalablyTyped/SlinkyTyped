package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.day
import typingsSlinky.octokitTypes.octokitTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetViewsEndpoint extends StObject {
  
  var owner: String = js.native
  
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[day | week] = js.native
  
  var repo: String = js.native
}
object ReposGetViewsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetViewsEndpointMutableBuilder[Self <: ReposGetViewsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer(value: day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
