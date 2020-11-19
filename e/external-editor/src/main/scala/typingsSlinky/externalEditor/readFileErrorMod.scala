package typingsSlinky.externalEditor

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("external-editor/main/errors/ReadFileError", JSImport.Namespace)
@js.native
object readFileErrorMod extends js.Object {
  
  @js.native
  class ReadFileError protected () extends Error {
    def this(originalError: js.Error) = this()
    
    var originalError: js.Error = js.native
  }
}
