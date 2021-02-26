package typingsSlinky.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Password extends StObject {
  
  /**
    * Whether the request is for a password.
    * If so, the frontend shouldn't echo input.
    */
  var password: Boolean = js.native
  
  /**
    * The text to show at the prompt.
    */
  var prompt: String = js.native
}
object Password {
  
  @scala.inline
  def apply(password: Boolean, prompt: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  @scala.inline
  implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
