package typingsSlinky.knex.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var acquireConnectionTimeout: js.UndefOr[Double] = js.native
  var asyncStackTraces: js.UndefOr[Boolean] = js.native
  var client: js.UndefOr[String | (Instantiable1[/* config */ Config, Client])] = js.native
  var connection: js.UndefOr[
    String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | OracleDbConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig
  ] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dialect: js.UndefOr[String] = js.native
  var log: js.UndefOr[Logger] = js.native
  var migrations: js.UndefOr[MigratorConfig] = js.native
  var pool: js.UndefOr[PoolConfig] = js.native
  var postProcessResponse: js.UndefOr[js.Function2[/* result */ js.Any, /* queryContext */ js.Any, _]] = js.native
  var searchPath: js.UndefOr[String | js.Array[String]] = js.native
  var seeds: js.UndefOr[SeedsConfig] = js.native
  var useNullAsDefault: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  var wrapIdentifier: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* origImpl */ js.Function1[/* value */ String, String], 
      /* queryContext */ js.Any, 
      String
    ]
  ] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquireConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireConnectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquireConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireConnectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncStackTraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncStackTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStackTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: String | (Instantiable1[/* config */ Config, Client])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(
      value: String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | OracleDbConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDialect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrations(value: MigratorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: PoolConfig): Self = {
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
    def withPostProcessResponse(value: (/* result */ js.Any, /* queryContext */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostProcessResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSeeds(value: SeedsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeds")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNullAsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNullAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNullAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNullAsDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapIdentifier(
      value: (/* value */ String, /* origImpl */ js.Function1[/* value */ String, String], /* queryContext */ js.Any) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapIdentifier")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutWrapIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapIdentifier")(js.undefined)
        ret
    }
  }
  
}

