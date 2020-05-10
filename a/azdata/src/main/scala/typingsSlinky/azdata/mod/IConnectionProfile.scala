package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionProfile extends ConnectionInfo {
  var authenticationType: String = js.native
  var azureTenantId: js.UndefOr[String] = js.native
  var connectionName: String = js.native
  var databaseName: String = js.native
  var groupFullName: js.UndefOr[String] = js.native
  var groupId: String = js.native
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
    groupId: String,
    id: String,
    options: StringDictionary[js.Any],
    password: String,
    providerName: String,
    savePassword: Boolean,
    saveProfile: Boolean,
    serverName: String,
    userName: String
  ): IConnectionProfile = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], savePassword = savePassword.asInstanceOf[js.Any], saveProfile = saveProfile.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionProfile]
  }
  @scala.inline
  implicit class IConnectionProfileOps[Self <: IConnectionProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavePassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzureTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFullName")(js.undefined)
        ret
    }
  }
  
}

