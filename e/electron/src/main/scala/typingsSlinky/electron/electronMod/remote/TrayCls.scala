package typingsSlinky.electron.electronMod.remote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote.Tray")
@js.native
class TrayCls protected ()
  extends typingsSlinky.electron.Electron.Tray {
  def this(image: String) = this()
  def this(image: typingsSlinky.electron.Electron.NativeImage) = this()
}

