package typingsSlinky.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends typingsSlinky.electron.Electron.Tray {
  def this(image: String) = this()
  /**
    * Tray
    */
  def this(image: typingsSlinky.electron.Electron.NativeImage_) = this()
  def this(image: String, guid: String) = this()
  def this(image: typingsSlinky.electron.Electron.NativeImage_, guid: String) = this()
}

