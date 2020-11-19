package typingsSlinky.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alks-node", "createKey")
@js.native
object createKey extends js.Object {
  
  def apply(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* key */ KeyData, Unit]
  ): Unit = js.native
}
