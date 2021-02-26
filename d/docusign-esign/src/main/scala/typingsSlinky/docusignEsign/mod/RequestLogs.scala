package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLogs extends StObject {
  
  /**
    * Specifies the maximum number of API requests to log.
    */
  var apiRequestLogMaxEntries: js.UndefOr[String] = js.native
  
  /**
    * Indicates the remaining number of API requests that can be logged.
    */
  var apiRequestLogRemainingEntries: js.UndefOr[String] = js.native
  
  /**
    *  When set to **true**, enables API request logging for the user.
    */
  var apiRequestLogging: js.UndefOr[String] = js.native
}
object RequestLogs {
  
  @scala.inline
  def apply(): RequestLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLogs]
  }
  
  @scala.inline
  implicit class RequestLogsMutableBuilder[Self <: RequestLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiRequestLogMaxEntries(value: String): Self = StObject.set(x, "apiRequestLogMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLogMaxEntriesUndefined: Self = StObject.set(x, "apiRequestLogMaxEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogRemainingEntries(value: String): Self = StObject.set(x, "apiRequestLogRemainingEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLogRemainingEntriesUndefined: Self = StObject.set(x, "apiRequestLogRemainingEntries", js.undefined)
    
    @scala.inline
    def setApiRequestLogging(value: String): Self = StObject.set(x, "apiRequestLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestLoggingUndefined: Self = StObject.set(x, "apiRequestLogging", js.undefined)
  }
}
