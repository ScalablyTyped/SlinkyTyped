package typingsSlinky.koaUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentContext extends js.Object {
  
  var userAgent: typingsSlinky.koaUseragent.useragentMod.default = js.native
}
object UserAgentContext {
  
  @scala.inline
  def apply(userAgent: typingsSlinky.koaUseragent.useragentMod.default): UserAgentContext = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentContext]
  }
  
  @scala.inline
  implicit class UserAgentContextOps[Self <: UserAgentContext] (val x: Self) extends AnyVal {
    
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
    def setUserAgent(value: typingsSlinky.koaUseragent.useragentMod.default): Self = this.set("userAgent", value.asInstanceOf[js.Any])
  }
}
