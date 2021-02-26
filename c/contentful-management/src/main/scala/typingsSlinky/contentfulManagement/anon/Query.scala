package typingsSlinky.contentfulManagement.anon

import typingsSlinky.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  var query: js.UndefOr[QueryOptions] = js.native
  
  var teamId: js.UndefOr[String] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: QueryOptions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
