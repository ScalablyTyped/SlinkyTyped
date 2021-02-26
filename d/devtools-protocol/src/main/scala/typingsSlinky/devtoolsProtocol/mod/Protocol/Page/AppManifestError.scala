package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppManifestError extends StObject {
  
  /**
    * Error column.
    */
  var column: integer = js.native
  
  /**
    * If criticial, this is a non-recoverable parse error.
    */
  var critical: integer = js.native
  
  /**
    * Error line.
    */
  var line: integer = js.native
  
  /**
    * Error message.
    */
  var message: String = js.native
}
object AppManifestError {
  
  @scala.inline
  def apply(column: integer, critical: integer, line: integer, message: String): AppManifestError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifestError]
  }
  
  @scala.inline
  implicit class AppManifestErrorMutableBuilder[Self <: AppManifestError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: integer): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: integer): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
