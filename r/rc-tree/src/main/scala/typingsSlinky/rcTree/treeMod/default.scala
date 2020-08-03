package typingsSlinky.rcTree.treeMod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.anon.AutoExpandParent
import typingsSlinky.rcTree.anon.PartialTreeState
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/Tree", JSImport.Default)
@js.native
class default () extends Tree

/* static members */
@JSImport("rc-tree/es/Tree", JSImport.Default)
@js.native
object default extends js.Object {
  var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  var defaultProps: AutoExpandParent = js.native
  def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
}

