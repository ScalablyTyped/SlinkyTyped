package typingsSlinky.nodeRedRuntime.anon

import typingsSlinky.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Before extends StObject {
  
  var before: String = js.native
  
  var id: String = js.native
  
  var limit: String = js.native
  
  var req: js.UndefOr[js.Object] = js.native
  
  var user: js.UndefOr[ProjectUser] = js.native
}
object Before {
  
  @scala.inline
  def apply(before: String, id: String, limit: String): Before = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  
  @scala.inline
  implicit class BeforeMutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
