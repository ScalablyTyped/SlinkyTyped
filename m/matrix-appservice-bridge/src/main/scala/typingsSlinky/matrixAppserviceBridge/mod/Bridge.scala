package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.bridgeMod.BridgeOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Bridge")
@js.native
class Bridge protected ()
  extends typingsSlinky.matrixAppserviceBridge.bridgeMod.Bridge {
  /**
    * @param opts Options to pass to the bridge
    * @param opts.roomUpgradeOpts Options to supply to
    * the room upgrade handler. If not defined then upgrades are NOT handled by the bridge.
    */
  def this(opts: BridgeOpts) = this()
}
