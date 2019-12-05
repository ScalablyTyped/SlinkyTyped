package typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod

import typingsSlinky.atBlueprintjsTable.Anon_ChildrenArray
import typingsSlinky.atBlueprintjsTable.libEsmCommonContextMod.IColumnInteractionBarContextTypes
import typingsSlinky.atBlueprintjsTable.libEsmTableMod.ITableProps
import typingsSlinky.atBlueprintjsTable.libEsmTableMod.ITableState
import typingsSlinky.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Table")
@js.native
class Table protected ()
  extends typingsSlinky.atBlueprintjsTable.libEsmTableMod.Table {
  def this(props: ITableProps) = this()
  def this(props: ITableProps, context: js.Any) = this()
}

/* static members */
@JSImport("@blueprintjs/table", "Table")
@js.native
object Table extends js.Object {
  var SHALLOW_COMPARE_PROP_KEYS_BLACKLIST: js.Any = js.native
  var SHALLOW_COMPARE_STATE_KEYS_BLACKLIST: js.Any = js.native
  var childContextTypes: ValidationMap[IColumnInteractionBarContextTypes] = js.native
  var createColumnIdIndex: js.Any = js.native
  var defaultProps: ITableProps = js.native
  var displayName: String = js.native
  var isSelectionModeEnabled: js.Any = js.native
  var resizeRowsByApproximateHeightDefaults: js.Any = js.native
  def getDerivedStateFromProps(props: ITableProps, state: ITableState): Anon_ChildrenArray = js.native
}

