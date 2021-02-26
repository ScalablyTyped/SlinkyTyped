package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.orientjsStrings.document
import typingsSlinky.orientjs.orientjsStrings.graph
import typingsSlinky.orientjs.orientjsStrings.memory
import typingsSlinky.orientjs.orientjsStrings.plocal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseOptions extends StObject {
  
  var name: String = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var storage: js.UndefOr[plocal | memory] = js.native
  
  var `type`: js.UndefOr[graph | document] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object DatabaseOptions {
  
  @scala.inline
  def apply(name: String): DatabaseOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
  
  @scala.inline
  implicit class DatabaseOptionsMutableBuilder[Self <: DatabaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setStorage(value: plocal | memory): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setType(value: graph | document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
