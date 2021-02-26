package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFilterViewResponse extends StObject {
  
  /** The newly added filter view. */
  var filter: js.UndefOr[FilterView] = js.native
}
object AddFilterViewResponse {
  
  @scala.inline
  def apply(): AddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFilterViewResponse]
  }
  
  @scala.inline
  implicit class AddFilterViewResponseMutableBuilder[Self <: AddFilterViewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
