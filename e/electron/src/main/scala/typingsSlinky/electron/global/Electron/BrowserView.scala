package typingsSlinky.electron.global.Electron

import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView ()
  extends typingsSlinky.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}
/* static members */
@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  
  /**
    * The view with the given `id`.
    */
  def fromId(id: Double): typingsSlinky.electron.Electron.BrowserView = js.native
  
  /**
    * The BrowserView that owns the given `webContents` or `null` if the contents are
    * not owned by a BrowserView.
    */
  def fromWebContents(webContents: typingsSlinky.electron.Electron.WebContents_): typingsSlinky.electron.Electron.BrowserView | Null = js.native
  
  /**
    * An array of all opened BrowserViews.
    */
  def getAllViews(): js.Array[typingsSlinky.electron.Electron.BrowserView] = js.native
}
