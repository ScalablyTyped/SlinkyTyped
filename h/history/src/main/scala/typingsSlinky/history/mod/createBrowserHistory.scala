package typingsSlinky.history.mod

import typingsSlinky.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("history", "createBrowserHistory")
@js.native
object createBrowserHistory extends js.Object {
  
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}
