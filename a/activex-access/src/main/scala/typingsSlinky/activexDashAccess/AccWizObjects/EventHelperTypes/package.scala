package typingsSlinky.activexDashAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.SourceCtlName
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.SourceFieldList
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.SourceRow
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.State
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.TargetCtlName
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.TargetFieldList
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.TargetRow
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.X
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.Y

  type FieldList_DragOver_ArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, State, X, Y]
  type FieldList_FldListDragDrop_ArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow]
  type FieldList_FldListDragOver_ArgNames = js.Tuple7[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow, State]
}
