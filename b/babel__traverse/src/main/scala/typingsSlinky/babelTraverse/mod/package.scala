package typingsSlinky.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typingsSlinky.babelTypes.mod.Node
  type NodePaths[T /* <: typingsSlinky.babelTraverse.mod.Node | js.Array[typingsSlinky.babelTraverse.mod.Node] */] = js.Array[typingsSlinky.babelTraverse.mod.NodePath[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
    */ typingsSlinky.babelTraverse.babelTraverseStrings.NodePaths with T)
  type VisitNode[S, P] = (typingsSlinky.babelTraverse.mod.VisitNodeFunction[S, P]) | (typingsSlinky.babelTraverse.mod.VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[
    /* this */ S, 
    /* path */ typingsSlinky.babelTraverse.mod.NodePath[P], 
    /* state */ S, 
    scala.Unit
  ]
  type Visitor[S] = (typingsSlinky.babelTraverse.mod.VisitNodeObject[S, typingsSlinky.babelTraverse.mod.Node]) with typingsSlinky.babelTraverse.babelTraverseStrings.Visitor with js.Any with typingsSlinky.babelTypes.mod.Aliases
}
