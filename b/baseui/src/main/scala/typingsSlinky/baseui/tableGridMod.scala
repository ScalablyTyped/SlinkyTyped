package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.tableMod.SortableHeadCellProps
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableGridMod {
  
  @JSImport("baseui/table-grid", "SORT_DIRECTION")
  @js.native
  object SORT_DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.baseui.tableMod.SORT_DIRECTION with String] = js.native
    
    /* "ASC" */ val ASC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    
    /* "DESC" */ val DESC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
  }
  
  @JSImport("baseui/table-grid", "SortableHeadCell")
  @js.native
  val SortableHeadCell: ReactComponentClass[SortableHeadCellProps] = js.native
  
  @JSImport("baseui/table-grid", "StyledBodyCell")
  @js.native
  val StyledBodyCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-grid", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-grid", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
}
