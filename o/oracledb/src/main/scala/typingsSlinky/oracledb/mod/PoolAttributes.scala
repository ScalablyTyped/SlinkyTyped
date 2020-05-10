package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection credentials and pool-specific configuration properties.
  * The properties provided override the default pooling properties of the Oracledb object.
  * If an attribute is not set, or is null, the value of the related Oracledb property will be used.
  */
@js.native
trait PoolAttributes extends js.Object {
  /**
    * Further statistics can be enabled by setting the createPool() poolAttrs parameter _enableStats to true.
    * Statistics can be output to the console by calling the pool._logStats() method.
    */
  var _enableStats: js.UndefOr[Boolean] = js.native
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance used by connections in the pool.
    * The string can be an Easy Connect string, or a Net Service Name from a tnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[String] = js.native
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance used by connections in the pool.
    * The string can be an Easy Connect string, or a Net Service Name from a tnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[String] = js.native
  /**
    * Sets the name used for Edition-Based Redefinition by connections in the pool.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[String] = js.native
  /**
    * Indicate whether Oracle Call Interface events mode should be enabled for this pool.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether pooled connections should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    * @since 0.5
    */
  var externalAuth: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether connections in the pool all have the same credentials (a ‘homogeneous’ pool), or whether different credentials can be used (a ‘heterogeneous’ pool).
    * When set to false, the user name and password can be omitted from the connection.createPool() call, but will need to be given for subsequent pool.getConnection() calls.
    * Different pool.getConnection() calls can provide different user credentials.
    * Alternatively, when homogeneous is false, the user name (the ‘proxy’ user name) and password can be given, but subsequent pool.getConnection() calls can specify a different user name to access that user’s schema.
    * Heterogeneous pools cannot be used with the connection pool cache. Applications should ensure the pool object is explicitly passed between code modules, or use a homogeneous pool and make use of connection.clientId.
    *
    * @default true
    * @since 2.3
    */
  var homogeneous: js.UndefOr[Boolean] = js.native
  /**
    * The password of the database user used by connections in the pool. A password is also necessary if a proxy user is specified at pool creation.
    * If homogeneous is false, then the password may be omitted at pool creation but given in subsequent pool.getConnection() calls.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The poolAlias is an optional property that is used to explicitly add pools to the connection pool cache.
    * If a pool alias is provided, then the new pool will be added to the connection pool cache and the poolAlias value can then be used with methods that utilize the connection pool cache, such as oracledb.getPool() and oracledb.getConnection().
    *
    * @since 1.11
    */
  var poolAlias: js.UndefOr[String] = js.native
  /**
    * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
    * This optional property overrides the oracledb.poolIncrement property.
    *
    * @default 1
    */
  var poolIncrement: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connections to which a connection pool can grow.
    * This optional property overrides the oracledb.poolMax property.
    * Importantly, if you increase poolMax you should also increase the number of threads available to node-oracledb.
    *
    * @default 4
    */
  var poolMax: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connections per shard for connection pools. This ensures that the pool is balanced towards each shard.
    * This optional property overrides the oracledb.poolMaxPerShard property.
    * 
    * @since 4.1
    */
  var poolMaxPerShard: js.UndefOr[Double] = js.native
  /**
    * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
    * This optional property overrides the oracledb.poolMin property.
    *
    * @default 0
    */
  var poolMin: js.UndefOr[Double] = js.native
  /**
    * When a pool getConnection() is called and the connection has been idle in the pool for
    * at least poolPingInterval seconds, an internal “ping” will be performed first to check the aliveness of the connection.
    * This optional property overrides the oracledb.poolPingInterval property.
    *
    * @default 60
    */
  var poolPingInterval: js.UndefOr[Double] = js.native
  /**
    * The number of seconds after which idle connections (unused in the pool) may be terminated.
    * Idle connections are terminated only when the pool is accessed.
    * This optional property overrides the oracledb.poolTimeout property.
    *
    * @default 60
    */
  var poolTimeout: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds after which connection requests waiting in the connection request queue are terminated.
    * If queueTimeout is set to 0, then queued connection requests are never terminated.
    * This optional property overrides the oracledb.queueTimeout property.
    *
    * @default 60000
    */
  var queueTimeout: js.UndefOr[Double] = js.native
  /**
    * When sessionCallback is a Node.js function, it will be invoked for each pool.getConnection() call that will return a newly created connection in the pool.
    * It will also be called if pool.getConnection() requests a connection from the pool with a given tag, and that tag value does not match the connection’s current actual tag.
    * It will not be invoked for other getConnection() calls. The tag requested by pool.getConnection() is passed as the requestedTag parameter and the actual tag is available in connection.tag.
    *
    * The session callback is called before getConnection() returns so it can be used to do logging or efficiently set session state such as with ALTER SESSION statements.
    * Make sure any session state is set and connection.tag is updated in the sessionCallback function prior to it calling its own callback function otherwise the session will not be correctly set when getConnection() returns.
    *
    * When node-oracledb is using Oracle Client libraries 12.2 or later, the tag must be a multi-property tag with name=value pairs like “k1=v1;k2=v2”.
    * When using Oracle Client libraries 12.2 or later, sessionCallback can be a string containing the name of a PL/SQL procedure to be called when pool.getConnection() requests a tag, and that tag does not match the connection’s actual tag.
    * When the application uses DRCP connections, a PL/SQL callback can avoid the round-trip calls that a Node.js function would require to set session state. For non-DRCP connections, the PL/SQL callback will require a round-trip from the application.
    *
    * The PL/SQL procedure declaration is:
    *
    *      PROCEDURE mycallback (
    *         desired_props IN  VARCHAR2,
    *         actual_props  IN  VARCHAR2
    *      );
    *
    * @since 3.1
    */
  var sessionCallback: js.UndefOr[
    String | (js.Function3[
      /* connection */ Connection, 
      /* requestedTag */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[DBError], Unit], 
      Unit
    ])
  ] = js.native
  /**
    * The number of statements to be cached in the statement cache of each connection in the pool.
    * This optional property overrides the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[Double] = js.native
  /**
    * The database user name for connections in the pool. Can be a simple user name or a proxy of the form alison[fred].
    * If homogeneous is false, then the pool user name and password need to be specified only if the application wants that user to proxy the users supplied in subsequent pool.getConnection() calls.
    */
  var user: js.UndefOr[String] = js.native
}

object PoolAttributes {
  @scala.inline
  def apply(): PoolAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolAttributes]
  }
  @scala.inline
  implicit class PoolAttributesOps[Self <: PoolAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_enableStats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_enableStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableStats")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectString")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(js.undefined)
        ret
    }
    @scala.inline
    def withEdition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edition")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withHomogeneous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homogeneous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomogeneous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homogeneous")(js.undefined)
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
    def withPoolAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMax")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolMaxPerShard(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMaxPerShard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolMaxPerShard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMaxPerShard")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolMin")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolPingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolPingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolPingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolPingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionCallbackFunction3(
      value: (/* connection */ Connection, /* requestedTag */ String, /* callback */ js.Function1[/* error */ js.UndefOr[DBError], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSessionCallback(
      value: String | (js.Function3[
          /* connection */ Connection, 
          /* requestedTag */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[DBError], Unit], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStmtCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stmtCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStmtCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stmtCacheSize")(js.undefined)
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

