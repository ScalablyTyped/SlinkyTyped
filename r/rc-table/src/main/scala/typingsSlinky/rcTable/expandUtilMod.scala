package typingsSlinky.rcTable

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
@js.native
object expandUtilMod extends js.Object {
  
  def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType], childrenColumnName: String): js.Array[Key] = js.native
  
  def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): ReactElement = js.native
}
