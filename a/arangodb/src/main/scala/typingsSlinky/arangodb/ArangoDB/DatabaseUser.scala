package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database
@js.native
trait DatabaseUser extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[js.Object] = js.native
  
  var passwd: js.UndefOr[String] = js.native
  
  var username: String = js.native
}
object DatabaseUser {
  
  @scala.inline
  def apply(username: String): DatabaseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUser]
  }
  
  @scala.inline
  implicit class DatabaseUserMutableBuilder[Self <: DatabaseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Object): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setPasswd(value: String): Self = StObject.set(x, "passwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswdUndefined: Self = StObject.set(x, "passwd", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
