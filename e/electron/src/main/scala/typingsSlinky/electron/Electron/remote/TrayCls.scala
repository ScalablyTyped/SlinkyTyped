package typingsSlinky.electron.Electron.remote

import typingsSlinky.electron.Electron.NativeImage
import typingsSlinky.electron.Electron.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.remote.Tray")
@js.native
class TrayCls protected () extends Tray {
  def this(image: String) = this()
  def this(image: NativeImage) = this()
}

