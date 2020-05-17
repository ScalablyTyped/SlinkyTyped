package typingsSlinky.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTraverse.mod.VisitNodeFunction[S, P]
  - typingsSlinky.babelTraverse.mod.VisitNodeObject[S, P]
*/
trait VisitNode[S, P] extends js.Object

object VisitNode {
  @scala.inline
  implicit def apply[S, P](value: VisitNodeFunction[S, P]): VisitNode[S, P] = value.asInstanceOf[VisitNode[S, P]]
  @scala.inline
  implicit def apply[S, P](value: VisitNodeObject[S, P]): VisitNode[S, P] = value.asInstanceOf[VisitNode[S, P]]
}

