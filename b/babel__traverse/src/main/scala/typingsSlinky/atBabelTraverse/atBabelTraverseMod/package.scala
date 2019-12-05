package typingsSlinky.atBabelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelTraverseMod {
  import typingsSlinky.atBabelTypes.atBabelTypesMod.Aliases

  type Node = typingsSlinky.atBabelTypes.atBabelTypesMod.Node
  type VisitNode[S, P] = (VisitNodeFunction[S, P]) | (VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[/* this */ S, /* path */ NodePath[P], /* state */ S, Unit]
  type Visitor[S] = (VisitNodeObject[S, Node]) with typingsSlinky.atBabelTraverse.atBabelTraverseStrings.Visitor with js.Any with Aliases
}
