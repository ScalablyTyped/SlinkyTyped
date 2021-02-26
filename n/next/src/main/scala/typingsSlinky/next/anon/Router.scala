package typingsSlinky.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends StObject {
  
  var router: typingsSlinky.next.routerMod.Router = js.native
}
object Router {
  
  @scala.inline
  def apply(router: typingsSlinky.next.routerMod.Router): Router = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router]
  }
  
  @scala.inline
  implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouter(value: typingsSlinky.next.routerMod.Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
