package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information regarding the outcome of a successful connection.execute().
  */
@js.native
trait Result[T] extends js.Object {
  /**
    * This property will be defined if the executed statement returned Implicit Results. Depending on the value of resultSet it will either be an array,
    * each element containing an array of rows from one query, or an array of ResultSets each corresponding to a query.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#implicitresults
    * @since 4.0
    */
  var implicitResults: js.UndefOr[js.Array[js.Array[T] | ResultSet[T]]] = js.native
  /**
    * ROWID of a row affected by an INSERT, UPDATE, DELETE or MERGE statement. For other statements,
    * or if no row was affected, it is not set. If more than one row was affected, only the ROWID of the last row is returned.
    * 
    * @since 4.2
    */
  val lastRowid: js.UndefOr[String] = js.native
  /**
    * For SELECT statements, this contains an array of objects describing details of columns for the select list.
    * For non queries, this property is undefined.
    *
    * Each column’s name is always given. If the oracledb.extendedMetaData or execute() option extendedMetaData
    * are true then additional information is included.
    */
  var metaData: js.UndefOr[js.Array[Metadata]] = js.native
  /**
    * This contains the output values of OUT and IN OUT binds. If bindParams is passed as an array,
    * then outBinds is returned as an array. If bindParams is passed as an object,
    * then outBinds is returned as an object. If there are no OUT or IN OUT binds, the value is undefined.
    */
  var outBinds: js.UndefOr[T] = js.native
  /**
    * For SELECT statements when the resultSet option is true, use the resultSet object to fetch rows.
    *
    * When using this option, resultSet.close() must be called when the ResultSet is no longer needed.
    * This is true whether or not rows have been fetched from the ResultSet.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsetclass
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsethandling
    */
  var resultSet: js.UndefOr[ResultSet[T]] = js.native
  /**
    * For SELECT statements using direct fetches, rows contains an array of fetched rows.
    * It will be NULL if there is an error or the SQL statement was not a SELECT statement.
    * By default, the rows are in an array of column value arrays, but this can be changed to arrays
    * of objects by setting outFormat to oracledb.OBJECT. If a single row is fetched,
    * then rows is an array that contains one single row.
    *
    * The number of rows returned is limited by oracledb.maxRows or the maxRows option in an execute() call.
    * If maxRows is 0, then the number of rows is limited by Node.js memory constraints.
    */
  var rows: js.UndefOr[js.Array[T]] = js.native
  /**
    * For DML statements (including SELECT FOR UPDATE) this contains the number of rows affected,
    * for example the number of rows inserted. For non-DML statements such as queries and PL/SQL statements,
    * rowsAffected is undefined.
    */
  var rowsAffected: js.UndefOr[Double] = js.native
}

object Result {
  @scala.inline
  def apply[T](): Result[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result[T]]
  }
  @scala.inline
  implicit class ResultOps[Self[t] <: Result[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withImplicitResults(value: js.Array[js.Array[T] | ResultSet[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitResults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitResults")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRowid(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRowid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRowid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRowid")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaData(value: js.Array[Metadata]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(js.undefined)
        ret
    }
    @scala.inline
    def withOutBinds(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outBinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutBinds: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outBinds")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSet(value: ResultSet[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsAffected(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsAffected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(js.undefined)
        ret
    }
  }
  
}

