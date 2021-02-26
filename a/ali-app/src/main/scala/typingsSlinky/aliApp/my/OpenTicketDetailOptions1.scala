package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTicketDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  
  var passId: String = js.native
}
object OpenTicketDetailOptions1 {
  
  @scala.inline
  def apply(passId: String): OpenTicketDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTicketDetailOptions1]
  }
  
  @scala.inline
  implicit class OpenTicketDetailOptions1MutableBuilder[Self <: OpenTicketDetailOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
