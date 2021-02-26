package typingsSlinky.ionic.definitionsMod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitCodeException extends Error {
  
  var exitCode: Double = js.native
}
object ExitCodeException {
  
  @scala.inline
  def apply(exitCode: Double, message: String, name: String): ExitCodeException = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitCodeException]
  }
  
  @scala.inline
  implicit class ExitCodeExceptionMutableBuilder[Self <: ExitCodeException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
