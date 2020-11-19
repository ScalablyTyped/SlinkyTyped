package typingsSlinky.atlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FlattenedTree = js.Array[typingsSlinky.atlaskitTree.mod.FlattenedItem]
  
  type ItemId = js.Any
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Path = js.Array[scala.Double]
  
  type Tree = slinky.core.ReactComponentClass[typingsSlinky.atlaskitTree.mod.TreeProps]
  
  type TreeDraggableStyle = typingsSlinky.reactBeautifulDnd.mod.NotDraggingStyle | typingsSlinky.atlaskitTree.mod.TreeDraggingStyle
  
  type TreeItemData = js.Any
}
