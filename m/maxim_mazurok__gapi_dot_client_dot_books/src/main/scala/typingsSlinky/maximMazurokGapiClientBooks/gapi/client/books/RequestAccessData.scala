package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAccessData extends StObject {
  
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.native
  
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object RequestAccessData {
  
  @scala.inline
  def apply(): RequestAccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAccessData]
  }
  
  @scala.inline
  implicit class RequestAccessDataMutableBuilder[Self <: RequestAccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrentAccess(value: ConcurrentAccessRestriction): Self = StObject.set(x, "concurrentAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentAccessUndefined: Self = StObject.set(x, "concurrentAccess", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: DownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
