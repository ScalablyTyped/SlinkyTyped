package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.anon.PartialControlMessage
import typingsSlinky.libp2pGossipsub.messageMod.Message
import typingsSlinky.libp2pGossipsub.messageMod.RPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateGossipRpcMod {
  
  @JSImport("libp2p-gossipsub/src/utils/createGossipRpc", "createGossipRpc")
  @js.native
  def createGossipRpc(): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils/createGossipRpc", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.UndefOr[scala.Nothing], control: PartialControlMessage): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils/createGossipRpc", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.Array[Message]): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils/createGossipRpc", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = js.native
}
