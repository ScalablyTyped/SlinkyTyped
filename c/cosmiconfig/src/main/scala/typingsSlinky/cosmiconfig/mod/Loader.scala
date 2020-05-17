package typingsSlinky.cosmiconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * filepath * / java.lang.String, 
/ * content * / java.lang.String, 
js.Promise[typingsSlinky.cosmiconfig.mod.LoaderResult]]
  - typingsSlinky.cosmiconfig.mod.LoaderSync
*/
trait Loader extends js.Object

object Loader {
  @scala.inline
  implicit def apply(
    value: (js.Function2[/* filepath */ String, /* content */ String, js.Promise[LoaderResult]]) | LoaderSync
  ): Loader = value.asInstanceOf[Loader]
}

