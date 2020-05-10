package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeViewMod {
  type TGetId = js.Function1[
    /* node */ typingsSlinky.baseui.treeViewMod.TreeNode, 
    java.lang.String | scala.Double
  ]
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[typingsSlinky.baseui.treeViewMod.TreeNode], 
    /* togggledNode */ typingsSlinky.baseui.treeViewMod.TreeNode, 
    /* getId */ js.UndefOr[typingsSlinky.baseui.treeViewMod.TGetId], 
    js.Array[typingsSlinky.baseui.treeViewMod.TreeNode]
  ]
}
