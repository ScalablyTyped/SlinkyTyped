package typingsSlinky.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "WebContents")
@js.native
class WebContents_ ()
  extends typingsSlinky.electron.Electron.WebContents_
/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents_ extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  def fromId(id: Double): typingsSlinky.electron.Electron.WebContents_ = js.native
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  def getAllWebContents(): js.Array[typingsSlinky.electron.Electron.WebContents_] = js.native
  
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  def getFocusedWebContents(): typingsSlinky.electron.Electron.WebContents_ = js.native
}
