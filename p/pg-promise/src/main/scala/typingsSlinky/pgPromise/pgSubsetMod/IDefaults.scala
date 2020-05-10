package typingsSlinky.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaults extends js.Object {
  var application_name: String = js.native
  // binary result mode
  var binary: Boolean = js.native
  var client_encoding: String = js.native
  var connect_timeout: Double = js.native
  // connection string for overriding defaults
  var connectionString: String = js.native
  // name of database to connect
  var database: String = js.native
  var fallback_application_name: String = js.native
  // database host. defaults to localhost
  var host: String = js.native
  // max milliseconds a client can go unused before it is removed
  // from the pool and destroyed
  var idleTimeoutMillis: Double = js.native
  var keepalives: Double = js.native
  var keepalives_idle: Double = js.native
  // Connection pool options - see https://github.com/brianc/node-pg-pool
  // number of connections to use in connection pool
  // 0 will disable connection pooling
  var max: Double = js.native
  var parseInputDatesAsUTC: Boolean = js.native
  // database user's password
  var password: DynamicPassword = js.native
  // database port
  var port: Double = js.native
  // max milliseconds to wait for query to complete (client side)
  var query_timeout: Boolean | Double = js.native
  // number of rows to return at a time from a prepared statement's
  // portal. 0 will return all rows at once
  var rows: Double = js.native
  var ssl: Boolean | ISSLConfig = js.native
  // max milliseconds any query using this connection will execute for before timing out in error.
  // false=unlimited
  var statement_timeout: Boolean | Double = js.native
  // database user's name
  var user: String = js.native
}

object IDefaults {
  @scala.inline
  def apply(
    application_name: String,
    binary: Boolean,
    client_encoding: String,
    connect_timeout: Double,
    connectionString: String,
    database: String,
    fallback_application_name: String,
    host: String,
    idleTimeoutMillis: Double,
    keepalives: Double,
    keepalives_idle: Double,
    max: Double,
    parseInputDatesAsUTC: Boolean,
    password: DynamicPassword,
    port: Double,
    query_timeout: Boolean | Double,
    rows: Double,
    ssl: Boolean | ISSLConfig,
    statement_timeout: Boolean | Double,
    user: String
  ): IDefaults = {
    val __obj = js.Dynamic.literal(application_name = application_name.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], client_encoding = client_encoding.asInstanceOf[js.Any], connect_timeout = connect_timeout.asInstanceOf[js.Any], connectionString = connectionString.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], fallback_application_name = fallback_application_name.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], idleTimeoutMillis = idleTimeoutMillis.asInstanceOf[js.Any], keepalives = keepalives.asInstanceOf[js.Any], keepalives_idle = keepalives_idle.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], parseInputDatesAsUTC = parseInputDatesAsUTC.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query_timeout = query_timeout.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], statement_timeout = statement_timeout.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
  @scala.inline
  implicit class IDefaultsOps[Self <: IDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_encoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback_application_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback_application_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepalives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepalives_idle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives_idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseInputDatesAsUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputDatesAsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordFunction0(value: () => js.Promise[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassword(value: DynamicPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_timeout(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsl(value: Boolean | ISSLConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement_timeout(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

