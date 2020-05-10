package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ReadFileError")
@js.native
class ReadFileError protected () extends BaseError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
  var file: File = js.native
}

