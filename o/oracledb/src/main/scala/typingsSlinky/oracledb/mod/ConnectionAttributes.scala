package typingsSlinky.oracledb.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection credentials and connection-specific configuration properties.
  */
@js.native
trait ConnectionAttributes extends js.Object {
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[String] = js.native
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance to connect to.
    * The string can be an Easy Connect string, or a Net Service Name from atnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[String] = js.native
  /**
    * Sets the name used for Edition-Based Redefinition by this connection.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[String] = js.native
  /**
    * Determines if the standalone connection is created using Oracle Call Interface events mode.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the connection should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    */
  var externalAuth: js.UndefOr[Boolean] = js.native
  /**
    * Used in conjunction with tag when getting a connection from a connection pool.
    * Indicates that the tag in a connection returned from a connection pool may not match the requested tag.
    *
    * @default false
    * @since 3.1
    */
  var matchAny: js.UndefOr[Boolean] = js.native
  /**
    * The new password to use for the database user. When using newPassword, the password property should be set to the current password.
    * This allows passwords to be changed at the time of connection, in particular it can be used to connect when the old password has expired.
    *
    * @since 2.2
    */
  var newPassword: js.UndefOr[String] = js.native
  /**
    * Specifies which previously created pool in the connection pool cache to obtain the connection from. See Pool Alias.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The password of the database user. A password is also necessary if a proxy user is specified.
    */
  var poolAlias: js.UndefOr[String] = js.native
  /**
    * The privilege to use when establishing connection to the database.
    * This optional property should be one of the privileged connection constants.
    * Note only non-pooled connections can be privileged.
    *
    * @since 2.1
    */
  var privilege: js.UndefOr[Double] = js.native
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var shardingKey: js.UndefOr[js.Array[String | Double | js.Date | Buffer]] = js.native
  /**
    * The number of statements to be cached in the statement cache of each connection.
    * This optional property may be used to override the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[Double] = js.native
  /**
    * Allows a connection to be established directly to a database shard.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sharding
    * @since 4.1
    */
  var superShardingKey: js.UndefOr[js.Array[String | Double | js.Date | Buffer]] = js.native
  /**
    * Used when getting a connection from a connection pool.
    * Indicates the tag that a connection returned from a connection pool should have.
    * Various heuristics determine the tag that is actually returned.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * The database user name. Can be a simple user name or a proxy of the form alison[fred].
    */
  var user: js.UndefOr[String] = js.native
}

object ConnectionAttributes {
  @scala.inline
  def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  @scala.inline
  implicit class ConnectionAttributesOps[Self <: ConnectionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMatchAny(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAny")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPassword")(js.undefined)
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
    def withPrivilege(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withShardingKey(value: js.Array[String | Double | js.Date | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardingKey")(js.undefined)
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
    def withSuperShardingKey(value: js.Array[String | Double | js.Date | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superShardingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperShardingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superShardingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
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

