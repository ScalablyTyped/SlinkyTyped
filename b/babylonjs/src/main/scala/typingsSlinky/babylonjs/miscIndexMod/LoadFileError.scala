package typingsSlinky.babylonjs.miscIndexMod

import org.scalajs.dom.raw.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "LoadFileError")
@js.native
class LoadFileError protected ()
  extends typingsSlinky.babylonjs.fileToolsMod.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    * @param file defines the optional file
    */
  def this(message: String) = this()
  def this(message: String, `object`: File) = this()
  def this(message: String, `object`: typingsSlinky.babylonjs.webRequestMod.WebRequest) = this()
}
