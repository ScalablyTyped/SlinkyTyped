package typingsSlinky.externalEditor

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor/main/errors/CreateFileError", JSImport.Namespace)
@js.native
object createFileErrorMod extends js.Object {
  @js.native
  class CreateFileError protected () extends Error {
    def this(originalError: js.Error) = this()
    var originalError: js.Error = js.native
  }
  
}

