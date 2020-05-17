package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aureliaDependencyInjection.mod.CtorArgs[TBase]
  - typingsSlinky.aureliaDependencyInjection.mod.FuncArgs[TBase]
*/
trait Args[TBase] extends js.Object

object Args {
  @scala.inline
  implicit def apply[TBase](value: CtorArgs[TBase] | FuncArgs[TBase]): Args[TBase] = value.asInstanceOf[Args[TBase]]
}

