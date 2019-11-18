package typingsSlinky.electron.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends typingsSlinky.electron.Electron.Tray {
  def this(image: String) = this()
  def this(image: typingsSlinky.electron.Electron.NativeImage) = this()
}

