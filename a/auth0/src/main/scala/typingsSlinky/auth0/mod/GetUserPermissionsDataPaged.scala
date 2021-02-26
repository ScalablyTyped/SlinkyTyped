package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserPermissionsDataPaged extends GetUserPermissionsData {
  
  var include_totals: Boolean = js.native
}
object GetUserPermissionsDataPaged {
  
  @scala.inline
  def apply(id: String, include_totals: Boolean): GetUserPermissionsDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPermissionsDataPaged]
  }
  
  @scala.inline
  implicit class GetUserPermissionsDataPagedMutableBuilder[Self <: GetUserPermissionsDataPaged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
