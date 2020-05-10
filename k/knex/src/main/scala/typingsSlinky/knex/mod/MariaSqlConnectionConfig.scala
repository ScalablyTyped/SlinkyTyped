package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mariasql: https://github.com/mscdex/node-mariasql#client-methods
@js.native
trait MariaSqlConnectionConfig extends js.Object {
  var charset: js.UndefOr[String] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var connTimeout: js.UndefOr[Double] = js.native
  var db: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var keepQueries: js.UndefOr[Boolean] = js.native
  var local_infile: js.UndefOr[Boolean] = js.native
  var multiStatements: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var pingInterval: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var read_default_file: js.UndefOr[String] = js.native
  var read_default_group: js.UndefOr[String] = js.native
  var secureAuth: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[Boolean | MariaSslConfiguration] = js.native
  var streamHWM: js.UndefOr[Double] = js.native
  var unixSocket: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
}

object MariaSqlConnectionConfig {
  @scala.inline
  def apply(): MariaSqlConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MariaSqlConnectionConfig]
  }
  @scala.inline
  implicit class MariaSqlConnectionConfigOps[Self <: MariaSqlConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withConnTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_infile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_infile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_infile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_infile")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiStatements")(js.undefined)
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
    def withPingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRead_default_file(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_default_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead_default_file: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_default_file")(js.undefined)
        ret
    }
    @scala.inline
    def withRead_default_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_default_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead_default_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_default_group")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean | MariaSslConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamHWM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamHWM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamHWM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamHWM")(js.undefined)
        ret
    }
    @scala.inline
    def withUnixSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnixSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixSocket")(js.undefined)
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

