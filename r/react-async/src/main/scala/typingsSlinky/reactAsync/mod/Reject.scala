package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.Dictmeta
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-async.react-async.AbstractAction & {  type :'reject',   payload :std.Error,   error :true} */
@js.native
trait Reject
  extends AsyncAction[js.Any] {
  
  var error: `true` = js.native
  
  var meta: Dictmeta = js.native
  
  var payload: js.Error = js.native
  
  var `type`: String with reject = js.native
}
object Reject {
  
  @scala.inline
  def apply(error: `true`, meta: Dictmeta, payload: js.Error, `type`: String with reject): Reject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
  
  @scala.inline
  implicit class RejectMutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String with reject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
