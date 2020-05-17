package typingsSlinky.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTraverse.mod.VisitNodeFunction[T, P]
  - typingsSlinky.babelTraverse.mod.VisitNodeObject[T]
*/
trait VisitNode[T, P] extends js.Object

object VisitNode {
  @scala.inline
  implicit def apply[T, P](value: VisitNodeFunction[T, P]): VisitNode[T, P] = value.asInstanceOf[VisitNode[T, P]]
  @scala.inline
  implicit def apply[T, P](value: VisitNodeObject[T]): VisitNode[T, P] = value.asInstanceOf[VisitNode[T, P]]
}

