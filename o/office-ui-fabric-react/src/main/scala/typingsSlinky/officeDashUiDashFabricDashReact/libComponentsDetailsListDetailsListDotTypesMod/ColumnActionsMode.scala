package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnActionsMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends js.Object {
  /**
    * Renders the column header is clickable.
    */
  @js.native
  sealed trait clickable extends ColumnActionsMode
  
  /**
    * Renders the column header as disabled.
    */
  @js.native
  sealed trait disabled extends ColumnActionsMode
  
  /**
    * Renders the column header ias clickable and displays the dropdown cheveron.
    */
  @js.native
  sealed trait hasDropdown extends ColumnActionsMode
  
  /* 1 */ val clickable: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.clickable with Double = js.native
  /* 0 */ val disabled: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.disabled with Double = js.native
  /* 2 */ val hasDropdown: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnActionsMode with Double] = js.native
}

