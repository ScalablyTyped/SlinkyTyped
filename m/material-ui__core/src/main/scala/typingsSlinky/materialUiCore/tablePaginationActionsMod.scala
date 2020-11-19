package typingsSlinky.materialUiCore

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUiCore.anon.PartialIconButtonProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Namespace)
@js.native
object tablePaginationActionsMod extends js.Object {
  
  val default: ReactComponentClass[TablePaginationActionsProps] = js.native
  
  @js.native
  trait TablePaginationActionsProps extends HTMLAttributes[HTMLDivElement] {
    
    var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    
    var count: Double = js.native
    
    var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    
    def onChangePage(event: Null, page: Double): Unit = js.native
    def onChangePage(event: SyntheticMouseEvent[HTMLButtonElement], page: Double): Unit = js.native
    
    var page: Double = js.native
    
    var rowsPerPage: Double = js.native
  }
}
