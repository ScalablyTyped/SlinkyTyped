package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JdbcAdvancedParameters */
@js.native
trait ConnectionAdvancedParameters extends js.Object {
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
  implicit class ConnectionAdvancedParametersOps[Self <: ConnectionAdvancedParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_clientSslCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clientSslCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_clientSslCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clientSslCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def with_clientSslKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clientSslKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_clientSslKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clientSslKey")(js.undefined)
        ret
    }
    @scala.inline
    def with_serverSslCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_serverSslCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_serverSslCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_serverSslCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJDBCCompliantTimeZoneShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJDBCCompliantTimeZoneShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJDBCCompliantTimeZoneShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJDBCCompliantTimeZoneShift")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

