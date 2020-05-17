package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserView extends EventEmitter {
  var id: Double = js.native
  var webContents: WebContents_ = js.native
  /**
    * Force closing the view, the unload and beforeunload events won't be emitted for
    * the web page. After you're done with a view, call this function in order to free
    * memory and other resources as soon as possible.
    */
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def setAutoResize(options: AutoResizeOptions): Unit = js.native
  def setBackgroundColor(color: String): Unit = js.native
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    */
  def setBounds(bounds: Rectangle): Unit = js.native
}

