package typingsSlinky.hexoFs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "access")
@js.native
object access
  extends TopLevel[
      js.UndefOr[
        js.Function2[
          /* path */ PathLike, 
          /* mode */ js.UndefOr[Double], 
          typingsSlinky.bluebird.mod.^[Unit]
        ]
      ]
    ]
