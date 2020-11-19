package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LoadFileError")
@js.native
class LoadFileError protected ()
  extends typingsSlinky.babylonjs.BABYLON.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    * @param file defines the optional file
    */
  def this(message: String) = this()
  def this(message: String, `object`: typingsSlinky.babylonjs.BABYLON.WebRequest) = this()
  def this(message: String, `object`: File) = this()
}
