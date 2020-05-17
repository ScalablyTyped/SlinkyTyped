package typingsSlinky.babelTraverse.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.babelTraverse.mod.NodePath[T]]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
  * / typingsSlinky.babelTraverse.babelTraverseStrings.NodePaths with org.scalablytyped.runtime.TopLevel[T]
*/
trait NodePaths[T /* <: Node | js.Array[Node] */] extends js.Object

object NodePaths {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
    */ typingsSlinky.babelTraverse.babelTraverseStrings.NodePaths with TopLevel[T]
  ): NodePaths[T] = value.asInstanceOf[NodePaths[T]]
  @scala.inline
  implicit def apply[T](value: js.Array[NodePath[T]]): NodePaths[T] = value.asInstanceOf[NodePaths[T]]
}

