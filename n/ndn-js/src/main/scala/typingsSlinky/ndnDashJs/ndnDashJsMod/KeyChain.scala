package typingsSlinky.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "KeyChain")
@js.native
class KeyChain ()
  extends typingsSlinky.ndnDashJs.keyDashChainMod.KeyChain {
  def this(pibLocator: String, tpmLocator: String) = this()
  def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
}

/* static members */
@JSImport("ndn-js", "KeyChain")
@js.native
object KeyChain extends js.Object {
  def getDefaultKeyParams(): typingsSlinky.ndnDashJs.keyDashChainMod.KeyParams = js.native
}

