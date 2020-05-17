package typingsSlinky.meteor.checkMod.Match

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[K]> * / object}
  * / typingsSlinky.meteor.meteorStrings.PatternMatch with org.scalablytyped.runtime.TopLevel[js.Any]
  - js.Array[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> * / js.Object]
  - T
  - js.Function
  - scala.Boolean
  - scala.Double
  - java.lang.String
*/
trait PatternMatch[T /* <: Pattern */] extends js.Object

object PatternMatch {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[K]> * / object}
    */ typingsSlinky.meteor.meteorStrings.PatternMatch with TopLevel[js.Any]
  ): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: js.Any): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](
    value: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> */ js.Object
    ]
  ): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: Boolean): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: Double): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: js.Function): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: String): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
  @scala.inline
  implicit def apply[T](value: T): PatternMatch[T] = value.asInstanceOf[PatternMatch[T]]
}

