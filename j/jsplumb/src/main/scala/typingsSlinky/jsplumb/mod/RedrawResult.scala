package typingsSlinky.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedrawResult extends StObject {
  
  var c: js.Array[Connection] = js.native
  
  var e: js.Array[Endpoint] = js.native
}
object RedrawResult {
  
  @scala.inline
  def apply(c: js.Array[Connection], e: js.Array[Endpoint]): RedrawResult = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrawResult]
  }
  
  @scala.inline
  implicit class RedrawResultMutableBuilder[Self <: RedrawResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: js.Array[Connection]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVarargs(value: Connection*): Self = StObject.set(x, "c", js.Array(value :_*))
    
    @scala.inline
    def setE(value: js.Array[Endpoint]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEVarargs(value: Endpoint*): Self = StObject.set(x, "e", js.Array(value :_*))
  }
}
