package typingsSlinky.aliApp.my

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
  implicit class OpenTicketDetailOptions1Ops[Self <: OpenTicketDetailOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPassId(value: String): Self = this.set("passId", value.asInstanceOf[js.Any])
  }
}
