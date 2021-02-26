package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.anon.PartialControlMessage
import typingsSlinky.libp2pGossipsub.messageMod.Message
import typingsSlinky.libp2pGossipsub.messageMod.RPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-gossipsub/src/utils", "createGossipRpc")
  @js.native
  def createGossipRpc(): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.UndefOr[scala.Nothing], control: PartialControlMessage): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.Array[Message]): RPC = js.native
  @JSImport("libp2p-gossipsub/src/utils", "createGossipRpc")
  @js.native
  def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = js.native
  
  @JSImport("libp2p-gossipsub/src/utils", "hasGossipProtocol")
  @js.native
  def hasGossipProtocol(protocol: String): Boolean = js.native
  
  @JSImport("libp2p-gossipsub/src/utils", "messageIdToString")
  @js.native
  def messageIdToString(msgId: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("libp2p-gossipsub/src/utils", "shuffle")
  @js.native
  def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native
}
