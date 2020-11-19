package typingsSlinky.nodeBrowserHistory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-browser-history", "getSeaMonkeyHistory")
@js.native
object getSeaMonkeyHistory extends js.Object {
  
  def apply(): js.Promise[js.Array[BrowserHistory]] = js.native
  def apply(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
}
