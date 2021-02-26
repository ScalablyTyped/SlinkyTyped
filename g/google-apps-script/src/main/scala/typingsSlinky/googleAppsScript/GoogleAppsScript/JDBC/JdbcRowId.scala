package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
@js.native
trait JdbcRowId extends StObject {
  
  def getBytes(): js.Array[Byte] = js.native
}
object JdbcRowId {
  
  @scala.inline
  def apply(getBytes: () => js.Array[Byte]): JdbcRowId = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes))
    __obj.asInstanceOf[JdbcRowId]
  }
  
  @scala.inline
  implicit class JdbcRowIdMutableBuilder[Self <: JdbcRowId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBytes(value: () => js.Array[Byte]): Self = StObject.set(x, "getBytes", js.Any.fromFunction0(value))
  }
}
