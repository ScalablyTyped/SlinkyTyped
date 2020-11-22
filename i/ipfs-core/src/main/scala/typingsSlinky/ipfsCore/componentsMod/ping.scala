package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.Libp2pAny
import typingsSlinky.ipfsCore.pingMod.PingFailure
import typingsSlinky.ipfsCore.pingMod.PingSettings
import typingsSlinky.ipfsCore.pingMod.Pong
import typingsSlinky.ipfsCore.pingMod.StatusUpdate
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "ping")
@js.native
object ping
  extends TopLevel[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function2[
          /* peerId */ typingsSlinky.peerId.mod.^, 
          /* options */ js.UndefOr[PingSettings with AbortOptions], 
          AsyncIterable[Pong | PingFailure | StatusUpdate]
        ]
      ]
    ]
