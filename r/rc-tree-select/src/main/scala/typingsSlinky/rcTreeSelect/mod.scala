package typingsSlinky.rcTreeSelect

import slinky.core.ReactComponentClass
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default[ValueType] ()
    extends typingsSlinky.rcTreeSelect.treeSelectMod.default[ValueType]
  
  val SHOW_ALL: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
  val SHOW_CHILD: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
  val SHOW_PARENT: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
  /** This is a placeholder, not real render in dom */
  val TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var SHOW_ALL: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
    var SHOW_CHILD: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
    var SHOW_PARENT: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
    var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  }
  
}

