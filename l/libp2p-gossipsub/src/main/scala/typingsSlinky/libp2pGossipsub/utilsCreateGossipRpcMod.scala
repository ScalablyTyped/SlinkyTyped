package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.anon.PartialControlMessage
import typingsSlinky.libp2pGossipsub.messageMod.Message
import typingsSlinky.libp2pGossipsub.messageMod.RPC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/utils/createGossipRpc", JSImport.Namespace)
@js.native
object utilsCreateGossipRpcMod extends js.Object {
  
  def createGossipRpc(): RPC = js.native
  def createGossipRpc(msgs: js.UndefOr[scala.Nothing], control: PartialControlMessage): RPC = js.native
  def createGossipRpc(msgs: js.Array[Message]): RPC = js.native
  def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = js.native
}
