package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "dns")
@js.native
object dns
  extends TopLevel[
      js.Function0[
        js.Function2[
          /* domain */ String, 
          /* options */ js.UndefOr[DNSSettings with AbortOptions], 
          js.Promise[String]
        ]
      ]
    ]
