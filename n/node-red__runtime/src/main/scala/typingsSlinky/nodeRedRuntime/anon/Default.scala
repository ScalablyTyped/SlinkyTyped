package typingsSlinky.nodeRedRuntime.anon

import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends StObject {
  
  var default: js.UndefOr[Permissions] = js.native
  
  var `type`: credentials = js.native
  
  var users: js.Array[Password] = js.native
}
object Default {
  
  @scala.inline
  def apply(`type`: credentials, users: js.Array[Password]): Default = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Permissions): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setType(value: credentials): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[Password]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Password*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
