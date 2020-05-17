package typingsSlinky.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.0<T>[T extends lazy.js.LazyJS.Sequence<any> ? 0 : 1] * / js.Any
  - T
*/
trait Flatten[T, Shallow /* <: Boolean */] extends js.Object

object Flatten {
  @scala.inline
  implicit def apply[T, Shallow](
    value: /* import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.0<T>[T extends lazy.js.LazyJS.Sequence<any> ? 0 : 1] */ js.Any
  ): Flatten[T, Shallow] = value.asInstanceOf[Flatten[T, Shallow]]
  @scala.inline
  implicit def apply[T, Shallow](value: T): Flatten[T, Shallow] = value.asInstanceOf[Flatten[T, Shallow]]
}

