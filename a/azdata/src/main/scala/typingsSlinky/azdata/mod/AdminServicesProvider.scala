package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AdminServicesProviderOps[Self <: AdminServicesProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDatabase(value: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDatabase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateLogin(value: (String, LoginInfo) => Thenable[CreateLoginResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLogin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDatabaseInfo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

