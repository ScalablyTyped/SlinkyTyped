package typingsSlinky.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingHttpStatusHeader extends StObject {
  
  @JSName(":status")
  var Colonstatus: js.UndefOr[Double] = js.native
}
object IncomingHttpStatusHeader {
  
  @scala.inline
  def apply(): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
  
  @scala.inline
  implicit class IncomingHttpStatusHeaderMutableBuilder[Self <: IncomingHttpStatusHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColonstatus(value: Double): Self = StObject.set(x, ":status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonstatusUndefined: Self = StObject.set(x, ":status", js.undefined)
  }
}
