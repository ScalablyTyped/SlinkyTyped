package typingsSlinky.babelDashTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashTraverseMod {
  type Node = typingsSlinky.babelDashTypes.babelDashTypesMod.Node
  type VisitNode[T, P] = (VisitNodeFunction[T, P]) | VisitNodeObject[T]
  type VisitNodeFunction[T, P] = js.ThisFunction2[/* this */ T, /* path */ NodePath[P], /* state */ js.Any, Unit]
}
