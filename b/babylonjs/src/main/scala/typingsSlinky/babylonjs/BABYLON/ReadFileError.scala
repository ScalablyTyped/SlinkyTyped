package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.File
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadFileError extends Error {
  
  var file: File = js.native
}
object ReadFileError {
  
  @scala.inline
  def apply(file: File, message: String, name: String): ReadFileError = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileError]
  }
  
  @scala.inline
  implicit class ReadFileErrorMutableBuilder[Self <: ReadFileError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
