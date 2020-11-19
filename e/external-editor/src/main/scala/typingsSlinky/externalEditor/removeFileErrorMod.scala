package typingsSlinky.externalEditor

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("external-editor/main/errors/RemoveFileError", JSImport.Namespace)
@js.native
object removeFileErrorMod extends js.Object {
  
  @js.native
  class RemoveFileError protected () extends Error {
    def this(originalError: js.Error) = this()
    
    var originalError: js.Error = js.native
  }
}
