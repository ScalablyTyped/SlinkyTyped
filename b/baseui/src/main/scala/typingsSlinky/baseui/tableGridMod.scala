package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.tableMod.SortableHeadCellProps
import typingsSlinky.styletronReact.mod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/table-grid", JSImport.Namespace)
@js.native
object tableGridMod extends js.Object {
  
  val SortableHeadCell: ReactComponentClass[SortableHeadCellProps] = js.native
  
  val StyledBodyCell: StyletronComponent[js.Any] = js.native
  
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  
  val StyledTable: StyletronComponent[js.Any] = js.native
  
  @js.native
  object SORT_DIRECTION extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.baseui.tableMod.SORT_DIRECTION with String] = js.native
    
    /* "ASC" */ val ASC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    
    /* "DESC" */ val DESC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
  }
}
