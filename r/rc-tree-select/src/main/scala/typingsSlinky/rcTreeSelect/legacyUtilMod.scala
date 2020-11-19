package typingsSlinky.rcTreeSelect

import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.interfaceMod.ChangeEventExtra
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.InnerDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree-select/es/utils/legacyUtil", JSImport.Namespace)
@js.native
object legacyUtilMod extends js.Object {
  
  def convertChildrenToData(nodes: ReactElement): js.Array[DataNode] = js.native
  
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[InnerDataNode],
    showPosition: Boolean
  ): Unit = js.native
  
  def fillLegacyProps(dataNode: DataNode): LegacyDataNode = js.native
}
