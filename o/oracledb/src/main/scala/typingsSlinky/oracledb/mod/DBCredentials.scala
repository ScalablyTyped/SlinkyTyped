package typingsSlinky.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracledb.anon.ConnectionString
  - typingsSlinky.oracledb.anon.ConnectString
*/
trait DBCredentials extends StObject
object DBCredentials {
  
  @scala.inline
  def ConnectString(connectString: String, password: String, user: String): typingsSlinky.oracledb.anon.ConnectString = {
    val __obj = js.Dynamic.literal(connectString = connectString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.oracledb.anon.ConnectString]
  }
  
  @scala.inline
  def ConnectionString(connectionString: String, password: String, user: String): typingsSlinky.oracledb.anon.ConnectionString = {
    val __obj = js.Dynamic.literal(connectionString = connectionString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.oracledb.anon.ConnectionString]
  }
}
