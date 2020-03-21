package typingsSlinky.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeDataUtilsMod {
  type GetNodeKeyFunction = js.Function1[
    /* data */ typingsSlinky.reactSortableTree.mod.TreeIndex with typingsSlinky.reactSortableTree.mod.TreeNode, 
    java.lang.String | scala.Double
  ]
}
