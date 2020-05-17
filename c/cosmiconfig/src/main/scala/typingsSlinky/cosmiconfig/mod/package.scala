package typingsSlinky.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoaderSync = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    typingsSlinky.cosmiconfig.mod.LoaderResult
  ]
  type TransformSync = js.Function1[
    /* CosmiconfigResult */ typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult, 
    typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult
  ]
}
