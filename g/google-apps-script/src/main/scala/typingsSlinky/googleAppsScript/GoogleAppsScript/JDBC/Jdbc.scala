package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JDBC service allows scripts to connect to Google Cloud SQL, MySQL,
  * Microsoft SQL Server, and Oracle databases. For more information, see the guide to JDBC.
  */
@js.native
trait Jdbc extends js.Object {
  
  def getCloudSqlConnection(url: String): JdbcConnection = js.native
  def getCloudSqlConnection(url: String, info: CloudSqlAdvancedParameters): JdbcConnection = js.native
  def getCloudSqlConnection(url: String, userName: String, password: String): JdbcConnection = js.native
  
  def getConnection(url: String): JdbcConnection = js.native
  def getConnection(url: String, info: ConnectionAdvancedParameters): JdbcConnection = js.native
  def getConnection(url: String, userName: String, password: String): JdbcConnection = js.native
  
  def newDate(milliseconds: Integer): JdbcDate = js.native
  
  def newTime(milliseconds: Integer): JdbcTime = js.native
  
  def newTimestamp(milliseconds: Integer): JdbcTimestamp = js.native
  
  def parseDate(date: String): JdbcDate = js.native
  
  def parseTime(time: String): JdbcTime = js.native
  
  def parseTimestamp(timestamp: String): JdbcTimestamp = js.native
}
