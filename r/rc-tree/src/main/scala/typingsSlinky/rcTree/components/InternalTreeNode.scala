package typingsSlinky.rcTree.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTree.contextTypesMod.TreeContextProps
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.treeNodeMod.InternalTreeNodeProps
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InternalTreeNode {
  
  @JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcTree.treeNodeMod.InternalTreeNode] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def context(value: TreeContextProps): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: DataNode): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domRef(value: Ref[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("domRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def domRefNull: this.type = set("domRef", null)
    
    @scala.inline
    def domRefRefObject(value: ReactRef[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragOver(value: Boolean): this.type = set("dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragOverGapBottom(value: Boolean): this.type = set("dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragOverGapTop(value: Boolean): this.type = set("dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventKey(value: Key): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def halfChecked(value: Boolean): this.type = set("halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEnd(value: js.Array[Boolean]): this.type = set("isEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEndVarargs(value: Boolean*): this.type = set("isEnd", js.Array(value :_*))
    
    @scala.inline
    def isLeaf(value: Boolean): this.type = set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isStart(value: js.Array[Boolean]): this.type = set("isStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isStartVarargs(value: Boolean*): this.type = set("isStart", js.Array(value :_*))
    
    @scala.inline
    def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def pos(value: String): this.type = set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement | (js.Function1[/* data */ DataNode, ReactElement])): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFunction1(value: /* data */ DataNode => ReactElement): this.type = set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InternalTreeNode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InternalTreeNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
