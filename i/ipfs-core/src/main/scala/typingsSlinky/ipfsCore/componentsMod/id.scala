package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.Libp2pPeerId
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "id")
@js.native
object id
  extends TopLevel[
      js.Function1[
        /* hasPeerIdLibp2p */ Libp2pPeerId, 
        js.Function1[
          /* _options */ js.UndefOr[AbortOptions], 
          js.Promise[typingsSlinky.ipfsCore.idMod.PeerId]
        ]
      ]
    ]
