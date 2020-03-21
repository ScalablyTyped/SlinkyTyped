package typingsSlinky.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typingsSlinky.babelTypes.mod.Node
  type VisitNode[T, P] = (typingsSlinky.babelTraverse.mod.VisitNodeFunction[T, P]) | typingsSlinky.babelTraverse.mod.VisitNodeObject[T]
  type VisitNodeFunction[T, P] = js.ThisFunction2[
    /* this */ T, 
    /* path */ typingsSlinky.babelTraverse.mod.NodePath[P], 
    /* state */ js.Any, 
    scala.Unit
  ]
}
