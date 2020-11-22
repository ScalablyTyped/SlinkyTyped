package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.anon.RepoAny
import typingsSlinky.ipfsCore.componentsVersionMod.Version
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "version")
@js.native
object version
  extends TopLevel[
      js.Function1[
        /* hasRepo */ RepoAny, 
        js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]]
      ]
    ]
