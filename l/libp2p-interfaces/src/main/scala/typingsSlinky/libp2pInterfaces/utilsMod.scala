package typingsSlinky.libp2pInterfaces

import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "anyMatch")
  @js.native
  def anyMatch(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  @JSImport("libp2p-interfaces/src/pubsub/utils", "anyMatch")
  @js.native
  def anyMatch(a: js.Array[_], b: Set[_]): Boolean = js.native
  @JSImport("libp2p-interfaces/src/pubsub/utils", "anyMatch")
  @js.native
  def anyMatch(a: Set[_], b: js.Array[_]): Boolean = js.native
  @JSImport("libp2p-interfaces/src/pubsub/utils", "anyMatch")
  @js.native
  def anyMatch(a: Set[_], b: Set[_]): Boolean = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "ensureArray")
  @js.native
  def ensureArray(maybeArray: js.Any): js.Array[_] = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "msgId")
  @js.native
  def msgId(from: String, seqno: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "noSignMsgId")
  @js.native
  def noSignMsgId(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "normalizeInRpcMessage")
  @js.native
  def normalizeInRpcMessage(message: js.Any, peerId: String): js.Any = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "normalizeOutRpcMessage")
  @js.native
  def normalizeOutRpcMessage(message: js.Any): js.Any = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/utils", "randomSeqno")
  @js.native
  def randomSeqno(): js.typedarray.Uint8Array = js.native
}
