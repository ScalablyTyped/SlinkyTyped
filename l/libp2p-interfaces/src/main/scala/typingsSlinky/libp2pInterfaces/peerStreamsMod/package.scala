package typingsSlinky.libp2pInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object peerStreamsMod {
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  type Sink = js.Function1[/* source */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]
}
