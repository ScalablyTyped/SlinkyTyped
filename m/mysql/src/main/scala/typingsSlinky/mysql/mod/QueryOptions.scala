package typingsSlinky.mysql.mod

import typingsSlinky.mysql.UntypedFieldInfotypestrin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  /**
    * Either a boolean or string. If true, tables will be nested objects. If string (e.g. '_'), tables will be
    * nested as tableName_fieldName
    */
  var nestTables: js.UndefOr[js.Any] = js.native
  /**
    * The SQL for the query
    */
  var sql: String = js.native
  /**
    * Every operation takes an optional inactivity timeout option. This allows you to specify appropriate timeouts for
    * operations. It is important to note that these timeouts are not part of the MySQL protocol, and rather timeout
    * operations through the client. This means that when a timeout is reached, the connection it occurred on will be
    * destroyed and no further operations can be performed.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.native
  /**
    * Values for template query
    */
  var values: js.UndefOr[js.Any] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(sql: String): QueryOptions = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestTables(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestTables")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeCast(value: TypeCast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

