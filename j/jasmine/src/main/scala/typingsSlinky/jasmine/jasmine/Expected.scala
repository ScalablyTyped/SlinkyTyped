package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.jasmine.jasmine.ObjectContaining[T]
  - typingsSlinky.jasmine.jasmine.AsymmetricMatcher[js.Any]
  - typingsSlinky.jasmine.jasmine.Any
  - typingsSlinky.jasmine.jasmine.Spy
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
  * / typingsSlinky.jasmine.jasmineStrings.Expected with org.scalablytyped.runtime.TopLevel[T]
*/
trait Expected[T] extends js.Object

object Expected {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typingsSlinky.jasmine.jasmineStrings.Expected with TopLevel[T]
  ): Expected[T] = value.asInstanceOf[Expected[T]]
  @scala.inline
  implicit def apply[T](value: Any): Expected[T] = value.asInstanceOf[Expected[T]]
  @scala.inline
  implicit def apply[T](value: AsymmetricMatcher[js.Any]): Expected[T] = value.asInstanceOf[Expected[T]]
  @scala.inline
  implicit def apply[T](value: ObjectContaining[T]): Expected[T] = value.asInstanceOf[Expected[T]]
  @scala.inline
  implicit def apply[T](value: Spy): Expected[T] = value.asInstanceOf[Expected[T]]
  @scala.inline
  implicit def apply[T](value: T): Expected[T] = value.asInstanceOf[Expected[T]]
}

