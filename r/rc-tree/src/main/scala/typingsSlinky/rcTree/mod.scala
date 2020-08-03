package typingsSlinky.rcTree

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.anon.AutoExpandParent
import typingsSlinky.rcTree.anon.PartialTreeState
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.rcTree.treeMod.TreeState
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.rcTree.treeMod.default
  
  val TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
    var defaultProps: AutoExpandParent = js.native
    def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
  }
  
}

