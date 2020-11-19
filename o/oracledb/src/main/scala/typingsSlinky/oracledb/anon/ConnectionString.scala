package typingsSlinky.oracledb.anon

import typingsSlinky.oracledb.mod.DBCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionString extends DBCredentials {
  
  var connectionString: String = js.native
  
  var externalAuth: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
  
  var user: String = js.native
}
object ConnectionString {
  
  @scala.inline
  def apply(connectionString: String, password: String, user: String): ConnectionString = {
    val __obj = js.Dynamic.literal(connectionString = connectionString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionString]
  }
  
  @scala.inline
  implicit class ConnectionStringOps[Self <: ConnectionString] (val x: Self) extends AnyVal {
    
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
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAuth(value: Boolean): Self = this.set("externalAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAuth: Self = this.set("externalAuth", js.undefined)
  }
}
