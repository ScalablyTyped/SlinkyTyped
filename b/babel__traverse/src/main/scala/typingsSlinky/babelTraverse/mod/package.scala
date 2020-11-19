package typingsSlinky.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends std.Array<any>? P : never}[keyof T] */ js.Any
  
  type Node = typingsSlinky.babelTypes.mod.Node
  
  type NodePaths[T /* <: typingsSlinky.babelTraverse.mod.Node | js.Array[typingsSlinky.babelTraverse.mod.Node] */] = js.Array[typingsSlinky.babelTraverse.mod.NodePath[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
    */ typingsSlinky.babelTraverse.babelTraverseStrings.NodePaths with org.scalablytyped.runtime.TopLevel[T])
  
  type VisitNode[S, P] = (typingsSlinky.babelTraverse.mod.VisitNodeFunction[S, P]) | (typingsSlinky.babelTraverse.mod.VisitNodeObject[S, P])
  
  type VisitNodeFunction[S, P] = js.ThisFunction2[
    /* this */ S, 
    /* path */ typingsSlinky.babelTraverse.mod.NodePath[P], 
    /* state */ S, 
    scala.Unit
  ]
}
