package typingsSlinky.rcTable

import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.LegacyExpandableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/legacyUtil", JSImport.Namespace)
@js.native
object legacyUtilMod extends js.Object {
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  def getDataAndAriaProps(props: js.Object): js.Object = js.native
  def getExpandableProps[RecordType](props: LegacyExpandableProps[RecordType] with AnonExpandable[RecordType]): ExpandableConfig[RecordType] = js.native
}

