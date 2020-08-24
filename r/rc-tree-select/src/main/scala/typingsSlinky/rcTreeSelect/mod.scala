package typingsSlinky.rcTreeSelect

import slinky.core.ReactComponentClass
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default[ValueType] ()
    extends typingsSlinky.rcTreeSelect.treeSelectMod.default[ValueType]
  
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  /** This is a placeholder, not real render in dom */
  val TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var SHOW_ALL: /* "SHOW_ALL" */ String = js.native
    var SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    var SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  }
  
}

