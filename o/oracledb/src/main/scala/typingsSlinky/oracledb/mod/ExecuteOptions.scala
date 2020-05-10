package typingsSlinky.oracledb.mod

import typingsSlinky.oracledb.AnonType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to control statement execution.
  */
@js.native
trait ExecuteOptions extends js.Object {
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    *
    * @default false
    */
  var autoCommit: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
    *
    * With this value, the result.metaData result.resultSet.metaData objects only include column names.
    *
    * If extendedMetaData is true then metaData will contain additional attributes.
    *
    * @default false
    */
  var extendedMetaData: js.UndefOr[Boolean] = js.native
  /**
    * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
    * Changing it may affect query performance but does not affect how many rows are returned to the application.
    *
    * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
    *
    * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
    * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
    * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
    * JavaScript memory fragmentation may occur in some cases.
    *
    * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
    *
    * @default 100
    */
  var fetchArraySize: js.UndefOr[Double] = js.native
  /**
    * Defines how query column data should be represented in JavaScript. It can be used in conjunction with,
    * or instead of, the global settings fetchAsString and fetchAsBuffer.
    *
    * Example:
    *
    *      fetchInfo: {
    *          "HIRE_DATE":    { type: oracledb.STRING },  // return the date as a string
    *          "HIRE_DETAILS": { type: oracledb.DEFAULT }  // override fetchAsString or fetchAsBuffer
    *      }
    */
  var fetchInfo: js.UndefOr[Record[String, AnonType]] = js.native
  /**
    * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
    * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
    *
    * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
    * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
    *
    * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
    * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
    * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
    * maxRows limit.
    *
    * @default 0 (unlimited)
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * The format of query rows fetched when using connection.execute() or connection.queryStream().
    * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
    *
    * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
    *
    * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
    *
    * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
    * The object has a property for each column name, with the property value set to the respective column value.
    * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    *
    * @default ARRAY
    */
  var outFormat: js.UndefOr[Double] = js.native
  /**
    * Determines whether query results should be returned as a ResultSet object or directly.
    *
    * @default false
    */
  var resultSet: js.UndefOr[Boolean] = js.native
}

object ExecuteOptions {
  @scala.inline
  def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  @scala.inline
  implicit class ExecuteOptionsOps[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedMetaData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedMetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedMetaData")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchArraySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchArraySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchArraySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchArraySize")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchInfo(value: Record[String, AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(js.undefined)
        ret
    }
  }
  
}

