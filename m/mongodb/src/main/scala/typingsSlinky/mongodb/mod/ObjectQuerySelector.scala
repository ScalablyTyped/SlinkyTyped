package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.QuerySelector[T]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof T ]:? mongodb.mongodb.QuerySelector<T[key]>}
  * / typingsSlinky.mongodb.mongodbStrings.ObjectQuerySelector with org.scalablytyped.runtime.TopLevel[T]
*/
trait ObjectQuerySelector[T] extends js.Object

object ObjectQuerySelector {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? mongodb.mongodb.QuerySelector<T[key]>}
    */ typingsSlinky.mongodb.mongodbStrings.ObjectQuerySelector with TopLevel[T]
  ): ObjectQuerySelector[T] = value.asInstanceOf[ObjectQuerySelector[T]]
  @scala.inline
  implicit def apply[T](value: QuerySelector[T]): ObjectQuerySelector[T] = value.asInstanceOf[ObjectQuerySelector[T]]
}

