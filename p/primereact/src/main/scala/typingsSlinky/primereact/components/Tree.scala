package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.NodeOriginalEvent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.treeMod.TreeProps
import typingsSlinky.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  @JSImport("primereact/tree", "Tree")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTreeMod.Tree] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenuSelectionKey(value: js.Any): this.type = set("contextMenuSelectionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dragdropScope(value: String): this.type = set("dragdropScope", value.asInstanceOf[js.Any])
    @scala.inline
    def expandedKeys(value: js.Any): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def filterBy(value: js.Any): this.type = set("filterBy", value.asInstanceOf[js.Any])
    @scala.inline
    def filterMode(value: String): this.type = set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIcon(value: String): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeTemplate(value: /* node */ js.Any => ReactElement): this.type = set("nodeTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def onCollapse(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenuSelectionChange(value: /* e */ Value => Unit): this.type = set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDragDrop(value: /* e */ Value => Unit): this.type = set("onDragDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onExpand(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onSelectionChange(value: /* e */ Value => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def onToggle(value: /* e */ Value => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def onUnselect(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def propagateSelectionDown(value: Boolean): this.type = set("propagateSelectionDown", value.asInstanceOf[js.Any])
    @scala.inline
    def propagateSelectionUp(value: Boolean): this.type = set("propagateSelectionUp", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionKeys(value: js.Any): this.type = set("selectionKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[TreeNode]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

