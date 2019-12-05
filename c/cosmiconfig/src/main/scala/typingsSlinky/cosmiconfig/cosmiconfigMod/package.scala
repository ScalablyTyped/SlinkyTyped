package typingsSlinky.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cosmiconfigMod {
  import typingsSlinky.cosmiconfig.distTypesMod.Config
  import typingsSlinky.cosmiconfig.distTypesMod.CosmiconfigResult

  type Loader = (js.Function2[/* filepath */ String, /* content */ String, js.Promise[LoaderResult]]) | LoaderSync
  type LoaderResult = Config | Null
  type LoaderSync = js.Function2[/* filepath */ String, /* content */ String, LoaderResult]
  type Transform = (js.Function1[/* CosmiconfigResult */ CosmiconfigResult, js.Promise[CosmiconfigResult]]) | TransformSync
  type TransformSync = js.Function1[/* CosmiconfigResult */ CosmiconfigResult, CosmiconfigResult]
}
