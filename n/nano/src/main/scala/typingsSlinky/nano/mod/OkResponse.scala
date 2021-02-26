package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/common.html#delete--db
// http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
@js.native
trait OkResponse extends StObject {
  
  // Operation status
  var ok: Boolean = js.native
}
object OkResponse {
  
  @scala.inline
  def apply(ok: Boolean): OkResponse = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkResponse]
  }
  
  @scala.inline
  implicit class OkResponseMutableBuilder[Self <: OkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
