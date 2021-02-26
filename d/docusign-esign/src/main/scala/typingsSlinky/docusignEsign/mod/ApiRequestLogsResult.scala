package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiRequestLogsResult extends StObject {
  
  /**
    * Reserved: TBD
    */
  var apiRequestLogs: js.UndefOr[js.Array[/* Contains API request log information. */ ApiRequestLog]] = js.native
}
object ApiRequestLogsResult {
  
  @scala.inline
  def apply(): ApiRequestLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiRequestLogsResult]
  }
  
  @scala.inline
  implicit class ApiRequestLogsResultMutableBuilder[Self <: ApiRequestLogsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiRequestLogs(value: js.Array[/* Contains API request log information. */ ApiRequestLog]): Self = StObject.set(x, "apiRequestLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLogsUndefined: Self = StObject.set(x, "apiRequestLogs", js.undefined)
    
    @scala.inline
    def setApiRequestLogsVarargs(value: (/* Contains API request log information. */ ApiRequestLog)*): Self = StObject.set(x, "apiRequestLogs", js.Array(value :_*))
  }
}
