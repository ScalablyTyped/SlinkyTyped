package typingsSlinky.atAtlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAtlaskitTreeMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.NotDraggingStyle
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type FlattenedTree = js.Array[FlattenedItem]
  type ItemId = js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Path = js.Array[Double]
  type Tree = ReactComponentClass[TreeProps]
  type TreeDraggableStyle = NotDraggingStyle | TreeDraggingStyle
  type TreeItemData = js.Any
}
