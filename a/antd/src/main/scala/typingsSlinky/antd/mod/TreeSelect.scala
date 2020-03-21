package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.AnonChoiceTransitionName
import typingsSlinky.antd.treeSelectMod.TreeSelectProps
import typingsSlinky.antd.treeSelectMod.default
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "TreeSelect")
@js.native
class TreeSelect[T] protected () extends default[T] {
  def this(props: TreeSelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "TreeSelect")
@js.native
object TreeSelect extends js.Object {
  var SHOW_ALL: String = js.native
  var SHOW_CHILD: String = js.native
  var SHOW_PARENT: String = js.native
  var TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  var defaultProps: AnonChoiceTransitionName = js.native
}

