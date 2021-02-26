package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Clob. For documentation of this class, see java.sql.Clob
  * .
  */
@js.native
trait JdbcClob extends StObject {
  
  def free(): Unit = js.native
  
  def getAppsScriptBlob(): Blob = js.native
  
  def getAs(contentType: String): Blob = js.native
  
  def getSubString(position: Integer, length: Integer): String = js.native
  
  def length(): Integer = js.native
  
  def position(search: String, start: Integer): Integer = js.native
  def position(search: JdbcClob, start: Integer): Integer = js.native
  
  def setString(position: Integer, blobSource: BlobSource): Integer = js.native
  def setString(position: Integer, blobSource: BlobSource, offset: Integer, len: Integer): Integer = js.native
  def setString(position: Integer, value: String): Integer = js.native
  def setString(position: Integer, value: String, offset: Integer, len: Integer): Integer = js.native
  
  def truncate(length: Integer): Unit = js.native
}
