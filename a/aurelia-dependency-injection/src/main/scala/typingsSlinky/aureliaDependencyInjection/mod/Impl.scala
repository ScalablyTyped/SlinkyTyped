package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aureliaDependencyInjection.mod.CtorImpl[TBase]
  - typingsSlinky.aureliaDependencyInjection.mod.FuncReturns[TBase]
*/
trait Impl[TBase] extends js.Object

object Impl {
  @scala.inline
  implicit def apply[TBase](value: CtorImpl[TBase] | FuncReturns[TBase]): Impl[TBase] = value.asInstanceOf[Impl[TBase]]
}

