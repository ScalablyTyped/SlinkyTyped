package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnActionsMode extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnActionsMode with Double] = js.native
  
  /** Renders the column header as clickable. Default value. */
  @js.native
  sealed trait clickable extends ColumnActionsMode
  /* 1 */ val clickable: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
  
  /** Renders the column header as disabled. */
  @js.native
  sealed trait disabled extends ColumnActionsMode
  /* 0 */ val disabled: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
  
  /** Renders the column header as clickable and displays the dropdown chevron. */
  @js.native
  sealed trait hasDropdown extends ColumnActionsMode
  /* 2 */ val hasDropdown: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
}
