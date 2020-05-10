package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.treeViewMod.TreeNode
import typingsSlinky.baseui.treeViewMod.TreeViewOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_TreeViewProps_1705561772 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def getId(value: /* node */ TreeNode => Double | String): this.type = set("getId", js.Any.fromFunction1(value))
  @scala.inline
  def indentGuides(value: Boolean): this.type = set("indentGuides", value.asInstanceOf[js.Any])
  @scala.inline
  def onToggle(value: /* node */ TreeNode => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
  @scala.inline
  def overrides(value: TreeViewOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  @scala.inline
  def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  @scala.inline
  def singleExpanded(value: Boolean): this.type = set("singleExpanded", value.asInstanceOf[js.Any])
}

