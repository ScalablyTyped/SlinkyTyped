package typingsSlinky.rcTree

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.anon.AutoExpandParent
import typingsSlinky.rcTree.anon.PartialTreeState
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.rcTree.treeMod.TreeState
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  
  @js.native
  class default ()
    extends typingsSlinky.rcTree.treeMod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
    
    var defaultProps: AutoExpandParent = js.native
    
    def getDerivedStateFromProps(props: TreeProps, prevState: TreeState): PartialTreeState = js.native
  }
}
