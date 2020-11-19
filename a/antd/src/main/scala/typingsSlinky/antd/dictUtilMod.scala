package typingsSlinky.antd

import typingsSlinky.antd.anon.EndKey
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/tree/utils/dictUtil", JSImport.Namespace)
@js.native
object dictUtilMod extends js.Object {
  
  def calcRangeKeys(hasTreeDataExpandedKeysStartKeyEndKey: EndKey): js.Array[Key] = js.native
  
  def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key]): js.Array[DataNode] = js.native
}
