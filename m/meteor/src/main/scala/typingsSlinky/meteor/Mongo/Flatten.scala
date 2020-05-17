package typingsSlinky.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - / * import warning: importer.ImportType#apply Failed type conversion: T[0] * / js.Any
*/
trait Flatten[T] extends js.Object

object Flatten {
  @scala.inline
  implicit def apply[T](value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Flatten[T] = value.asInstanceOf[Flatten[T]]
  @scala.inline
  implicit def apply[T](value: T): Flatten[T] = value.asInstanceOf[Flatten[T]]
}

