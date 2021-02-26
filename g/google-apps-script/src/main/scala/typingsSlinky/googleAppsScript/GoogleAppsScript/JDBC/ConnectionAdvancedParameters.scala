package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JdbcAdvancedParameters */
@js.native
trait ConnectionAdvancedParameters extends StObject {
  
  /** the client's SSL certificate */
  var _clientSslCertificate: js.UndefOr[String] = js.native
  
  /** the client's SSL key */
  var _clientSslKey: js.UndefOr[String] = js.native
  
  /** the server's SSL certificate */
  var _serverSslCertificate: js.UndefOr[String] = js.native
  
  /** the database to connect to */
  var databaseName: js.UndefOr[String] = js.native
  
  /** the user's password */
  var password: js.UndefOr[String] = js.native
  
  /** whether or not the connection should comply with JDBC rules when converting time zones. The default is false. */
  var useJDBCCompliantTimeZoneShift: js.UndefOr[Boolean] = js.native
  
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.native
}
object ConnectionAdvancedParameters {
  
  @scala.inline
  def apply(): ConnectionAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAdvancedParameters]
  }
  
  @scala.inline
  implicit class ConnectionAdvancedParametersMutableBuilder[Self <: ConnectionAdvancedParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUseJDBCCompliantTimeZoneShift(value: Boolean): Self = StObject.set(x, "useJDBCCompliantTimeZoneShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJDBCCompliantTimeZoneShiftUndefined: Self = StObject.set(x, "useJDBCCompliantTimeZoneShift", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def set_clientSslCertificate(value: String): Self = StObject.set(x, "_clientSslCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clientSslCertificateUndefined: Self = StObject.set(x, "_clientSslCertificate", js.undefined)
    
    @scala.inline
    def set_clientSslKey(value: String): Self = StObject.set(x, "_clientSslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clientSslKeyUndefined: Self = StObject.set(x, "_clientSslKey", js.undefined)
    
    @scala.inline
    def set_serverSslCertificate(value: String): Self = StObject.set(x, "_serverSslCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_serverSslCertificateUndefined: Self = StObject.set(x, "_serverSslCertificate", js.undefined)
  }
}
