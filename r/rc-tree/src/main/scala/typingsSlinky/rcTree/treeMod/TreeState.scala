package typingsSlinky.rcTree.treeMod

import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeState extends js.Object {
  var activeKey: Key
  var checkedKeys: js.Array[Key]
  var dragNodesKeys: js.Array[Key]
  var dragOverNodeKey: Key
  var dragging: Boolean
  var dropPosition: Double
  var expandedKeys: js.Array[Key]
  var flattenNodes: js.Array[FlattenNode]
  var focused: Boolean
  var halfCheckedKeys: js.Array[Key]
  var keyEntities: Record[Key, DataEntity]
  var listChanging: Boolean
  var loadedKeys: js.Array[Key]
  var loadingKeys: js.Array[Key]
  var prevProps: TreeProps
  var selectedKeys: js.Array[Key]
  var treeData: js.Array[DataNode]
}

object TreeState {
  @scala.inline
  def apply(
    activeKey: Key,
    checkedKeys: js.Array[Key],
    dragNodesKeys: js.Array[Key],
    dragOverNodeKey: Key,
    dragging: Boolean,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    flattenNodes: js.Array[FlattenNode],
    focused: Boolean,
    halfCheckedKeys: js.Array[Key],
    keyEntities: Record[Key, DataEntity],
    listChanging: Boolean,
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    prevProps: TreeProps,
    selectedKeys: js.Array[Key],
    treeData: js.Array[DataNode]
  ): TreeState = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], flattenNodes = flattenNodes.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], listChanging = listChanging.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeState]
  }
  @scala.inline
  implicit class TreeStateOps[Self <: TreeState] (val x: Self) extends AnyVal {
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
    def setActiveKey(value: Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragNodesKeysVarargs(value: Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    @scala.inline
    def setDragNodesKeys(value: js.Array[Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverNodeKey(value: Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode*): Self = this.set("flattenNodes", js.Array(value :_*))
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode]): Self = this.set("flattenNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setListChanging(value: Boolean): Self = this.set("listChanging", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedKeysVarargs(value: Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingKeysVarargs(value: Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevProps(value: TreeProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
  }
  
}

