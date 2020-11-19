package typingsSlinky.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argon2Error extends js.Object {
  
  var code: Double = js.native
  
  var message: String = js.native
}
object Argon2Error {
  
  @scala.inline
  def apply(code: Double, message: String): Argon2Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2Error]
  }
  
  @scala.inline
  implicit class Argon2ErrorOps[Self <: Argon2Error] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
