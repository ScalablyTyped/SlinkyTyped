package typingsSlinky.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wantlistForPeerMod {
  
  type CID = typingsSlinky.cids.mod.^
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  type WantlistForPeer[ExtraOptions] = js.Function2[
    /* peerId */ typingsSlinky.ipfsCore.wantlistForPeerMod.PeerId | typingsSlinky.ipfsCore.wantlistForPeerMod.CID | java.lang.String | js.typedarray.Uint8Array, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions with ExtraOptions], 
    js.Promise[js.Array[typingsSlinky.ipfsCore.wantlistForPeerMod.CID]]
  ]
}
