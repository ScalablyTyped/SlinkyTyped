package typingsSlinky.rcTree.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.motionTreeNodeMod.MotionTreeNodeProps
import typingsSlinky.rcTree.rcTreeStrings.hide
import typingsSlinky.rcTree.rcTreeStrings.show
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.rcTree.treeUtilMod.TreeNodeRequiredProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MotionTreeNode {
  
  @JSImport("rc-tree/es/MotionTreeNode", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: DataNode): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
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
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEndVarargs(value: Boolean*): this.type = set("isEnd", js.Array(value :_*))
    
    @scala.inline
    def isEnd(value: js.Array[Boolean]): this.type = set("isEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLeaf(value: Boolean): this.type = set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isStartVarargs(value: Boolean*): this.type = set("isStart", js.Array(value :_*))
    
    @scala.inline
    def isStart(value: js.Array[Boolean]): this.type = set("isStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(value: js.Any): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionNodesVarargs(value: FlattenNode*): this.type = set("motionNodes", js.Array(value :_*))
    
    @scala.inline
    def motionNodes(value: js.Array[FlattenNode]): this.type = set("motionNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionType(value: show | hide): this.type = set("motionType", value.asInstanceOf[js.Any])
    
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
    def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFunction1(value: /* data */ DataNode => ReactElement): this.type = set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: ReactElement | (js.Function1[/* data */ DataNode, ReactElement])): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MotionTreeNodeProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    active: Boolean,
    onMotionEnd: () => Unit,
    onMotionStart: () => Unit,
    treeNodeRequiredProps: TreeNodeRequiredProps
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onMotionEnd = js.Any.fromFunction0(onMotionEnd), onMotionStart = js.Any.fromFunction0(onMotionStart), treeNodeRequiredProps = treeNodeRequiredProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MotionTreeNodeProps with RefAttributes[HTMLDivElement]]))
  }
}
