package typingsSlinky.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.anon.AddAll
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "add")
@js.native
object add
  extends TopLevel[
      js.Function1[
        /* hasAddAll */ AddAll, 
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
          /* options */ js.UndefOr[AddOptions with AbortOptions], 
          js.Promise[UnixFSEntry]
        ]
      ]
    ]
