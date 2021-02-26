package typingsSlinky.antd.anon

import typingsSlinky.rcTree.interfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndKey extends StObject {
  
  var endKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var expandedKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var startKey: js.UndefOr[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var treeData: js.Array[DataNode] = js.native
}
object EndKey {
  
  @scala.inline
  def apply(expandedKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key], treeData: js.Array[DataNode]): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
  
  @scala.inline
  implicit class EndKeyMutableBuilder[Self <: EndKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setStartKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
