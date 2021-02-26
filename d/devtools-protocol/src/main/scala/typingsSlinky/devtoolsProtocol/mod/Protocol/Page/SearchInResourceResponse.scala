package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SearchMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInResourceResponse extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch] = js.native
}
object SearchInResourceResponse {
  
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInResourceResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResourceResponse]
  }
  
  @scala.inline
  implicit class SearchInResourceResponseMutableBuilder[Self <: SearchInResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
