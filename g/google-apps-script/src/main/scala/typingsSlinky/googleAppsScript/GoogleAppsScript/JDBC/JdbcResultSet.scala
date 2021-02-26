package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.BigNumber
import typingsSlinky.googleAppsScript.GoogleAppsScript.Byte
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC ResultSet. For documentation of this class, see java.sql.ResultSet
  * .
  */
@js.native
trait JdbcResultSet extends StObject {
  
  def absolute(row: Integer): Boolean = js.native
  
  def afterLast(): Unit = js.native
  
  def beforeFirst(): Unit = js.native
  
  def cancelRowUpdates(): Unit = js.native
  
  def clearWarnings(): Unit = js.native
  
  def close(): Unit = js.native
  
  def deleteRow(): Unit = js.native
  
  def findColumn(columnLabel: String): Integer = js.native
  
  def first(): Boolean = js.native
  
  def getArray(columnIndex: Integer): JdbcArray = js.native
  def getArray(columnLabel: String): JdbcArray = js.native
  
  def getBigDecimal(columnIndex: Integer): BigNumber = js.native
  def getBigDecimal(columnLabel: String): BigNumber = js.native
  
  def getBlob(columnIndex: Integer): JdbcBlob = js.native
  def getBlob(columnLabel: String): JdbcBlob = js.native
  
  def getBoolean(columnIndex: Integer): Boolean = js.native
  def getBoolean(columnLabel: String): Boolean = js.native
  
  def getByte(columnIndex: Integer): Byte = js.native
  def getByte(columnLabel: String): Byte = js.native
  
  def getBytes(columnIndex: Integer): js.Array[Byte] = js.native
  def getBytes(columnLabel: String): js.Array[Byte] = js.native
  
  def getClob(columnIndex: Integer): JdbcClob = js.native
  def getClob(columnLabel: String): JdbcClob = js.native
  
  def getConcurrency(): Integer = js.native
  
  def getCursorName(): String = js.native
  
  def getDate(columnIndex: Integer): JdbcDate = js.native
  def getDate(columnIndex: Integer, timeZone: String): JdbcDate = js.native
  def getDate(columnLabel: String): JdbcDate = js.native
  def getDate(columnLabel: String, timeZone: String): JdbcDate = js.native
  
  def getDouble(columnIndex: Integer): Double = js.native
  def getDouble(columnLabel: String): Double = js.native
  
  def getFetchDirection(): Integer = js.native
  
  def getFetchSize(): Integer = js.native
  
  def getFloat(columnIndex: Integer): Double = js.native
  def getFloat(columnLabel: String): Double = js.native
  
  def getHoldability(): Integer = js.native
  
  def getInt(columnIndex: Integer): Integer = js.native
  def getInt(columnLabel: String): Integer = js.native
  
  def getLong(columnIndex: Integer): Integer = js.native
  def getLong(columnLabel: String): Integer = js.native
  
  def getMetaData(): JdbcResultSetMetaData = js.native
  
  def getNClob(columnIndex: Integer): JdbcClob = js.native
  def getNClob(columnLabel: String): JdbcClob = js.native
  
  def getNString(columnIndex: Integer): String = js.native
  def getNString(columnLabel: String): String = js.native
  
  def getObject(columnIndex: Integer): js.Any = js.native
  def getObject(columnLabel: String): js.Any = js.native
  
  def getRef(columnIndex: Integer): JdbcRef = js.native
  def getRef(columnLabel: String): JdbcRef = js.native
  
  def getRow(): Integer = js.native
  
  def getRowId(columnIndex: Integer): JdbcRowId = js.native
  def getRowId(columnLabel: String): JdbcRowId = js.native
  
  def getSQLXML(columnIndex: Integer): JdbcSQLXML = js.native
  def getSQLXML(columnLabel: String): JdbcSQLXML = js.native
  
  def getShort(columnIndex: Integer): Integer = js.native
  def getShort(columnLabel: String): Integer = js.native
  
  def getStatement(): JdbcStatement = js.native
  
  def getString(columnIndex: Integer): String = js.native
  def getString(columnLabel: String): String = js.native
  
  def getTime(columnIndex: Integer): JdbcTime = js.native
  def getTime(columnIndex: Integer, timeZone: String): JdbcTime = js.native
  def getTime(columnLabel: String): JdbcTime = js.native
  def getTime(columnLabel: String, timeZone: String): JdbcTime = js.native
  
  def getTimestamp(columnIndex: Integer): JdbcTimestamp = js.native
  def getTimestamp(columnIndex: Integer, timeZone: String): JdbcTimestamp = js.native
  def getTimestamp(columnLabel: String): JdbcTimestamp = js.native
  def getTimestamp(columnLabel: String, timeZone: String): JdbcTimestamp = js.native
  
  def getType(): Integer = js.native
  
  def getURL(columnIndex: Integer): String = js.native
  def getURL(columnLabel: String): String = js.native
  
  def getWarnings(): js.Array[String] = js.native
  
  def insertRow(): Unit = js.native
  
