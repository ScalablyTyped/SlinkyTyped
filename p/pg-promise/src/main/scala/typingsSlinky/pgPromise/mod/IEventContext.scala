package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
@js.native
trait IEventContext[C /* <: IClient */] extends StObject {
  
  var client: C = js.native
  
  var cn: js.Any = js.native
  
  var ctx: ITaskContext = js.native
  
  var dc: js.Any = js.native
  
  var params: js.Any = js.native
  
  var query: js.Any = js.native
}
object IEventContext {
  
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: js.Any, ctx: ITaskContext, dc: js.Any, params: js.Any, query: js.Any): IEventContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventContext[C]]
  }
  
  @scala.inline
  implicit class IEventContextMutableBuilder[Self <: IEventContext[_], C /* <: IClient */] (val x: Self with IEventContext[C]) extends AnyVal {
    
    @scala.inline
    def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCn(value: js.Any): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: ITaskContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
