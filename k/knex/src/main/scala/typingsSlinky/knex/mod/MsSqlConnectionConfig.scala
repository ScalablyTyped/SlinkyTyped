package typingsSlinky.knex.mod

import typingsSlinky.knex.anon.AbortTransactionOnError
import typingsSlinky.knex.anon.AcquireTimeoutMillis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mssql: see https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/mssql/index.d.ts
@js.native
trait MsSqlConnectionConfig extends js.Object {
  var connectionTimeout: js.UndefOr[Double] = js.native
  var database: String = js.native
  var domain: js.UndefOr[String] = js.native
  var driver: js.UndefOr[String] = js.native
  var options: js.UndefOr[AbortTransactionOnError] = js.native
  var parseJSON: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var pool: js.UndefOr[AcquireTimeoutMillis] = js.native
  var port: js.UndefOr[Double] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var server: String = js.native
  var stream: js.UndefOr[Boolean] = js.native
  var user: js.UndefOr[String] = js.native
}

object MsSqlConnectionConfig {
  @scala.inline
  def apply(database: String, server: String): MsSqlConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
  @scala.inline
  implicit class MsSqlConnectionConfigOps[Self <: MsSqlConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AbortTransactionOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withParseJSON(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseJSON")(js.undefined)
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
    def withPool(value: AcquireTimeoutMillis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
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
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
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

