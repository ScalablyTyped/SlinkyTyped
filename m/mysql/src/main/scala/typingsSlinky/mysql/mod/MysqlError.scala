package typingsSlinky.mysql.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MysqlError extends Error {
  /**
    * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
    * a node.js error (e.g. 'ECONNREFUSED') or an internal error
    * (e.g. 'PROTOCOL_CONNECTION_LOST').
    */
  var code: String = js.native
  /**
    * The error number for the error code
    */
  var errno: Double = js.native
  /**
    * Boolean, indicating if this error is terminal to the connection object.
    */
  var fatal: Boolean = js.native
  /**
    * The field count
    */
  var fieldCount: js.UndefOr[Double] = js.native
  /**
    * SQL of failed query
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * Error message from MySQL
    */
  var sqlMessage: js.UndefOr[String] = js.native
  /**
    * The sql state
    */
  var sqlState: js.UndefOr[String] = js.native
  /**
    * The sql state marker
    */
  var sqlStateMarker: js.UndefOr[String] = js.native
}

object MysqlError {
  @scala.inline
  def apply(code: String, errno: Double, fatal: Boolean, message: String, name: String): MysqlError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlError]
  }
  @scala.inline
  implicit class MysqlErrorOps[Self <: MysqlError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlState")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlStateMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlStateMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlStateMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlStateMarker")(js.undefined)
        ret
    }
  }
  
}

