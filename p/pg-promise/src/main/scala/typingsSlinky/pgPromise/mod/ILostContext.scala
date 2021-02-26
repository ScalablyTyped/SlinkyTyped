package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILostContext[C /* <: IClient */] extends StObject {
  
  var client: C = js.native
  
  var cn: String = js.native
  
  var dc: js.Any = js.native
  
  var start: js.Date = js.native
}
object ILostContext {
  
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: String, dc: js.Any, start: js.Date): ILostContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILostContext[C]]
  }
  
  @scala.inline
  implicit class ILostContextMutableBuilder[Self <: ILostContext[_], C /* <: IClient */] (val x: Self with ILostContext[C]) extends AnyVal {
    
    @scala.inline
    def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCn(value: String): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
