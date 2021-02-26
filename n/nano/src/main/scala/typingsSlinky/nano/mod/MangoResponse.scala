package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.IdRev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoResponse[D] extends StObject {
  
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  
  // Array of documents matching the search. In each matching document, the fields specified in
  // the fields part of the request body are listed, along with their values.
  var docs: js.Array[D with IdRev] = js.native
  
  // Basic execution statistics for a specific request.
  var execution_stats: js.UndefOr[MangoExecutionStats] = js.native
  
  // Execution warnings
  var warning: js.UndefOr[String] = js.native
}
object MangoResponse {
  
  @scala.inline
  def apply[D](docs: js.Array[D with IdRev]): MangoResponse[D] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoResponse[D]]
  }
  
  @scala.inline
  implicit class MangoResponseMutableBuilder[Self <: MangoResponse[_], D] (val x: Self with MangoResponse[D]) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    @scala.inline
    def setDocs(value: js.Array[D with IdRev]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: (D with IdRev)*): Self = StObject.set(x, "docs", js.Array(value :_*))
    
    @scala.inline
    def setExecution_stats(value: MangoExecutionStats): Self = StObject.set(x, "execution_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_statsUndefined: Self = StObject.set(x, "execution_stats", js.undefined)
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
