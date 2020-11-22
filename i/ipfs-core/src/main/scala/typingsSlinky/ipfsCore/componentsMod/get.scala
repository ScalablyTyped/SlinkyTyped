package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.IpldPreload
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "get")
@js.native
object get
  extends TopLevel[
      js.Function1[
        /* hasIpldPreload */ IpldPreload, 
        js.Function2[
          /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
          /* options */ js.UndefOr[GetOptions with AbortOptions], 
          AsyncIterable[File | Directory]
        ]
      ]
    ]
