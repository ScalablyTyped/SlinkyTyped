package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNodeProps
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @JSImport("@blueprintjs/core", "TreeNode")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.TreeNode[T]] {
    
    @scala.inline
    def childNodesVarargs(value: ITreeNode[T]*): this.type = set("childNodes", js.Array(value :_*))
    
    @scala.inline
    def childNodes(value: js.Array[ITreeNode[T]]): this.type = set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentRef(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* element */ HTMLDivElement | Null) => Unit
    ): this.type = set("contentRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasCaret(value: Boolean): this.type = set("hasCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconNull: this.type = set("icon", null)
    
    @scala.inline
    def isExpanded(value: Boolean): this.type = set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeData(value: T): this.type = set("nodeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCollapse(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit
    ): this.type = set("onCollapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onContextMenu(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): this.type = set("onContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDoubleClick(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): this.type = set("onDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onExpand(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit
    ): this.type = set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseLeave(
      value: (/* node */ typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def secondaryLabelReactElement(value: ReactElement): this.type = set("secondaryLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryLabel(value: String | MaybeElement): this.type = set("secondaryLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryLabelNull: this.type = set("secondaryLabel", null)
  }
  
  def withProps[T](p: ITreeNodeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](depth: Double, id: String | Double, label: String | ReactElement, path: js.Array[Double]): Builder[T] = {
    val __props = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ITreeNodeProps[T]]))
  }
}
