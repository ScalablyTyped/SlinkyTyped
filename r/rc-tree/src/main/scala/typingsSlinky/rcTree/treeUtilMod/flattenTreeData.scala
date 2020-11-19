package typingsSlinky.rcTree.treeUtilMod

import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
@js.native
object flattenTreeData extends js.Object {
  
  def apply(): js.Array[FlattenNode] = js.native
  def apply(treeNodeList: js.UndefOr[scala.Nothing], expandedKeys: js.Array[Key]): js.Array[FlattenNode] = js.native
  def apply(treeNodeList: js.Array[DataNode]): js.Array[FlattenNode] = js.native
  def apply(treeNodeList: js.Array[DataNode], expandedKeys: js.Array[Key]): js.Array[FlattenNode] = js.native
}
