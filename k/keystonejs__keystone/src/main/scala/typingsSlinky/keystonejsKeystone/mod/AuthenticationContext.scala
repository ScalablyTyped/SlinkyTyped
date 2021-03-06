package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsKeystone.anon.GqlName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationContext extends js.Object {
  
  var authentication: GqlName = js.native
}
object AuthenticationContext {
  
  @scala.inline
  def apply(authentication: GqlName): AuthenticationContext = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationContext]
  }
  
  @scala.inline
  implicit class AuthenticationContextOps[Self <: AuthenticationContext] (val x: Self) extends AnyVal {
    
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
    def setAuthentication(value: GqlName): Self = this.set("authentication", value.asInstanceOf[js.Any])
  }
}
