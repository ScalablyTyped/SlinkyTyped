package typingsSlinky.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.Electron.BrowserView
import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import typingsSlinky.electron.Electron.WebContents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBrowserView
  extends Instantiable0[BrowserView]
     with Instantiable1[/* options */ BrowserViewConstructorOptions, BrowserView] {
  def fromId(id: Double): BrowserView = js.native
  def fromWebContents(webContents: WebContents): BrowserView | Null = js.native
  def getAllViews(): js.Array[BrowserView] = js.native
}

