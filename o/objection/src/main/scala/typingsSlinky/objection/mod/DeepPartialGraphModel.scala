package typingsSlinky.objection.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objection.mod.GraphModel[
/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
  * / typingsSlinky.objection.objectionStrings.DeepPartialGraphModel with org.scalablytyped.runtime.TopLevel[T]]
  - typingsSlinky.std.Partial[T]
*/
trait DeepPartialGraphModel[T] extends DeepPartialGraph[T]

object DeepPartialGraphModel {
  @scala.inline
  implicit def apply[T](
    value: GraphModel[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ typingsSlinky.objection.objectionStrings.DeepPartialGraphModel with TopLevel[T]
    ]
  ): DeepPartialGraphModel[T] = value.asInstanceOf[DeepPartialGraphModel[T]]
  @scala.inline
  implicit def apply[T](value: Partial[T]): DeepPartialGraphModel[T] = value.asInstanceOf[DeepPartialGraphModel[T]]
}

