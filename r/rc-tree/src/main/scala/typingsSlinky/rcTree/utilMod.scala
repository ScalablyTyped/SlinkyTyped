package typingsSlinky.rcTree

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.anon.Checked
import typingsSlinky.rcTree.anon.ProcessProps
import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.interfaceMod.NodeElement
import typingsSlinky.rcTree.interfaceMod.NodeInstance
import typingsSlinky.rcTree.rcTreeNumbers.`-1`
import typingsSlinky.rcTree.rcTreeNumbers.`0`
import typingsSlinky.rcTree.rcTreeNumbers.`1`
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def arrAdd(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  def arrDel(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  def calcDropPosition(event: SyntheticMouseEvent[Element], treeNode: NodeInstance): `1` | `-1` | `0` = js.native
  def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps): js.Array[String | Double] = js.native
  def conductExpandParent(keyList: js.Array[Key], keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = js.native
  def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = js.native
  def getDataAndAria(props: Partial[TreeProps | TreeNodeProps]): Record[String, String] = js.native
  def getDragNodesKeys(dragNodeKey: Key, keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  def getPosition(level: String, index: Double): String = js.native
  def getPosition(level: Double, index: Double): String = js.native
  def isTreeNode(node: NodeElement): Boolean = js.native
  def parseCheckedKeys(keys: js.Array[Key]): js.Any = js.native
  def parseCheckedKeys(keys: Checked): js.Any = js.native
  def posToArr(pos: String): js.Array[String] = js.native
}

