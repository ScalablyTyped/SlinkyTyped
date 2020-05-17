package typingsSlinky.loadware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - F
  - typingsSlinky.loadware.mod.RecursiveLoadable[F]
*/
trait Loadable[F /* <: AnyFunction */] extends js.Object

object Loadable {
  @scala.inline
  implicit def apply[F](value: F): Loadable[F] = value.asInstanceOf[Loadable[F]]
  @scala.inline
  implicit def apply[F](value: RecursiveLoadable[F]): Loadable[F] = value.asInstanceOf[Loadable[F]]
  @scala.inline
  implicit def apply[F](value: String): Loadable[F] = value.asInstanceOf[Loadable[F]]
}

