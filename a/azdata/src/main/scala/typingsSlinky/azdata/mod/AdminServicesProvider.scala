package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminServicesProvider extends DataProvider {
  
  def createDatabase(connectionUri: String, database: DatabaseInfo): Thenable[CreateDatabaseResponse] = js.native
  
  def createLogin(connectionUri: String, login: LoginInfo): Thenable[CreateLoginResponse] = js.native
  
  def getDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo] = js.native
  
  def getDefaultDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo] = js.native
}
object AdminServicesProvider {
  
  @scala.inline
  def apply(
    createDatabase: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse],
    createLogin: (String, LoginInfo) => Thenable[CreateLoginResponse],
    getDatabaseInfo: String => Thenable[DatabaseInfo],
    getDefaultDatabaseInfo: String => Thenable[DatabaseInfo],
    providerId: String
  ): AdminServicesProvider = {
    val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction2(createDatabase), createLogin = js.Any.fromFunction2(createLogin), getDatabaseInfo = js.Any.fromFunction1(getDatabaseInfo), getDefaultDatabaseInfo = js.Any.fromFunction1(getDefaultDatabaseInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesProvider]
  }
  
  @scala.inline
  implicit class AdminServicesProviderMutableBuilder[Self <: AdminServicesProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDatabase(value: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse]): Self = StObject.set(x, "createDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateLogin(value: (String, LoginInfo) => Thenable[CreateLoginResponse]): Self = StObject.set(x, "createLogin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = StObject.set(x, "getDatabaseInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = StObject.set(x, "getDefaultDatabaseInfo", js.Any.fromFunction1(value))
  }
}
