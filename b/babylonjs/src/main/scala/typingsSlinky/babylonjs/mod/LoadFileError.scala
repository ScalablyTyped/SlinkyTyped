package typingsSlinky.babylonjs.mod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "LoadFileError")
@js.native
class LoadFileError protected ()
  extends typingsSlinky.babylonjs.legacyMod.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    * @param file defines the optional file
    */
  def this(message: String) = this()
  def this(message: String, `object`: typingsSlinky.babylonjs.webRequestMod.WebRequest) = this()
  def this(message: String, `object`: File) = this()
}

