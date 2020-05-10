package typingsSlinky.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
@js.native
trait IConnectionParameters[C /* <: IClient */] extends js.Object {
  var Client: js.UndefOr[Instantiable1[/* config */ String | IConnectionParameters[IClient], C]] = js.native
  var application_name: js.UndefOr[String] = js.native
  var binary: js.UndefOr[Boolean] = js.native
  var client_encoding: js.UndefOr[String] = js.native
  var connect_timeout: js.UndefOr[Double] = js.native
  var connectionString: js.UndefOr[String] = js.native
  var database: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fallback_application_name: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  var isDomainSocket: js.UndefOr[Boolean] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.native
  var keepalives: js.UndefOr[Double] = js.native
  var keepalives_idle: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[DynamicPassword] = js.native
  var port: js.UndefOr[Double] = js.native
  var query_timeout: js.UndefOr[Boolean | Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var ssl: js.UndefOr[Boolean | ISSLConfig] = js.native
  var statement_timeout: js.UndefOr[Boolean | Double] = js.native
  var user: js.UndefOr[String] = js.native
}

object IConnectionParameters {
  @scala.inline
  def apply[C](): IConnectionParameters[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionParameters[C]]
  }
  @scala.inline
  implicit class IConnectionParametersOps[Self[c] <: IConnectionParameters[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], C]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(js.undefined)
        ret
    }
    @scala.inline
    def withApplication_name(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication_name: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_name")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_encoding(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_encoding: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect_timeout(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect_timeout: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionString: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback_application_name(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback_application_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback_application_name: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback_application_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeoutMillis(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeoutMillis: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDomainSocket(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDomainSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDomainSocket: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDomainSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveInitialDelayMillis(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInitialDelayMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveInitialDelayMillis: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInitialDelayMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalives(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalives: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalives_idle(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives_idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalives_idle: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalives_idle")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withParseInputDatesAsUTC(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputDatesAsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseInputDatesAsUTC: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputDatesAsUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordFunction0(value: () => js.Promise[String] | String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassword(value: DynamicPassword): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_timeout(value: Boolean | Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_timeout: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean | ISSLConfig): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_timeout(value: Boolean | Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_timeout: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

