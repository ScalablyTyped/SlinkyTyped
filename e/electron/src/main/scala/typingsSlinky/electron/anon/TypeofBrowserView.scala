package typingsSlinky.electron.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.Electron.BrowserView
import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import typingsSlinky.electron.Electron.WebContents_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBrowserView
  extends Instantiable0[BrowserView]
     with Instantiable1[/* options */ BrowserViewConstructorOptions, BrowserView] {
  
  /**
    * The view with the given `id`.
    */
  def fromId(id: Double): BrowserView = js.native
  
  /**
    * The BrowserView that owns the given `webContents` or `null` if the contents are
    * not owned by a BrowserView.
    */
  def fromWebContents(webContents: WebContents_): BrowserView | Null = js.native
  
  /**
    * An array of all opened BrowserViews.
    */
  def getAllViews(): js.Array[BrowserView] = js.native
}
