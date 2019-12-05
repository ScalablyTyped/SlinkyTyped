package typingsSlinky.reactDashSortableDashTree

import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typingsSlinky.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typingsSlinky.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetNodeKeyIgnoreCollapsed extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var newNode: js.Function | js.Any
}

object Anon_GetNodeKeyIgnoreCollapsed {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: js.Function | js.Any,
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): Anon_GetNodeKeyIgnoreCollapsed = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GetNodeKeyIgnoreCollapsed]
  }
}

