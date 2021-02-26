package typingsSlinky.rcTree.anon

import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState> */
@js.native
trait PartialTreeState extends StObject {
  
  var activeKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var checkedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var dragNodesKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var dragOverNodeKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var dragging: js.UndefOr[Boolean] = js.native
  
  var dropPosition: js.UndefOr[Double] = js.native
  
  var expandedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var flattenNodes: js.UndefOr[js.Array[FlattenNode]] = js.native
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var halfCheckedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var keyEntities: js.UndefOr[Record[typingsSlinky.rcTree.interfaceMod.Key, DataEntity]] = js.native
  
  var listChanging: js.UndefOr[Boolean] = js.native
  
  var loadedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var loadingKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var prevProps: js.UndefOr[TreeProps] = js.native
  
  var selectedKeys: js.UndefOr[js.Array[typingsSlinky.rcTree.interfaceMod.Key]] = js.native
  
  var treeData: js.UndefOr[js.Array[DataNode]] = js.native
}
object PartialTreeState {
  
  @scala.inline
  def apply(): PartialTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeState]
  }
  
  @scala.inline
  implicit class PartialTreeStateMutableBuilder[Self <: PartialTreeState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setCheckedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
    
    @scala.inline
    def setCheckedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragNodesKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragNodesKeysUndefined: Self = StObject.set(x, "dragNodesKeys", js.undefined)
    
    @scala.inline
    def setDragNodesKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragOverNodeKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverNodeKeyUndefined: Self = StObject.set(x, "dragOverNodeKey", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    @scala.inline
    def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    @scala.inline
    def setExpandedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenNodesUndefined: Self = StObject.set(x, "flattenNodes", js.undefined)
    
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode*): Self = StObject.set(x, "flattenNodes", js.Array(value :_*))
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setKeyEntities(value: Record[typingsSlinky.rcTree.interfaceMod.Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEntitiesUndefined: Self = StObject.set(x, "keyEntities", js.undefined)
    
    @scala.inline
    def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListChangingUndefined: Self = StObject.set(x, "listChanging", js.undefined)
    
    @scala.inline
    def setLoadedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
    
    @scala.inline
    def setLoadedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadingKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingKeysUndefined: Self = StObject.set(x, "loadingKeys", js.undefined)
    
    @scala.inline
    def setLoadingKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrevProps(value: TreeProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    @scala.inline
    def setSelectedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
