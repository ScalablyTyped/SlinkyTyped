package typingsSlinky.rcTable

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandUtilMod {
  
  @JSImport("rc-table/lib/utils/expandUtil", "findAllChildrenKeys")
  @js.native
  def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType], childrenColumnName: String): js.Array[Key] = js.native
  
  @JSImport("rc-table/lib/utils/expandUtil", "renderExpandIcon")
  @js.native
  def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): ReactElement = js.native
}
