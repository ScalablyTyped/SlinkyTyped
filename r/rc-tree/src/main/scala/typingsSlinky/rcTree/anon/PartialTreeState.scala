package typingsSlinky.rcTree.anon

import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState> */
trait PartialTreeState extends js.Object {
  var activeKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.undefined
  var checkedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var dragNodesKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var dragOverNodeKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.undefined
  var dragging: js.UndefOr[Boolean] = js.undefined
  var dropPosition: js.UndefOr[Double] = js.undefined
  var expandedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var flattenNodes: js.UndefOr[js.Array[FlattenNode]] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var halfCheckedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var keyEntities: js.UndefOr[Record[typingsSlinky.rcTree.interfaceMod.Key, DataEntity]] = js.undefined
  var listChanging: js.UndefOr[Boolean] = js.undefined
  var loadedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var loadingKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var prevProps: js.UndefOr[TreeProps] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.undefined
  var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
}

object PartialTreeState {
  @scala.inline
  def apply(): PartialTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeState]
  }
  @scala.inline
  implicit class PartialTreeStateOps[Self <: PartialTreeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setCheckedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedKeys: Self = this.set("checkedKeys", js.undefined)
    @scala.inline
    def setDragNodesKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    @scala.inline
    def setDragNodesKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragNodesKeys: Self = this.set("dragNodesKeys", js.undefined)
    @scala.inline
    def setDragOverNodeKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOverNodeKey: Self = this.set("dragOverNodeKey", js.undefined)
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropPosition: Self = this.set("dropPosition", js.undefined)
    @scala.inline
    def setExpandedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode*): Self = this.set("flattenNodes", js.Array(value :_*))
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode]): Self = this.set("flattenNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenNodes: Self = this.set("flattenNodes", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHalfCheckedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfCheckedKeys: Self = this.set("halfCheckedKeys", js.undefined)
    @scala.inline
    def setKeyEntities(value: Record[typingsSlinky.rcTree.interfaceMod.Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyEntities: Self = this.set("keyEntities", js.undefined)
    @scala.inline
    def setListChanging(value: Boolean): Self = this.set("listChanging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListChanging: Self = this.set("listChanging", js.undefined)
    @scala.inline
    def setLoadedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedKeys: Self = this.set("loadedKeys", js.undefined)
    @scala.inline
    def setLoadingKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingKeys: Self = this.set("loadingKeys", js.undefined)
    @scala.inline
    def setPrevProps(value: TreeProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    @scala.inline
    def setSelectedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeData: Self = this.set("treeData", js.undefined)
  }
  
}

