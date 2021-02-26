package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInfo extends StObject {
  
  /** Maximum number of results returned in one page. ! The number of results included in the API response. */
  var resultPerPage: js.UndefOr[Double] = js.native
  
  /** Index of the first result returned in the current page. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** Total number of results available on the backend ! The total number of results in the result set. */
  var totalResults: js.UndefOr[Double] = js.native
}
object PageInfo {
  
  @scala.inline
  def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
