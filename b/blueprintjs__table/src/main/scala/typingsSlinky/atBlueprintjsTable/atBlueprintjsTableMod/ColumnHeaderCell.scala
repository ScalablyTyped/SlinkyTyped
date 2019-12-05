package typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atBlueprintjsTable.libEsmCommonContextMod.IColumnInteractionBarContextTypes
import typingsSlinky.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnHeaderCellProps
import typingsSlinky.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends typingsSlinky.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod.ColumnHeaderCell

/* static members */
@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
object ColumnHeaderCell extends js.Object {
  var contextTypes: ValidationMap[IColumnInteractionBarContextTypes] = js.native
  var defaultProps: IColumnHeaderCellProps = js.native
  /**
    * This method determines if a `MouseEvent` was triggered on a target that
    * should be used as the header click/drag target. This enables users of
    * this component to render fully interactive components in their header
    * cells without worry of selection or resize operations from capturing
    * their mouse events.
    */
  def isHeaderMouseTarget(target: HTMLElement): Boolean = js.native
}

