package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC ResultSetMetaData. For documentation of this class, see
  * java.sql.ResultSetMetaData.
  */
@js.native
trait JdbcResultSetMetaData extends js.Object {
  def getCatalogName(column: Integer): String = js.native
  def getColumnClassName(column: Integer): String = js.native
  def getColumnCount(): Integer = js.native
  def getColumnDisplaySize(column: Integer): Integer = js.native
  def getColumnLabel(column: Integer): String = js.native
  def getColumnName(column: Integer): String = js.native
  def getColumnType(column: Integer): Integer = js.native
  def getColumnTypeName(column: Integer): String = js.native
  def getPrecision(column: Integer): Integer = js.native
  def getScale(column: Integer): Integer = js.native
  def getSchemaName(column: Integer): String = js.native
  def getTableName(column: Integer): String = js.native
  def isAutoIncrement(column: Integer): Boolean = js.native
  def isCaseSensitive(column: Integer): Boolean = js.native
  def isCurrency(column: Integer): Boolean = js.native
  def isDefinitelyWritable(column: Integer): Boolean = js.native
  def isNullable(column: Integer): Integer = js.native
  def isReadOnly(column: Integer): Boolean = js.native
  def isSearchable(column: Integer): Boolean = js.native
  def isSigned(column: Integer): Boolean = js.native
  def isWritable(column: Integer): Boolean = js.native
}

object JdbcResultSetMetaData {
  @scala.inline
  def apply(
    getCatalogName: Integer => String,
    getColumnClassName: Integer => String,
    getColumnCount: () => Integer,
    getColumnDisplaySize: Integer => Integer,
    getColumnLabel: Integer => String,
    getColumnName: Integer => String,
    getColumnType: Integer => Integer,
    getColumnTypeName: Integer => String,
    getPrecision: Integer => Integer,
    getScale: Integer => Integer,
    getSchemaName: Integer => String,
    getTableName: Integer => String,
    isAutoIncrement: Integer => Boolean,
    isCaseSensitive: Integer => Boolean,
    isCurrency: Integer => Boolean,
    isDefinitelyWritable: Integer => Boolean,
    isNullable: Integer => Integer,
    isReadOnly: Integer => Boolean,
    isSearchable: Integer => Boolean,
    isSigned: Integer => Boolean,
    isWritable: Integer => Boolean
  ): JdbcResultSetMetaData = {
    val __obj = js.Dynamic.literal(getCatalogName = js.Any.fromFunction1(getCatalogName), getColumnClassName = js.Any.fromFunction1(getColumnClassName), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumnDisplaySize = js.Any.fromFunction1(getColumnDisplaySize), getColumnLabel = js.Any.fromFunction1(getColumnLabel), getColumnName = js.Any.fromFunction1(getColumnName), getColumnType = js.Any.fromFunction1(getColumnType), getColumnTypeName = js.Any.fromFunction1(getColumnTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), getSchemaName = js.Any.fromFunction1(getSchemaName), getTableName = js.Any.fromFunction1(getTableName), isAutoIncrement = js.Any.fromFunction1(isAutoIncrement), isCaseSensitive = js.Any.fromFunction1(isCaseSensitive), isCurrency = js.Any.fromFunction1(isCurrency), isDefinitelyWritable = js.Any.fromFunction1(isDefinitelyWritable), isNullable = js.Any.fromFunction1(isNullable), isReadOnly = js.Any.fromFunction1(isReadOnly), isSearchable = js.Any.fromFunction1(isSearchable), isSigned = js.Any.fromFunction1(isSigned), isWritable = js.Any.fromFunction1(isWritable))
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
  @scala.inline
  implicit class JdbcResultSetMetaDataOps[Self <: JdbcResultSetMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCatalogName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCatalogName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnClassName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnCount(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumnDisplaySize(value: Integer => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnDisplaySize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnLabel(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnType(value: Integer => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColumnTypeName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnTypeName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPrecision(value: Integer => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrecision")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScale(value: Integer => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSchemaName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSchemaName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTableName(value: Integer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAutoIncrement(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCaseSensitive(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCurrency(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDefinitelyWritable(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefinitelyWritable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNullable(value: Integer => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSearchable(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSigned(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSigned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWritable(value: Integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWritable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

