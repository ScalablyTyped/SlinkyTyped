package typingsSlinky.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents_ ()
  extends typingsSlinky.electron.Electron.WebContents_

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typingsSlinky.electron.Electron.WebContents_ = js.native
  def getAllWebContents(): js.Array[typingsSlinky.electron.Electron.WebContents_] = js.native
  def getFocusedWebContents(): typingsSlinky.electron.Electron.WebContents_ = js.native
}