  def isAfterLast(): Boolean = js.native
  
  def isBeforeFirst(): Boolean = js.native
  
  def isClosed(): Boolean = js.native
  
  def isFirst(): Boolean = js.native
  
  def isLast(): Boolean = js.native
  
  def last(): Boolean = js.native
  
  def moveToCurrentRow(): Unit = js.native
  
  def moveToInsertRow(): Unit = js.native
  
  def next(): Boolean = js.native
  
  def previous(): Boolean = js.native
  
  def refreshRow(): Unit = js.native
  
  def relative(rows: Integer): Boolean = js.native
  
  def rowDeleted(): Boolean = js.native
  
  def rowInserted(): Boolean = js.native
  
  def rowUpdated(): Boolean = js.native
  
  def setFetchDirection(direction: Integer): Unit = js.native
  
  def setFetchSize(rows: Integer): Unit = js.native
  
  def updateArray(columnIndex: Integer, x: JdbcArray): Unit = js.native
  def updateArray(columnLabel: String, x: JdbcArray): Unit = js.native
  
  def updateBigDecimal(columnIndex: Integer, x: BigNumber): Unit = js.native
  def updateBigDecimal(columnLabel: String, x: BigNumber): Unit = js.native
  
  def updateBlob(columnIndex: Integer, x: JdbcBlob): Unit = js.native
  def updateBlob(columnLabel: String, x: JdbcBlob): Unit = js.native
  
  def updateBoolean(columnIndex: Integer, x: Boolean): Unit = js.native
  def updateBoolean(columnLabel: String, x: Boolean): Unit = js.native
  
  def updateByte(columnIndex: Integer, x: Byte): Unit = js.native
  def updateByte(columnLabel: String, x: Byte): Unit = js.native
  
  def updateBytes(columnIndex: Integer, x: js.Array[Byte]): Unit = js.native
  def updateBytes(columnLabel: String, x: js.Array[Byte]): Unit = js.native
  
  def updateClob(columnIndex: Integer, x: JdbcClob): Unit = js.native
  def updateClob(columnLabel: String, x: JdbcClob): Unit = js.native
  
  def updateDate(columnIndex: Integer, x: JdbcDate): Unit = js.native
  def updateDate(columnLabel: String, x: JdbcDate): Unit = js.native
  
  def updateDouble(columnIndex: Integer, x: Double): Unit = js.native
  def updateDouble(columnLabel: String, x: Double): Unit = js.native
  
  def updateFloat(columnIndex: Integer, x: Double): Unit = js.native
  def updateFloat(columnLabel: String, x: Double): Unit = js.native
  
  def updateInt(columnIndex: Integer, x: Integer): Unit = js.native
  def updateInt(columnLabel: String, x: Integer): Unit = js.native
  
  def updateLong(columnIndex: Integer, x: Integer): Unit = js.native
  def updateLong(columnLabel: String, x: Integer): Unit = js.native
  
  def updateNClob(columnIndex: Integer, x: JdbcClob): Unit = js.native
  def updateNClob(columnLabel: String, x: JdbcClob): Unit = js.native
  
  def updateNString(columnIndex: Integer, x: String): Unit = js.native
  def updateNString(columnLabel: String, x: String): Unit = js.native
  
  def updateNull(columnIndex: Integer): Unit = js.native
  def updateNull(columnLabel: String): Unit = js.native
  
  def updateObject(columnIndex: Integer, x: js.Any): Unit = js.native
  def updateObject(columnIndex: Integer, x: js.Any, scaleOrLength: Integer): Unit = js.native
  def updateObject(columnLabel: String, x: js.Any): Unit = js.native
  def updateObject(columnLabel: String, x: js.Any, scaleOrLength: Integer): Unit = js.native
  
  def updateRef(columnIndex: Integer, x: JdbcRef): Unit = js.native
  def updateRef(columnLabel: String, x: JdbcRef): Unit = js.native
  
  def updateRow(): Unit = js.native
  
  def updateRowId(columnIndex: Integer, x: JdbcRowId): Unit = js.native
  def updateRowId(columnLabel: String, x: JdbcRowId): Unit = js.native
  
  def updateSQLXML(columnIndex: Integer, x: JdbcSQLXML): Unit = js.native
  def updateSQLXML(columnLabel: String, x: JdbcSQLXML): Unit = js.native
  
  def updateShort(columnIndex: Integer, x: Integer): Unit = js.native
  def updateShort(columnLabel: String, x: Integer): Unit = js.native
  
  def updateString(columnIndex: Integer, x: String): Unit = js.native
  def updateString(columnLabel: String, x: String): Unit = js.native
  
  def updateTime(columnIndex: Integer, x: JdbcTime): Unit = js.native
  def updateTime(columnLabel: String, x: JdbcTime): Unit = js.native
  
  def updateTimestamp(columnIndex: Integer, x: JdbcTimestamp): Unit = js.native
  def updateTimestamp(columnLabel: String, x: JdbcTimestamp): Unit = js.native
  
  def wasNull(): Boolean = js.native
}
