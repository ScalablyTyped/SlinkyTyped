package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.objection.mod.DeepPartialGraphModel[T]
  - typingsSlinky.objection.mod.DeepPartialGraphArray[
/ * import warning: importer.ImportType#apply Failed type conversion: T[number] * / js.Any]
*/
trait DeepPartialGraph[T] extends js.Object

object DeepPartialGraph {
  @scala.inline
  implicit def apply[T](
    value: DeepPartialGraphArray[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ): DeepPartialGraph[T] = value.asInstanceOf[DeepPartialGraph[T]]
  @scala.inline
  implicit def apply[T](value: DeepPartialGraphModel[T]): DeepPartialGraph[T] = value.asInstanceOf[DeepPartialGraph[T]]
  @scala.inline
  implicit def apply[T](value: T): DeepPartialGraph[T] = value.asInstanceOf[DeepPartialGraph[T]]
}

