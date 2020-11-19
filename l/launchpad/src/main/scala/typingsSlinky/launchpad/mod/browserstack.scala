package typingsSlinky.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("launchpad", "browserstack")
@js.native
object browserstack extends js.Object {
  
  def apply(authCreds: BrowserstackAuth, cb: js.Function2[/* err */ js.Any, /* browserstack */ Launcher, Unit]): Unit = js.native
}
