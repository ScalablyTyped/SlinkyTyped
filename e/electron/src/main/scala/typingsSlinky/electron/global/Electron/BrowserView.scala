package typingsSlinky.electron.global.Electron

import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView ()
  extends typingsSlinky.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}

/* static members */
@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: Double): typingsSlinky.electron.Electron.BrowserView = js.native
  def fromWebContents(webContents: typingsSlinky.electron.Electron.WebContents_): typingsSlinky.electron.Electron.BrowserView | Null = js.native
  def getAllViews(): js.Array[typingsSlinky.electron.Electron.BrowserView] = js.native
}

