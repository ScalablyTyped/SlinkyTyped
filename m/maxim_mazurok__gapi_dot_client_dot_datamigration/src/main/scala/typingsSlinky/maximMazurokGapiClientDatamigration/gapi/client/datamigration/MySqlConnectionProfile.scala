package typingsSlinky.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySqlConnectionProfile extends StObject {
  
  /** If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source. */
  var cloudSqlId: js.UndefOr[String] = js.native
  
  /** Required. The IP or hostname of the source MySQL database. */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Required. Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is
    * encrypted when stored in Database Migration Service.
    */
  var password: js.UndefOr[String] = js.native
  
  /** Output only. Indicates If this connection profile password is stored. */
  var passwordSet: js.UndefOr[Boolean] = js.native
  
  /** Required. The network port of the source MySQL database. */
  var port: js.UndefOr[Double] = js.native
  
  /** SSL configuration for the destination to connect to the source database. */
  var ssl: js.UndefOr[SslConfig] = js.native
  
  /** Required. The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service. */
  var username: js.UndefOr[String] = js.native
}
object MySqlConnectionProfile {
  
  @scala.inline
  def apply(): MySqlConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlConnectionProfile]
  }
  
  @scala.inline
  implicit class MySqlConnectionProfileMutableBuilder[Self <: MySqlConnectionProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudSqlId(value: String): Self = StObject.set(x, "cloudSqlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudSqlIdUndefined: Self = StObject.set(x, "cloudSqlId", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSet(value: Boolean): Self = StObject.set(x, "passwordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSetUndefined: Self = StObject.set(x, "passwordSet", js.undefined)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setSsl(value: SslConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
