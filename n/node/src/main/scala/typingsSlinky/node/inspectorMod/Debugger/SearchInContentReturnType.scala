package typingsSlinky.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInContentReturnType extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch] = js.native
}
object SearchInContentReturnType {
  
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInContentReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInContentReturnType]
  }
  
  @scala.inline
  implicit class SearchInContentReturnTypeMutableBuilder[Self <: SearchInContentReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
