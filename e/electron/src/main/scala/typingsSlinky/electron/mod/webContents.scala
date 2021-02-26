package typingsSlinky.electron.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WebContents` */
@JSImport("electron", "webContents")
@js.native
class webContents ()
  extends typingsSlinky.electron.Electron.WebContents_
/* was `typeof WebContents` */
object webContents {
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  /* static member */
  @JSImport("electron", "webContents.fromId")
  @js.native
  def fromId(id: Double): typingsSlinky.electron.Electron.WebContents_ = js.native
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  /* static member */
  @JSImport("electron", "webContents.getAllWebContents")
  @js.native
  def getAllWebContents(): js.Array[typingsSlinky.electron.Electron.WebContents_] = js.native
  
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  @JSImport("electron", "webContents.getFocusedWebContents")
  @js.native
  def getFocusedWebContents(): typingsSlinky.electron.Electron.WebContents_ = js.native
}
