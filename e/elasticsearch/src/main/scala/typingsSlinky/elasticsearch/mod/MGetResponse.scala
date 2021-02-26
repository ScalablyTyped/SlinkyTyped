package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MGetResponse[T] extends StObject {
  
  var docs: js.UndefOr[js.Array[GetResponse[T]]] = js.native
}
object MGetResponse {
  
  @scala.inline
  def apply[T](): MGetResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MGetResponse[T]]
  }
  
  @scala.inline
  implicit class MGetResponseMutableBuilder[Self <: MGetResponse[_], T] (val x: Self with MGetResponse[T]) extends AnyVal {
    
    @scala.inline
    def setDocs(value: js.Array[GetResponse[T]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    @scala.inline
    def setDocsVarargs(value: GetResponse[T]*): Self = StObject.set(x, "docs", js.Array(value :_*))
  }
}
