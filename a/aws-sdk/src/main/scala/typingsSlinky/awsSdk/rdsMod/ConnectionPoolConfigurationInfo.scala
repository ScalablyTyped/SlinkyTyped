package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPoolConfigurationInfo extends js.Object {
  /**
    * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
    */
  var ConnectionBorrowTimeout: js.UndefOr[Integer] = js.native
  /**
    *  One or more SQL statements for the proxy to run when opening each new database connection. Typically used with SET statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single SET statement, such as SET x=1, y=2. 
    */
  var InitQuery: js.UndefOr[String] = js.native
  /**
    * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
    */
  var MaxConnectionsPercent: js.UndefOr[Integer] = js.native
  /**
    *  Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group. 
    */
  var MaxIdleConnectionsPercent: js.UndefOr[Integer] = js.native
  /**
    * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is EXCLUDE_VARIABLE_SETS.
    */
  var SessionPinningFilters: js.UndefOr[StringList] = js.native
}

object ConnectionPoolConfigurationInfo {
  @scala.inline
  def apply(): ConnectionPoolConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPoolConfigurationInfo]
  }
  @scala.inline
  implicit class ConnectionPoolConfigurationInfoOps[Self <: ConnectionPoolConfigurationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionBorrowTimeout(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionBorrowTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionBorrowTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionBorrowTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInitQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnectionsPercent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConnectionsPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnectionsPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConnectionsPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIdleConnectionsPercent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIdleConnectionsPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIdleConnectionsPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIdleConnectionsPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionPinningFilters(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionPinningFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionPinningFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionPinningFilters")(js.undefined)
        ret
    }
  }
  
}

