package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODatabaseSessionPoolOptions extends StObject {
  
  var name: String = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var pool: js.UndefOr[Max] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ODatabaseSessionPoolOptions {
  
  @scala.inline
  def apply(name: String): ODatabaseSessionPoolOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODatabaseSessionPoolOptions]
  }
  
  @scala.inline
  implicit class ODatabaseSessionPoolOptionsMutableBuilder[Self <: ODatabaseSessionPoolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPool(value: Max): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
