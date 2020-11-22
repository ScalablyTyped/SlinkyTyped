package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.IpldName
import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "resolve")
@js.native
object resolve
  extends TopLevel[
      js.Function1[
        /* hasIpldName */ IpldName, 
        js.Function2[
          /* path */ String, 
          /* opts */ js.UndefOr[ResolveSettings with AbortOptions], 
          js.Promise[String]
        ]
      ]
    ]
