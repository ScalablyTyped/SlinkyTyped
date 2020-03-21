package typingsSlinky.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetTreeItemChildrenFn = js.Function1[/* data */ typingsSlinky.reactSortableTree.mod.GetTreeItemChildren, scala.Unit]
  type NodeRenderer = slinky.core.ReactComponentClass[typingsSlinky.reactSortableTree.mod.NodeRendererProps]
  type NumberOrStringArray = js.Array[java.lang.String | scala.Double]
  type PlaceholderRenderer = slinky.core.ReactComponentClass[typingsSlinky.reactSortableTree.mod.PlaceholderRendererProps]
  type TreeRenderer = slinky.core.ReactComponentClass[typingsSlinky.reactSortableTree.mod.TreeRendererProps]
}
