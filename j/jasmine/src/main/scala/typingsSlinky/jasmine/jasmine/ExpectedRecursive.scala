package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.jasmine.jasmine.ObjectContaining[T]
  - typingsSlinky.jasmine.jasmine.AsymmetricMatcher[js.Any]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
  * / typingsSlinky.jasmine.jasmineStrings.ExpectedRecursive with org.scalablytyped.runtime.TopLevel[js.Any]
*/
trait ExpectedRecursive[T] extends js.Object

object ExpectedRecursive {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typingsSlinky.jasmine.jasmineStrings.ExpectedRecursive with TopLevel[js.Any]
  ): ExpectedRecursive[T] = value.asInstanceOf[ExpectedRecursive[T]]
  @scala.inline
  implicit def apply[T](value: AsymmetricMatcher[js.Any]): ExpectedRecursive[T] = value.asInstanceOf[ExpectedRecursive[T]]
  @scala.inline
  implicit def apply[T](value: ObjectContaining[T]): ExpectedRecursive[T] = value.asInstanceOf[ExpectedRecursive[T]]
  @scala.inline
  implicit def apply[T](value: T): ExpectedRecursive[T] = value.asInstanceOf[ExpectedRecursive[T]]
}

