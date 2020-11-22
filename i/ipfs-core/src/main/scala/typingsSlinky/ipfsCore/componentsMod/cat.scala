package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.IpldPreload
import typingsSlinky.ipfsCore.catMod.CatOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "cat")
@js.native
object cat
  extends TopLevel[
      js.Function1[
        /* hasIpldPreload */ IpldPreload, 
        js.Function2[
          /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
          /* options */ js.UndefOr[CatOptions with AbortOptions], 
          AsyncIterable[js.typedarray.Uint8Array]
        ]
      ]
    ]
