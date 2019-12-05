package typingsSlinky.reactDashSortableDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSortableDashTreeMod {
  import slinky.core.ReactComponentClass

  type GetTreeItemChildrenFn = js.Function1[/* data */ GetTreeItemChildren, Unit]
  type NodeRenderer = ReactComponentClass[NodeRendererProps]
  type NumberOrStringArray = js.Array[String | Double]
  type PlaceholderRenderer = ReactComponentClass[PlaceholderRendererProps]
  type TreeRenderer = ReactComponentClass[TreeRendererProps]
}
