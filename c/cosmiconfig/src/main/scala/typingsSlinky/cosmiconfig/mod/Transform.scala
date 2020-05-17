package typingsSlinky.cosmiconfig.mod

import typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * CosmiconfigResult * / typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult, 
js.Promise[typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult]]
  - typingsSlinky.cosmiconfig.mod.TransformSync
*/
trait Transform extends js.Object

object Transform {
  @scala.inline
  implicit def apply(
    value: (js.Function1[/* CosmiconfigResult */ CosmiconfigResult, js.Promise[CosmiconfigResult]]) | TransformSync
  ): Transform = value.asInstanceOf[Transform]
}

