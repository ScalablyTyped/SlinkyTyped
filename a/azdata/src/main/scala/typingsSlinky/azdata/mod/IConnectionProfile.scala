package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionProfile extends ConnectionInfo {
  
  var authenticationType: String = js.native
  
  var azureTenantId: js.UndefOr[String] = js.native
  
  var connectionName: String = js.native
  
  var databaseName: String = js.native
  
  var groupFullName: js.UndefOr[String] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var password: String = js.native
  
  var providerName: String = js.native
  
  var savePassword: Boolean = js.native
  
  var saveProfile: Boolean = js.native
  
  var serverName: String = js.native
  
  var userName: String = js.native
}
object IConnectionProfile {
  
  @scala.inline
  def apply(
    authenticationType: String,
    connectionName: String,
    databaseName: String,
    id: String,
    options: StringDictionary[js.Any],
    password: String,
    providerName: String,
    savePassword: Boolean,
    saveProfile: Boolean,
    serverName: String,
    userName: String
  ): IConnectionProfile = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], savePassword = savePassword.asInstanceOf[js.Any], saveProfile = saveProfile.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionProfile]
  }
  
  @scala.inline
  implicit class IConnectionProfileMutableBuilder[Self <: IConnectionProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFullName(value: String): Self = StObject.set(x, "groupFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFullNameUndefined: Self = StObject.set(x, "groupFullName", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePassword(value: Boolean): Self = StObject.set(x, "savePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveProfile(value: Boolean): Self = StObject.set(x, "saveProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
