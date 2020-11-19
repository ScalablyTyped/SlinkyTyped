package typingsSlinky.agGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends typingsSlinky.agGrid.columnGroupMod.ColumnGroup {
  def this(
    originalColumnGroup: typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup,
    groupId: String,
    instanceId: Double
  ) = this()
}
/* static members */
@JSImport("ag-grid", "ColumnGroup")
@js.native
object ColumnGroup extends js.Object {
  
  var EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
  
  var EVENT_LEFT_CHANGED: String = js.native
  
  var HEADER_GROUP_SHOW_CLOSED: String = js.native
  
  var HEADER_GROUP_SHOW_OPEN: String = js.native
  
  def createUniqueId(groupId: String, instanceId: Double): String = js.native
}
