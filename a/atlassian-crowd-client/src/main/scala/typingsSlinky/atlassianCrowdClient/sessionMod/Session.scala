package typingsSlinky.atlassianCrowdClient.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  val createdAt: js.Date = js.native
  
  val expiresAt: js.Date = js.native
  
  def toCrowd(): SessionObj = js.native
  
  val token: String = js.native
}
object Session {
  
  @scala.inline
  def apply(createdAt: js.Date, expiresAt: js.Date, toCrowd: () => SessionObj, token: String): Session = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: js.Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCrowd(value: () => SessionObj): Self = this.set("toCrowd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
